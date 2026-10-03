package br.com.fiap.api.dao;

import br.com.fiap.api.model.TipoImovel;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class TipoImovelDao {

    private final DataSource dataSource;

    private final String INSERT_SQL = "insert into t_api_tipo_imovel (cd_tipo, nm_tipo, dt_cadastro) values (sq_api_tipo_imovel.nextval, ?, ?)";

    public TipoImovelDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void cadastrar(TipoImovel tipoImovel) throws SQLException {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement(INSERT_SQL, new String[]{"cd_tipo"})) {

            stmt.setString(1, tipoImovel.getNome());
            stmt.setDate(2, tipoImovel.getDataCadastro());
            stmt.executeUpdate();

            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()) tipoImovel.setCodigo(resultSet.getInt(1));
        }
    }
}
