package br.com.fiap.dao;

import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao() throws SQLException, ClassNotFoundException {
        connection = ConnectionFactory.getConnection();
    }

    public void cadastrar(Produto produto) throws SQLException{
        PreparedStatement stmt = connection
                .prepareStatement("insert into T_JDBC_PRODUTO (cd_produto, nm_produto, ds_produto, " +
                "vl_produto, st_estoque) values (?, ?, ?, ?, ?)");

        stmt.setInt(1, produto.getCodigo());
        stmt.setString(2, produto.getNome());
        stmt.setString(3, produto.getDescricao());
        stmt.setDouble(4, produto.getValor());
        stmt.setBoolean(5, produto.isEmEstoque());

        stmt.executeUpdate();
    }

    public Produto buscar(int id) throws SQLException {
        PreparedStatement stmt  = connection.prepareStatement("select * from T_JDBC_PRODUTO where " +
                "cd_produto = ?");

        stmt.setInt(1, id);
        ResultSet resultSet = stmt.executeQuery();

        if (!resultSet.next()) {
            throw new EntidadeNaoEncontradaException("entidade nao encontrada");
        }

        return null;

    }

    public List<Produto> listar() {
        return null;
    }

    public void atualizar(Produto produto) {

    }

    public void apagar(int id) {

    }
}
