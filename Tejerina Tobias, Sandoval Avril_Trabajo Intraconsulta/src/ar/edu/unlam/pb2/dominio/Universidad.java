package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;


public class Universidad {

	private String nombre;
	private ArrayList<Profesor> profesores;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Materia> materias;
	private ArrayList<Comision> comisiones;
	
	public Universidad(String nombre, ArrayList<Profesor> profesores, ArrayList<Alumno> alumnos,
			ArrayList<Materia> materias, ArrayList<Comision> comisiones) {
		this.nombre = nombre;
		this.profesores = profesores;
		this.alumnos = alumnos;
		this.materias = materias;
		this.comisiones = comisiones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesores(int dni) {
		Profesor profesorBuscado = null;
		for(int i=0;i < this.profesores.size();i++) {
			if(profesores.get(i).getDni().equals(dni)) {
				return profesorBuscado;
			}
		}
		return profesorBuscado;
	}

	public void agregarProfesor(Profesor profesorAAgregar) {
		for(int i=0;i < this.profesores.size();i++) {
			if(profesores.get(i).equals(null)) {
				profesores.add(profesorAAgregar);
			}
		}
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public ArrayList<Comision> getComisiones() {
		return comisiones;
	}

	public void setComisiones(ArrayList<Comision> comisiones) {
		this.comisiones = comisiones;
	}

	

}
