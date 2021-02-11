package mx.sisu.challengeajax.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import mx.sisu.challengeajax.dao.PaisDao;
import mx.sisu.challengeajax.entity.Pais;

@Component
public class PaisServiceImpl implements PaisService{
	@Resource 
	PaisDao paisDao;
	@Override
	public List<Pais> findAll() {
		return paisDao.findAll();
	}
}
