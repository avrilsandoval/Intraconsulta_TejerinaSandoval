package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;

public class Materia {

	private String nombreMateria;
	private static Integer id = 0;
	private Integer codigoMateria;
	private ArrayList<Materia> materiasCorrelativas;
	private ArrayList<Alumno> alumnosInscriptos;
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
		for (int i = 0; i < this.alumnosInscriptos.size(); i++) {
			if (this.alumnosInscriptos.get(i) == null) {
				this.alumnosInscriptos.add(alumno);
			}
		}
	}

	public Alumno buscarAlumno(Alumno alumno) {
		Alumno alumnoBuscado = null;
		for (int i = 0; i < this.alumnosInscriptos.size(); i++) {
			if (this.alumnosInscriptos.get(i).getDni().equals(alumno.getDni())) {
				alumnoBuscado = this.alumnosInscriptos.get(i);
			}
		}
		return alumnoBuscado;
	}

	public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
		this.alumnosInscriptos = alumnosInscriptos;
	}

	public boolean isAprobada() {
		return aprobada;
	}

	public void setAprobada(boolean aprobada) {
		this.aprobada = aprobada;
	}

	
}
