package ar.edu.unlam.pb2.dominio;

public class AsignacionProfesorComision {

	public AsignacionProfesorComision() {

	}

	public void asignarProfesor(Universidad universidad, Comision comision) {
		double cantidadDeProfesores = Math.ceil((double) (comision.getAlumnos().size() / 20.0));
		int i = 0;
		do {
			if (universidad.getProfesoresConIndice(i).getMateria().getCodigoMateria().equals(comision.getMateriaAsignada().getCodigoMateria()) && 
					comision.buscarProfesorEnComision(universidad.getProfesoresConIndice(i).getDni()).getDni().equals(null)) {
				comision.agregarProfesor(universidad.getProfesoresConIndice(i));
				cantidadDeProfesores--;
			}
			i++;

		} while (cantidadDeProfesores > 0);

	}
}
