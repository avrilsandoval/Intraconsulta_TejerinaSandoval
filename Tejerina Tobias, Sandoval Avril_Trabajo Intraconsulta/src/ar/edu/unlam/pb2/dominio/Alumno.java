package ar.edu.unlam.pb2.dominio;
import java.time.LocalDate;
import java.util.*;

public class Alumno {

	private String nombre;
	private String apellido;
	private Integer dni;
	private LocalDate fechaDeIngreso;
	private Date fechaDeNacimiento;
	private ArrayList<Materia> materiasAprobadas;
	
	
	public Alumno(String nombre, String apellido,Integer dni) {
	//	this.fechaDeNacimiento = new Date(dia,mes,anio);
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


	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}


	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	public void asignarMateriasAprobadas (Materia materia) {
		if ()
		materiasAprobadas.add(materia);
	}
}
