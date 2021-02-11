package mx.sisu.challengeajax.entity;

public class Estado {

	//Modelo estado
	int id;
	int paisId;
	String nombre;

	//Getters & Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPaisId() {
		return paisId;
	}
	
	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
