package ar.edu.unlam.pb2.test;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Alumno;
import ar.edu.unlam.pb2.dominio.Aula;
import ar.edu.unlam.pb2.dominio.CicloLectivo;
import ar.edu.unlam.pb2.dominio.Comision;
import ar.edu.unlam.pb2.dominio.Cuatrimestre;
import ar.edu.unlam.pb2.dominio.Materia;
import ar.edu.unlam.pb2.dominio.Nota;
import ar.edu.unlam.pb2.dominio.Profesor;
import ar.edu.unlam.pb2.dominio.Turno;
import ar.edu.unlam.pb2.dominio.Universidad;

public class testCursada {

/*	@Test
	public void queSePuedaCrearUnaUniversidad() {
		// preparacion
		String nombre = "";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();

		// ejecucion
		Universidad universidad = new Universidad(nombre, profesores, alumnos, materias, comisiones);

		// validacion
		assertNotNull(universidad);
	}
*/
	@Test
	public void queSePuedaIngresarUnProfesorAUnaUniversidad() {
		// preparacion
		String nombre = "Sergei";
		String apellido = "Randam";
		Integer dni = 45646484; // usuario para ingresar
		String contrasenia = "123";
		String nombreUniversidad = "UNLAM";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();

		// ejecucion
		Profesor profesor = new Profesor(nombre, apellido, dni, contrasenia);
		Universidad universidad = new Universidad(nombreUniversidad, profesores, alumnos, materias, comisiones);
		universidad.agregarProfesor(profesor);
		// profesores.add(profesor);
		// TODO
		// validacion
		assertNotNull(profesor);
		assertNotNull(universidad);
		// assertEquals(profesor.getDni(),profesores.get(0).getDni());
		assertNotNull(universidad.getProfesor(dni).getDni());
		
	}
/*
	@Test
	public void queSePuedaLoguearUnAlumno() {
		// preparacion
		String nombre = "";
		String apellido = "";
		Integer dni = 46564678; // usuario para ingresar
		String contrasenia = "";
		// LocalDate fechaIngreso;

		// ejecucion
		Alumno alumno = new Alumno(nombre, apellido, dni, contrasenia);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(alumno);

		// validacion
		assertNotNull(alumno);
		assertEquals(alumno.getDni(), alumnos.get(0).getDni());
	}

	@Test
	public void queSePuedaIngresarUnAlumnoAUnaComision() {
		// preparacion
		String nombre = "";
		String apellido = "";
		Integer dni = 46564678; // usuario para ingresar
		String contrasenia = "";
		// LocalDate fechaIngreso;
		String nombreMateria = "pb2";
		Materia materia = new Materia(nombreMateria);
		Aula aula = new Aula(215, 50);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		CicloLectivo cicloLectivo = new CicloLectivo(2023, Cuatrimestre.SEGUNDO_CUATRIMESTRE);
		Comision comision = new Comision(materia, aula, Turno.MANIANA, cicloLectivo, alumnos, profesores);

		// ejecucion
		Alumno alumno = new Alumno(nombre, apellido, dni, contrasenia);

		// comision

		// validacion
		assertNotNull(alumno);
		assertEquals(alumno.getDni(), alumnos.get(0).getDni());
	}
	@Test
	public void queSePuedaAgregarUnaMateria() {
		// preparacion
		String nombreMateria = "Matematica";

		// ejecucion
		Materia materia = new Materia(nombreMateria);

		// validacion
		assertNotNull(materia);
	}

	@Test
	public void queNoSePuedanAgregarMateriasConMismoCodigo() {
		// preparacion
		String nombreMateria = "Matematica";
		String nombreMateria2 = "Base De Datos";

		// ejecucion
		Materia materia = new Materia(nombreMateria);
		Materia materia2 = new Materia(nombreMateria2);

		// validacion
		assertNotNull(materia);
		assertNotNull(materia2);
		assertNotEquals(materia.getCodigoMateria(), materia2.getCodigoMateria());
	}

	@Test
	public void queSePuedaAgregarCorrelativaAUnaMateria() {
		// preparacion
		String nombreMateria = "pb1";
		String nombreMateria2 = "pb2";
		// ejecucion
		Materia materia = new Materia(nombreMateria);
		Materia materia2 = new Materia(nombreMateria2);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		// validacion
		
	}

	@Test
	public void queNoSePuedaAgregarUnAlumnoAUnaMateriaSiNoTieneSusCorrelativas() {
		// preparacion
		Materia materiaActual= new Materia("Pb2");
		Materia materiaPrevia= new Materia("Pb1");
		Alumno alumno = new Alumno("nombre","apellido","uwu",0202);
		Aula aula = new Aula(12, 50);
		
		// ejecucion
		materiaActual.setMateriasCorrelativas(materiaPrevia);
		
		materiaActual.getMateriasCorrelativas();
		// validacion
		assertNotNull(curso);
	}
	
	@Test
	public void queSePuedaCrearUnAula() {
		// preparacion
		Integer numeroAula = 0;
		Integer capacidad = 0;

		// ejecucion
		Aula aula = new Aula(numeroAula, capacidad);

		// validacion
		assertNotNull(aula);
	}

	@Test
	public void queSePuedaCrearUnCicloLectivo() {
		// preparacion

		Integer anio = 0;
		Cuatrimestre cuatrimestre = Cuatrimestre.SEGUNDO_CUATRIMESTRE;

		// ejecucion
		CicloLectivo cicloLectivo = new CicloLectivo(anio, cuatrimestre);

		// validacion
		assertNotNull(cicloLectivo);
	}

	/*
	 * @Test public void queSePuedaCrearUnaNota() { // preparacion Double valorNota
	 * = 0.0;
	 * 
	 * // ejecucion Nota nota = new Nota(valorNota);
	 * 
	 * // validacion assertNotNull(nota);
	 * 
	 * }
	 */
	@Test
	public void queSePuedaCrearUnaComision() {
		// preparacion
		Materia materiaAsignada = new Materia("Programacion");
		Integer codigoComision = 0;
		Aula aula = new Aula(12, 50);
		Turno turno = Turno.MANIANA;
		CicloLectivo cicloLectivo = new CicloLectivo(2023, Cuatrimestre.PRIMER_CUATRIMESTRE);

		// ejecucion
		Comision curso = new Comision(materiaAsignada, aula, turno, cicloLectivo);

		// validacion
		assertNotNull(curso);
	}


	
}
