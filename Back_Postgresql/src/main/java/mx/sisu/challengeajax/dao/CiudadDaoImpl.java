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

import mx.sisu.challengeajax.entity.Ciudad;
import mx.sisu.challengeajax.mapper.CiudadRowMapper;
@Repository
public class CiudadDaoImpl implements CiudadDao{

    public CiudadDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
	public List<Ciudad> findAll(int estadoId) {
		return template.query("select * from ciudad where estadoId="+estadoId, new CiudadRowMapper());
	}


}