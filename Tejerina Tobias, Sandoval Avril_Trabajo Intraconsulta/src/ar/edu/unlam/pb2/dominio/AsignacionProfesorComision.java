package ar.edu.unlam.pb2.dominio;

public class AsignacionProfesorComision {
	
	public AsignacionProfesorComision() {
		
	}
	
	public void asignarProfesor(Comision comision, Profesor profesor) {
		
		Integer cantidadDeProfesores = (Integer)comision.getAlumnos().size()/20;
		
		comision.getMateriaAsignada();
		profesor.getMateria();
		
		
		
		while (comision.getAlumnos().size()/20) {
			if(comision.buscarProfesorEnComision(profesor.getDni()) == null) {
				comision.agregarProfesor(profesor);
			}
		}
	}
}
