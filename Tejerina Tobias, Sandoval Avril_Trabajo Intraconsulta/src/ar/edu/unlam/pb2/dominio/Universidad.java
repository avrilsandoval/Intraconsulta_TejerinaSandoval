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
		boolean seEncontro = true;
		Profesor profesorEncontrado = null;
		for (int i = 0; i < this.profesores.size() && seEncontro==false; i++) {
			if (this.profesores.get(i).getDni().equals(dni)) {
				profesorEncontrado = this.profesores.get(i);				
				seEncontro = true;			
			}
		}
		return profesorEncontrado;
	}

	public void agregarProfesor(Profesor profesorAAgregar) {
		boolean profesorAgregado = false;
		while(profesorAgregado == false) {
			int i = 1;
			if (this.profesores.get(i).equals(null)) {
				this.profesores.add(profesorAAgregar);
				profesorAgregado = true;
			}
			i++;
		}
	}

	public boolean inscribirAlumnoAMateria(Alumno alumnoAInscribir, Materia materia, Date fechaInscripcion) {
		boolean sePudoInscribir = false;

		if (alumnos.contains(alumnoAInscribir) && materia.buscarAlumno(alumnoAInscribir) == null) {
			materia.inscribirAlumno(alumnoAInscribir);
			sePudoInscribir = true;
		}
		return sePudoInscribir;
	}
	
	public boolean inscribirAlumnoDeUnaMateriaAComision(Alumno alumnoAInscribir,  Materia materia, Date fechaInscripcion) {
		boolean sePudoInscribir = false;
		
			if(inscribirAlumnoAMateria(alumnoAInscribir, materia,fechaInscripcion))
		
		return sePudoInscribir;
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
