package mx.sisu.challengeajax.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.sisu.challengeajax.entity.Pais;

public class PaisRowMapper implements RowMapper<Pais> {

	@Override
	public Pais mapRow(ResultSet rs, int arg1) throws SQLException {
		Pais pais = new Pais();
		pais.setId(Integer.parseInt(rs.getString("id")));
		pais.setNombre(rs.getString("nombre"));
 
        return pais;
	}

}
