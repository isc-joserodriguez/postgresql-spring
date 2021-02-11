package mx.sisu.challengeajax.dao;

import java.util.List;

import mx.sisu.challengeajax.entity.DatosUsuario;

public interface UsuarioDao {
    
    List<DatosUsuario> findAll();

    void insertUsuario(DatosUsuario usr);
    
}