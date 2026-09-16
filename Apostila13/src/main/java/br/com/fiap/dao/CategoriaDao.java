package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDao {

    private Connection connection;

    public CategoriaDao() throws SQLException, ClassNotFoundException {
        connection = ConnectionFactory.getConnection();
    }

    public void cadastrar(Categoria categoria) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("insert into t_jdbc_categoria " +
                "(cd_categoria, nm_categoria) values (sq_jdbc_categoria.nextVal, ?)", new String[] {"cd_categoria"});
        stmt.setString(1, categoria.getNome());
        stmt.executeUpdate();
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.next()) categoria.setCodigo(resultSet.getInt(1));
    }
}