package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.Calendar;

public class AsignacionAlumnoComision {
	private Calendar fecha;
	private static Integer id = 0;
	private ArrayList<Integer> notas;
	boolean aprobado;

	public AsignacionAlumnoComision(Calendar fechaInscripcion) {
		this.fecha = fechaInscripcion;
		id++;
	}

	public void inscribirAlumnoDeUnaMateriaAComision(Alumno alumnoAInscribir, Materia materia, Comision comision) {
		if (materia.getAlumno(alumnoAInscribir.getDni()).getDni().equals((alumnoAInscribir).getDni())
				&& comision.buscarAlumnoEnComision(alumnoAInscribir.getDni()) == null) {
			comision.agregarAlumno(alumnoAInscribir);
		}
	}

	public void asignarNotaAAlumno(Integer notaParcial) {
		if (notas.size() < 3) {
			notas.add(notaParcial);
		}
	}

	public void asignarRecuperatorio(Integer notaRecuperatorio, Integer parcialRecuperado) {
		if (notas.get(parcialRecuperado) != null && parcialRecuperado < 3) {
			notas.set(parcialRecuperado, notaRecuperatorio);
		}
	}

	public void asignarFinal(Integer notaFinal, Integer finalRendido) {
		if (notas.get(finalRendido) != null && finalRendido == 3) {
			notas.set(finalRendido, notaFinal);
		}
	}

}
