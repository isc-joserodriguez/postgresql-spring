package mx.sisu.challengeajax.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.sisu.challengeajax.entity.DatosUsuario;

public class UsuarioRowMapper implements RowMapper<DatosUsuario> {

	@Override
	public DatosUsuario mapRow(ResultSet rs, int arg1) throws SQLException {
		DatosUsuario cd = new DatosUsuario();
        cd.setId(Integer.parseInt(rs.getString("id")));
        cd.setCiudadId(Integer.parseInt(rs.getString("ciudadId")));
        cd.setNombre(rs.getString("nombre"));
        cd.setEdad(Integer.parseInt(rs.getString("edad")));
 
        return cd;
	}

}
