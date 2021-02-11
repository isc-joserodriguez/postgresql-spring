package mx.sisu.challengeajax.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.sisu.challengeajax.entity.Estado;

public class EstadoRowMapper implements RowMapper<Estado> {

	@Override
	public Estado mapRow(ResultSet rs, int arg1) throws SQLException {
		Estado edo = new Estado();
		edo.setId(Integer.parseInt(rs.getString("id")));
		edo.setPaisId(Integer.parseInt(rs.getString("paisId")));
		edo.setNombre(rs.getString("nombre"));
 
        return edo;
	}

}
