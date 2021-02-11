package mx.sisu.challengeajax.dao;

import java.util.List;

import mx.sisu.challengeajax.entity.Ciudad;

public interface CiudadDao {
    
    List<Ciudad> findAll(int estadoId);
    
}