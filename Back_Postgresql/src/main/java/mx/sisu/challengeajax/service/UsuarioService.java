package mx.sisu.challengeajax.service;

import java.util.List;

import mx.sisu.challengeajax.entity.DatosUsuario;

public interface UsuarioService {

    List<DatosUsuario> findAll();	

    void insertUsuario(DatosUsuario usr);

}