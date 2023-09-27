package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;

public class Materia {

	private String nombreMateria;
	private static Integer id = 0;
	private Integer codigoMateria;
	private ArrayList<Materia> materiasCorrelativas;
	private ArrayList<Alumno> alumnos;

	public Materia(String nombreMateria) {
		this.codigoMateria = id++;
		this.nombreMateria = nombreMateria;
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
		this.materiasCorrelativas.add(materia);
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
		for (int i = 0; seEncontro == false; i++) {
			if (this.alumnos.size() == 0) {
				seEncontro = false;
				}else {
					if (this.alumnos.get(i).getDni().equals(dni)) {
						alumnoEncontrado = this.alumnos.get(i);
						seEncontro = true;
				}
			}
		}
		return alumnoEncontrado;
	}

	public Alumno inscribirAlumnoAMateria(Alumno alumnoAInscribir, Materia materia) {
		Alumno alumnoInscripto = null;
		boolean sePudoInscribir = false;
		if (materia.getAlumno(alumnoAInscribir.getDni()).equals(null) && sePudoInscribir) {

			// TODO falta hacer fechaInscripcion
			materia.inscribirAlumno(alumnoAInscribir);
			alumnoInscripto = materia.getAlumno(alumnoAInscribir.getDni());
			sePudoInscribir = true;
		}
		return alumnoInscripto;

	}

	public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
		this.alumnos = alumnosInscriptos;
	}

	public int getNota() {
		// TODO Auto-generated method stub
		return 0;
	}

}
