package ar.edu.unlam.pb2.dominio;

public class Profesor {

	private String nombre;
	private String apellido;
	private Integer dni;
	private String contrasenia;
	
	public Profesor(String nombre, String apellido, Integer dni, String contrasenia) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.contrasenia=contrasenia;
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
}
