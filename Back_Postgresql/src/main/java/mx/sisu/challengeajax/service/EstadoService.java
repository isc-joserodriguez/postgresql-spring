package mx.sisu.challengeajax.service;

import java.util.List;

import mx.sisu.challengeajax.entity.Estado;

public interface EstadoService {

    List<Estado> findAll(int paisId);	

}