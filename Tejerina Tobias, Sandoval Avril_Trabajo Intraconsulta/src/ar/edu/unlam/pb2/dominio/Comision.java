package ar.edu.unlam.pb2.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Comision {

	private static Integer id = 0;
	private Materia materiaAsignada;
	private Integer codigoComision;
	private Aula aula;
	private Turno turno;
	private CicloLectivo cicloLectivo;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Profesor> profesores;

	public Comision(Materia materiaAsignada, Aula aula, Turno turno, CicloLectivo cicloLectivo,
			ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores) {
		this.materiaAsignada = materiaAsignada;
		this.alumnos = alumnos;
		this.profesores = profesores;
		this.codigoComision = id++;
		this.aula = aula;
		this.turno = turno;
		this.cicloLectivo = cicloLectivo;
	}

	public Materia getMateriaAsignada() {
		return materiaAsignada;
	}

	public void setMateriaAsignada(Materia materiaAsignada) {
		this.materiaAsignada = materiaAsignada;
	}

	public Integer getCodigoComision() {
		return codigoComision;
	}

	public void setCodigoComision(Integer codigoComision) {
		this.codigoComision = codigoComision;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}

	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public Alumno buscarAlumnoEnComision(Integer dni) {
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

}
