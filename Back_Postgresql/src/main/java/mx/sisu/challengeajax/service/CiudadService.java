package mx.sisu.challengeajax.service;

import java.util.List;

import mx.sisu.challengeajax.entity.Ciudad;

public interface CiudadService {

    List<Ciudad> findAll(int estadoId);	

}