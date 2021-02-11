package mx.sisu.challengeajax.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.sisu.challengeajax.entity.Ciudad;

public class CiudadRowMapper implements RowMapper<Ciudad> {

	@Override
	public Ciudad mapRow(ResultSet rs, int arg1) throws SQLException {
		Ciudad cd = new Ciudad();
        cd.setId(Integer.parseInt(rs.getString("id")));
        cd.setEstadoId(Integer.parseInt(rs.getString("estadoId")));
		cd.setNombre(rs.getString("nombre"));
 
        return cd;
	}

}
