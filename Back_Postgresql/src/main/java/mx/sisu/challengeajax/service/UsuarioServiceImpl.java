package mx.sisu.challengeajax.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import mx.sisu.challengeajax.dao.UsuarioDao;
import mx.sisu.challengeajax.entity.DatosUsuario;

@Component
public class UsuarioServiceImpl implements UsuarioService{
	@Resource 
	UsuarioDao usuarioDao;
	@Override
	public List<DatosUsuario> findAll() {
		return usuarioDao.findAll();
	}
	@Override
	public void insertUsuario(DatosUsuario usr){
		usuarioDao.insertUsuario(usr);
	}
}
