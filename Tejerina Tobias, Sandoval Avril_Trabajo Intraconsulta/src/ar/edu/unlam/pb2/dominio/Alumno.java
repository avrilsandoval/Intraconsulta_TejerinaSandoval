package ar.edu.unlam.pb2.dominio;
import java.util.*;

public class Alumno {

	private String nombre;
	private String apellido;
	private Integer dni;
	private ArrayList<Materia> materiasAprobadas;
	private Calendar fechaNacimiento;
	
	public Alumno(String nombre, String apellido,Integer dni, Calendar fechaNacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.fechaNacimiento= fechaNacimiento;
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

	
	public void asignarMateriasAprobadas (Materia materia) {
		if ()
		materiasAprobadas.add(materia);
	}
}
