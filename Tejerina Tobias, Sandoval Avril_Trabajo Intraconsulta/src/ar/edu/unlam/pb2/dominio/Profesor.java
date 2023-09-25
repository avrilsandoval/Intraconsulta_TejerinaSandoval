package ar.edu.unlam.pb2.dominio;

public class Profesor {

	private String nombre;
	private String apellido;
	private Integer dni;
	
	public Profesor(String nombre, String apellido, Integer dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
}
