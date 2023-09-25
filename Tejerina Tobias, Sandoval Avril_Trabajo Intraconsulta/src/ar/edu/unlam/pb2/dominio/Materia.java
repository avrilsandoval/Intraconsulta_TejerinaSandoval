package ar.edu.unlam.pb2.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Materia {

	private String nombreMateria;
	private static Integer id = 0;
	private Integer codigoMateria;
	private ArrayList<Materia> materiasCorrelativas;
	private ArrayList<Alumno> alumnos;
	private boolean aprobada;
	
	public Materia(String nombreMateria) {
		this.codigoMateria = id++;
		this.nombreMateria = nombreMateria;
		this.aprobada = false;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public Integer getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria++;
	}

	public ArrayList<Materia> getMateriasCorrelativas() {
		return materiasCorrelativas;
	}

	public void setMateriasCorrelativas(Materia materia) {
		if() {
			
		}
		this.materiasCorrelativas = materiasCorrelativas;
	}

	public void inscribirAlumno(Alumno alumno) {
		for (int i = 0; i < this.alumnos.size(); i++) {
			if (this.alumnos.get(i) == null) {
				this.alumnos.add(alumno);
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
	
	public boolean inscribirAlumnoAMateria(Alumno alumnoAInscribir, Materia materia) {
		boolean sePudoInscribir = false;

		if (materia.getAlumno(alumnoAInscribir.getDni()) == null) {

			// TODO falta hacer fechaInscripcion

			materia.inscribirAlumno(alumnoAInscribir);
			sePudoInscribir = true;

		}
		return sePudoInscribir;
	
	}
	
	
	public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
		this.alumnos = alumnosInscriptos;
	}

	public boolean isAprobada() {
		return aprobada;
	}

	public void setAprobada(boolean aprobada) {
		this.aprobada = aprobada;
	}

	
}
