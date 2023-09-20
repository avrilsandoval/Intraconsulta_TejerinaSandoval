package ar.edu.unlam.pb2.dominio;
import java.time.LocalDate;
import java.util.*;

public class Alumno {

	private String nombre;
	private String apellido;
	private Integer dni;
	private String contrasenia;
	//private LocalDate fechaDeIngreso;
	//private LocalDate fechaDeNacimiento;

	 
	ArrayList<String> nombreArrayList = new ArrayList<String>();
	
	
	public Alumno(String nombre, String apellido, Integer dni, String contrasenia) {
		//fechaDeIngreso = LocalDate.now();
		//fechaDeNacimiento = LocalDate(dia,mes,anio);
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


	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}


	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	
}
