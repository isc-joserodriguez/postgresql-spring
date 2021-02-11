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

import mx.sisu.challengeajax.entity.Estado;
import mx.sisu.challengeajax.mapper.EstadoRowMapper;
@Repository
public class EstadoDaoImpl implements EstadoDao{

    public EstadoDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
	public List<Estado> findAll(int paisId) {
		return template.query("select * from estado where paisId="+paisId, new EstadoRowMapper());
	}


}