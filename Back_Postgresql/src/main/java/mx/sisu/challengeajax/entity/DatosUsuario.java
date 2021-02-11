package mx.sisu.challengeajax.entity;

public class DatosUsuario {
	
	//Modelo usuario
	int id;
	int ciudadId;
	String nombre;
	int edad;
	
	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getCiudadId() {
		return ciudadId;
	}

	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
