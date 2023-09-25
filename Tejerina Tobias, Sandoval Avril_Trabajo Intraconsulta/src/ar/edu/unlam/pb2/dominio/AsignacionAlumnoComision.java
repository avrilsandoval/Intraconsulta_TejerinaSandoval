package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AsignacionAlumnoComision {
	private GregorianCalendar fecha;
	private static Integer id = 0;
	private ArrayList<Integer> notas;

	public AsignacionAlumnoComision(Integer anio, Integer mes, Integer dia) {
		this.fecha = new GregorianCalendar(anio, mes - 1, dia);
		id++;
	}

	public void inscribirAlumnoDeUnaMateriaAComision(Alumno alumnoAInscribir, Materia materia, Comision comision) {
		if (materia.inscribirAlumnoAMateria(alumnoAInscribir, materia)
				&& comision.buscarAlumnoEnComision(alumnoAInscribir.getDni()) == null) {

		}
	}

	public void asignarNotaAAlumno(Integer notaParcial) {
		if (notas.size() < 3) {
			notas.add(notaParcial);
		}
	}

	public void asignarRecuperatorio(Integer notaRecuperatorio, Integer parcialRecuperado) {
		if(notas.get(parcialRecuperado) != null) {
			notas.set(parcialRecuperado, notaRecuperatorio);
		}
	}
}
