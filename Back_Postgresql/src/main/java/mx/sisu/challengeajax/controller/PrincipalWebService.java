//Controlador
package mx.sisu.challengeajax.ws;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

//Modelos
import mx.sisu.challengeajax.entity.Ciudad;
import mx.sisu.challengeajax.entity.DatosUsuario;
import mx.sisu.challengeajax.entity.Estado;
import mx.sisu.challengeajax.entity.Pais;

//Servicios
import mx.sisu.challengeajax.service.CiudadService;
import mx.sisu.challengeajax.service.EstadoService;
import mx.sisu.challengeajax.service.PaisService;
import mx.sisu.challengeajax.service.UsuarioService;

@RestController
@RequestMapping("/servicio")
public class PrincipalWebService {	
	
	@Resource 
	PaisService paisService;
	@Resource 
	CiudadService ciudadService;
	@Resource 
	EstadoService estadoService;
	@Resource 
	UsuarioService usuarioService;

	@CrossOrigin(origins="*")
	@GetMapping(value="/paises")
	public List<Pais> obtenerPaises(){
		return paisService.findAll();
	}	

	@CrossOrigin(origins="*")
    @PostMapping(value="/estados")
	public List<Estado> obtenerEstados(@RequestBody int paisId){
		return estadoService.findAll(paisId);
	}

	@CrossOrigin(origins="*")
    @PostMapping(value="/ciudades")
	public List<Ciudad> obtenerCiudades(@RequestBody int estadoId){
		return ciudadService.findAll(estadoId);
	}

	@CrossOrigin(origins="*")
	@GetMapping(value="/usuarios")
	public List<DatosUsuario> obtenerUsuarios(){
		return usuarioService.findAll();
	}	
	
	@CrossOrigin(origins="*")
    @PostMapping(value="/guardar")
	public String guardarUsuario(@RequestBody DatosUsuario datos){
		usuarioService.insertUsuario(datos);
		return "Usuario creado";
	}
	
	
	
}
