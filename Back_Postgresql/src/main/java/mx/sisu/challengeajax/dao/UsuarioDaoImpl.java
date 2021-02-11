package mx.sisu.challengeajax.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import mx.sisu.challengeajax.entity.DatosUsuario;
import mx.sisu.challengeajax.mapper.UsuarioRowMapper;
@Repository
public class UsuarioDaoImpl implements UsuarioDao{

    public UsuarioDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
	public List<DatosUsuario> findAll() {
		return template.query("select * from usuario", new UsuarioRowMapper());
    }
    
    @Override
	public void insertUsuario(DatosUsuario usr) {
		 final String sql = "insert into usuario(ciudadId, nombre, edad) values(:ciudadId,:nombre,:edad)";
		 
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
					.addValue("ciudadId", usr.getCiudadId())
					.addValue("nombre", usr.getNombre())
					.addValue("edad", usr.getEdad());
	        template.update(sql,param, holder);
	 
	}


}