package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.Date;

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

	public Profesor getProfesor(int dni) {
		boolean seEncontro = false;
		Profesor profesorEncontrado = null;
		for (int i = 0; i < this.profesores.size() && seEncontro == false; i++) {
			if (this.profesores.get(i).getDni().equals(dni)) {
				profesorEncontrado = this.profesores.get(i);
				seEncontro = true;
			}
		}
		return profesorEncontrado;
	}

	public void agregarProfesor(Profesor profesorAAgregar) {
		if (this.profesores.size() == 0) {
			this.profesores.add(profesorAAgregar);
		} else {
				if (getProfesor(profesorAAgregar.getDni()) == null) {
					this.profesores.add(profesorAAgregar);
			}
		}
	}

	public Alumno getAlumno(int dni) {
		boolean seEncontro = false;
		Alumno alumnoEncontrado = null;
		for (int i = 0; i < this.alumnos.size() && seEncontro == false; i++) {
			if (this.alumnos.get(i).getDni().equals(dni)) {
				alumnoEncontrado = this.alumnos.get(i);
				seEncontro = true;
			}
		}
		return alumnoEncontrado;
	}

	public void agregarAlumno(Alumno alumnoAAgregar) {
		if (this.alumnos.size() == 0) {
			this.alumnos.add(alumnoAAgregar);
		} else {
				if (getProfesor(alumnoAAgregar.getDni()) == null) {
					this.alumnos.add(alumnoAAgregar);
				}
		}
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
