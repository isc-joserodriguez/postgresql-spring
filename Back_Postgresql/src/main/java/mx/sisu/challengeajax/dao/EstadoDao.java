package mx.sisu.challengeajax.dao;

import java.util.List;

import mx.sisu.challengeajax.entity.Estado;

public interface EstadoDao {
    
    List<Estado> findAll(int paisId);
    
}