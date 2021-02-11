package mx.sisu.challengeajax.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import mx.sisu.challengeajax.dao.CiudadDao;
import mx.sisu.challengeajax.entity.Ciudad;

@Component
public class CiudadServiceImpl implements CiudadService{
	@Resource 
	CiudadDao CiudadDao;
	@Override
	public List<Ciudad> findAll(int estadoId) {
		return CiudadDao.findAll(estadoId);
	}
}
