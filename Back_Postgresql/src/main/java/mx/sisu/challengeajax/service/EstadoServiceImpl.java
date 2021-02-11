package mx.sisu.challengeajax.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import mx.sisu.challengeajax.dao.EstadoDao;
import mx.sisu.challengeajax.entity.Estado;

@Component
public class EstadoServiceImpl implements EstadoService{
	@Resource 
	EstadoDao EstadoDao;
	@Override
	public List<Estado> findAll(int paisId) {
		return EstadoDao.findAll(paisId);
	}
}
