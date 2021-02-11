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

import mx.sisu.challengeajax.entity.Pais;
import mx.sisu.challengeajax.mapper.PaisRowMapper;
@Repository
public class PaisDaoImpl implements PaisDao{

    public PaisDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
	public List<Pais> findAll() {
		return template.query("select * from pais", new PaisRowMapper());
	}


}