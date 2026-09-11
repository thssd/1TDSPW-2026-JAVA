package br.com.fiap.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplo {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                    "rm572867", "141107");
            System.out.println("Conectado!");

            Statement statement = conexao.createStatement();

            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }

    }

}
