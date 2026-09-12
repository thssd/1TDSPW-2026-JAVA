package br.com.fiap.dao;

import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao() throws SQLException, ClassNotFoundException {
        connection = ConnectionFactory.getConnection();
    }

    //CRUD (Create, Read, Update, Delete)
    public void cadastrar(Produto produto) throws SQLException {
        //Criar o comando SQL
        PreparedStatement stmt = connection
                .prepareStatement("insert into t_jdbc_produto (cd_produto, " +
                        "nm_produto, ds_produto, vl_produto, st_estoque) " +
                        "values (sq_jdbc_produto.nextval, ?, ?, ?, ?)", new String[]{"cd_produto"});
        //Setar os paramentros no comando SQL
        stmt.setString(1, produto.getNome());
        stmt.setString(2, produto.getDescricao());
        stmt.setDouble(3, produto.getValor());
        stmt.setBoolean(4, produto.isEmEstoque());
        //Executar o comando SQL no banco
        stmt.executeUpdate();
        //Recuperar o id gerado
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.next()){
            int codigo = resultSet.getInt(1);
            produto.setCodigo(codigo);
        }
    }

    public Produto buscar(int id) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o Comando SQL
        PreparedStatement stmt = connection.prepareStatement(
                "select * from t_jdbc_produto where cd_produto = ?");
        //Setar o valor no comando SQL
        stmt.setInt(1, id);
        //Executar o comando SQL
        ResultSet resultSet = stmt.executeQuery(); //Executa comandos de pesquisa
        //Validar se existe um produto no resultado, se não existir lança uma exception
        if (!resultSet.next()){
            throw new EntidadeNaoEncontradaException("Produto não encontrado");
        }
        return getProduto(resultSet);
    }

    public List<Produto> buscarPorPreco(double preco) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o Comando SQL
        PreparedStatement stmt = connection.prepareStatement(
                "select * from t_jdbc_produto where vl_produto > ?");
        //Setar o valor no comando SQL
        stmt.setDouble(1, preco);
        //Executar o comando SQL
        ResultSet resultSet = stmt.executeQuery(); //Executa comandos de pesquisa

        List<Produto> lista = new ArrayList<>();
        while (resultSet.next()) lista.add(getProduto(resultSet));
        return lista;
    }

    public List<Produto> listar() throws SQLException {
        //Criar o comando SQL
        PreparedStatement stmt = connection
                .prepareStatement("select * from t_jdbc_produto");
        //Executar o comando SQL
        ResultSet resultSet = stmt.executeQuery();
        //Criar a lista de Produto
        List<Produto> lista = new ArrayList<>();
        //Percorer todos os registros encontrados
        while (resultSet.next()) {
            lista.add(getProduto(resultSet));
        }
        //Retornar a lista
        return lista;
    }

    public void atualizar(Produto produto) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o prepared statement com o comando SQL
        PreparedStatement stmt = connection.prepareStatement("update t_jdbc_produto set nm_produto = ?, " +
                "ds_produto = ?, vl_produto = ?, st_estoque = ? where cd_produto = ?");
        //Setar os valores na query
        stmt.setString(1, produto.getNome());
        stmt.setString(2, produto.getDescricao());
        stmt.setDouble(3, produto.getValor());
        stmt.setBoolean(4, produto.isEmEstoque());
        stmt.setInt(5, produto.getCodigo());
        //Executar o comando
        int linhas = stmt.executeUpdate(); //Retorna o número de linhas afetadas no banco de dados
        if (linhas == 0)
            throw new EntidadeNaoEncontradaException("Produto não encontrado");
    }

    public void apagar(int id) throws SQLException, EntidadeNaoEncontradaException {
        //Criar o preparedStatement com o comando SQL
        PreparedStatement stmt = connection.prepareStatement("delete from t_jdbc_produto where cd_produto = ?");
        //Setar o id no comando SQL
        stmt.setInt(1, id);
        //Executar o comando SQL
        int linhas = stmt.executeUpdate();
        //Validar se realmente apagou algo no banco
        if (linhas == 0)
            throw new EntidadeNaoEncontradaException("Produto não encontrado");
    }

    private static Produto getProduto(ResultSet resultSet) throws SQLException {
        //Recuperar as informações do ResulSet (codigo, nome, descrição, valor, estoque)
        int codigo = resultSet.getInt("cd_produto");
        String nome = resultSet.getString("nm_produto");
        String descricao = resultSet.getString("ds_produto");
        double valor = resultSet.getDouble("vl_produto");
        boolean temEstoque = resultSet.getBoolean("st_estoque");
        //Cria o produto com os dados do banco e retorna no método
        return new Produto(codigo, nome, descricao, valor, temEstoque);
    }
}
