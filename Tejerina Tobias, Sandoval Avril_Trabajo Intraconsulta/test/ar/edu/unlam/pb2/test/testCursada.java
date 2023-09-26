package ar.edu.unlam.pb2.test;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Alumno;
import ar.edu.unlam.pb2.dominio.AsignacionAlumnoComision;
import ar.edu.unlam.pb2.dominio.AsignacionProfesorComision;
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

	@Test
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

	@Test
	public void queSePuedaCrearUnaComision() {
		// preparacion
		Materia materiaAsignada = new Materia("Programacion");
		Aula aula = new Aula(50);
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Turno turno = Turno.MANIANA;
		
		Calendar fechaInicio = Calendar.getInstance();
		fechaInicio.set(2023, 8, 20);
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.set(2023, 8, 30);

		CicloLectivo cicloLectivo = new CicloLectivo(fechaInicio, fechaFinal);

		// ejecucion
		Comision comision = new Comision(materiaAsignada, aula, turno, cicloLectivo, alumnos, profesores);

		// validacion
		assertNotNull(comision);
	}

	@Test
	public void queSePuedaCrearUnaInscripcionAlumnoComision() {

		Calendar fechaInicio = Calendar.getInstance();
		fechaInicio.set(2023, 8, 20);
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.set(2023, 8, 30);

		CicloLectivo cicloLectivo = new CicloLectivo(fechaInicio, fechaFinal);
		Calendar fechaInscripcion = Calendar.getInstance();
		fechaInscripcion.set(2023, 8, 21);
		AsignacionAlumnoComision inscripcionAlumnoComision = new AsignacionAlumnoComision(fechaInscripcion);
		assertNotNull(inscripcionAlumnoComision);
	}

	@Test
	public void queSePuedaIngresarUnProfesorAUnaUniversidad() {
		// preparacion
		String nombre = "Sergei";
		String apellido = "Randam";
		Integer dni = 81318489;
		String nombreUniversidad = "UNLAM";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();
		// ejecucion
		Materia materia = new Materia("Matematica");
		Profesor profesor = new Profesor(nombre, apellido, dni, materia);

		Universidad universidad = new Universidad(nombreUniversidad, profesores, alumnos, materias, comisiones);
		universidad.agregarProfesor(profesor);
		assertNotNull(profesor);
		assertNotNull(universidad);
		assertNotNull(universidad.getProfesorConDni(dni).getDni());

	}

	@Test
	public void queSePuedaIngresarTresProfesoresAUnaUniversidad() {
		// preparacion
		String nombre = "Sergei";
		String apellido = "Randam";
		Integer dni = 81318489;
		Integer dni2 = 78891153;
		Integer dni3 = 95646384;
		String nombreUniversidad = "UNLAM";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();
		String nombreMateria = "Matematica";

		// ejecucion
		Materia materia = new Materia(nombreMateria);
		Profesor profesor = new Profesor(nombre, apellido, dni, materia);
		Profesor profesor2 = new Profesor(nombre, apellido, dni2, materia);
		Profesor profesor3 = new Profesor(nombre, apellido, dni3, materia);
		Universidad universidad = new Universidad(nombreUniversidad, profesores, alumnos, materias, comisiones);
		universidad.agregarProfesor(profesor);
		universidad.agregarProfesor(profesor2);
		universidad.agregarProfesor(profesor3);
		assertNotNull(profesor);
		assertNotNull(profesor2);
		assertNotNull(profesor3);
		assertNotNull(universidad);
		assertNotNull(universidad.getProfesorConDni(dni).getDni());
		assertNotNull(universidad.getProfesorConDni(dni2).getDni());
		assertNotNull(universidad.getProfesorConDni(dni3).getDni());

	}

	@Test
	public void queSePuedaIngresarUnAlumnoAUnaUniversidad() {
		// preparacion
		String nombre = "Sergei";
		String apellido = "Randam";
		Integer dni = 81318489;
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(2004, 8, 6);
		String nombreUniversidad = "UNLAM";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();

		// ejecucion
		Alumno alumno = new Alumno(nombre, apellido, dni,fechaNacimiento);

		Universidad universidad = new Universidad(nombreUniversidad, profesores, alumnos, materias, comisiones);
		universidad.agregarAlumno(alumno);
		assertNotNull(alumno);
		assertNotNull(universidad);
		assertNotNull(universidad.getAlumno(dni).getDni());

	}

	@Test
	public void queSePuedaIngresarTresAlumnosAUnaUniversidad() {
		// preparacion
		String nombre = "Sergei";
		String apellido = "Randam";
		Integer dni = 81318489;
		Integer dni2 = 78891153;
		Integer dni3 = 95646384;
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(2004, 8, 6);
		String nombreUniversidad = "UNLAM";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();

		// ejecucion
		Alumno alumno = new Alumno(nombre, apellido, dni,fechaNacimiento);
		Alumno alumno2 = new Alumno(nombre, apellido, dni2,fechaNacimiento);
		Alumno alumno3 = new Alumno(nombre, apellido, dni3,fechaNacimiento);

		Universidad universidad = new Universidad(nombreUniversidad, profesores, alumnos, materias, comisiones);
		universidad.agregarAlumno(alumno);
		universidad.agregarAlumno(alumno2);
		universidad.agregarAlumno(alumno3);
		assertNotNull(alumno);
		assertNotNull(alumno2);
		assertNotNull(alumno3);
		assertNotNull(universidad);
		assertNotNull(universidad.getAlumno(dni).getDni());
		assertNotNull(universidad.getAlumno(dni2).getDni());
		assertNotNull(universidad.getAlumno(dni3).getDni());

	}

	@Test
	public void queSePuedaInscribirUnAlumnoAUnaComision() {

		String nombre = "Pepito";
		String apellido = "Sanchez";
		Integer dni = 45678908;
		
		Calendar fechaInicio = Calendar.getInstance();
		fechaInicio.set(2023, 8, 20);
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.set(2023, 8, 30);
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(2004, 8, 6);
		Calendar fechaInscripcion = Calendar.getInstance();
		fechaInscripcion.set(2023, 8, 21);
		
		Aula aula = new Aula(80);
		Materia materiaACursar = new Materia("Matematica");
		Alumno alumnoAIngresar = new Alumno(nombre, apellido, dni,fechaNacimiento);
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();
		CicloLectivo cicloLectivo = new CicloLectivo(fechaInicio, fechaFinal);
		Universidad universidad = new Universidad("Unlam",profesores,alumnos,materias,comisiones);
		
		AsignacionAlumnoComision inscripcionAlumnoComision = new AsignacionAlumnoComision(fechaInscripcion);
		Comision comision = new Comision(materiaACursar, aula, Turno.NOCHE, cicloLectivo, alumnos, profesores);

		// Verificar que el alumno y la comisión estén dados de alta
		assertNotNull(inscripcionAlumnoComision);
		assertNotNull(alumnoAIngresar);
		assertNotNull(comision);

		// Asegurarse de que el alumno tenga todas las correlativas aprobadas
		assertTrue(universidad.asignarMateriasAprobadas(alumnoAIngresar, comision.getMateriaAsignada()));

		// Verificar que la inscripción esté dentro de la fecha de inscripción
		assertTrue(universidad.estaDentroDeFechaInscripcion(cicloLectivo));

		// Verificar que la comisión no exceda la capacidad del aula
		assertTrue(universidad.cabeAlumnoEnAula(comision, aula));

		// Verificar que el alumno no esté inscrito en otra comisión el mismo día y
		// turno
		assertFalse(universidad.tieneInscripcionEnMismoDiaYTurno(alumnoAIngresar, cicloLectivo, comision));

		// Verificar que el alumno no esté inscrito previamente en la materia
		assertFalse(universidad.estaInscritoEnMateria(alumnoAIngresar, comision.getMateriaAsignada()));

		// Inscribir al alumno a la comisión
		universidad.inscribirAlumnoAComision(alumnoAIngresar, comision);

		// Verificar que el alumno esté inscrito en la comisión
		assertTrue(universidad.estaInscritoEnComision(alumnoAIngresar, comision));
	}

	@Test
	public void queNoSePuedaAgregarAlumnosALaComisionSiElAulaEstaLlena() {

		// No se puede inscribir el alumno si excede la cantidad de alumnos permitidos
		// en el aula

		// preparacion
		String nombre = "pablo";
		String apellido = "lopez";
		Integer dni = 45678933;
		Integer dni2 = 78569785;
		Integer dni3 = 45789862;
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(2004, 8, 6);
		// ejecucion
		Alumno alumnoAIngresar = new Alumno(nombre, apellido, dni, fechaNacimiento);
		Alumno alumnoAIngresar2 = new Alumno(nombre, apellido, dni2, fechaNacimiento);
		Alumno alumnoQueNoEntra = new Alumno(nombre, apellido, dni3, fechaNacimiento);

		Calendar fechaInicio = Calendar.getInstance();
		fechaInicio.set(2023, 8, 20);
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.set(2023, 8, 30);

		CicloLectivo cicloLectivo = new CicloLectivo(fechaInicio, fechaFinal);

		Aula aula = new Aula(2);
		Materia materiaQueDa = new Materia("Matematica");
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Calendar fechaInscripcion = Calendar.getInstance();
		fechaInscripcion.set(2023, 8, 21);
		AsignacionAlumnoComision inscripcionAlumnoComision = new AsignacionAlumnoComision(fechaInscripcion);
		Comision comision = new Comision(materiaQueDa, aula, Turno.NOCHE, cicloLectivo, alumnos, profesores);

		// validacion

		assertNotNull(comision);
		assertNotNull(alumnoAIngresar);
		assertNotNull(alumnoAIngresar2);
		assertNotNull(alumnoQueNoEntra);

		// TODO que no entre en el aula
	}

	@Test
	public void queSePuedaAsignarProfesorALaComision() {

		// preparacion
		String nombre = "pablo";
		String apellido = "lopez";
		Integer dni = 45678933;
		Materia materia = new Materia("Matematica");

		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(2004, 8, 6);
		Calendar fechaInscripcion = Calendar.getInstance();
		fechaInscripcion.set(2023, 8, 21);
		// ejecucion
		Profesor profesor1 = new Profesor(nombre, apellido, dni, materia);
		Alumno alumno1 = new Alumno(nombre, apellido, dni,fechaNacimiento);
		Aula aula = new Aula(2);
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();
		Calendar fechaInicio = Calendar.getInstance();
		fechaInicio.set(2023, 8, 20);
		Calendar fechaFinal = Calendar.getInstance();
		fechaFinal.set(2023, 8, 30);
		CicloLectivo cicloLectivo = new CicloLectivo(fechaInicio, fechaFinal);
		Universidad universidad = new Universidad("unlam", profesores, alumnos, materias, comisiones);
		AsignacionAlumnoComision asignacionAlumnoComision = new AsignacionAlumnoComision(fechaInscripcion);
		AsignacionProfesorComision asignacionProfesorComision = new AsignacionProfesorComision();
		Comision comision = new Comision(materia, aula, Turno.NOCHE, cicloLectivo, alumnos, profesores);

		universidad.agregarAlumno(alumno1);
		asignacionAlumnoComision.inscribirAlumnoDeUnaMateriaAComision(alumno1, materia, comision);
		asignacionProfesorComision.asignarProfesor(universidad, comision);
		// validacion
		assertNotNull(profesor1);
		assertNotNull(comision);
		assertEquals(1, comision.getProfesores().size());
	}

	@Test
	public void queNoSePuedaAgregarUnAlumnoAUnaMateriaSiNoTieneSusCorrelativas() {
		// preparacion
		Materia materiaActual = new Materia("Pb2");
		Materia materiaPrevia = new Materia("Pb1");

		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(2004, 8, 6);
		
		Alumno alumno = new Alumno("nombre", "apellido", 0205152,fechaNacimiento);
		Aula aula = new Aula(50);

		// ejecucion
		materiaActual.setMateriasCorrelativas(materiaPrevia);

		materiaActual.getMateriasCorrelativas();
		// validacion
		//assertNotNull(comision);
	}

	/*
	 * 
	 *
	 * 
	 * @Test public void queSePuedaIngresarUnAlumnoAUnaComision() { // preparacion
	 * String nombre = ""; String apellido = ""; Integer dni = 46564678; // usuario
	 * para ingresar String contrasenia = ""; // LocalDate fechaIngreso; String
	 * nombreMateria = "pb2"; Materia materia = new Materia(nombreMateria); Aula
	 * aula = new Aula(215, 50); ArrayList<Alumno> alumnos = new
	 * ArrayList<Alumno>(); ArrayList<Profesor> profesores = new
	 * ArrayList<Profesor>(); CicloLectivo cicloLectivo = new CicloLectivo(2023,
	 * Cuatrimestre.SEGUNDO_CUATRIMESTRE); Comision comision = new Comision(materia,
	 * aula, Turno.MANIANA, cicloLectivo, alumnos, profesores);
	 * 
	 * // ejecucion Alumno alumno = new Alumno(nombre, apellido, dni, contrasenia);
	 * 
	 * // comision
	 * 
	 * // validacion assertNotNull(alumno); assertEquals(alumno.getDni(),
	 * alumnos.get(0).getDni()); }
	 * 
	 * @Test public void queSePuedaAgregarUnaMateria() { // preparacion String
	 * nombreMateria = "Matematica";
	 * 
	 * // ejecucion Materia materia = new Materia(nombreMateria);
	 * 
	 * // validacion assertNotNull(materia); }
	 * 
	 * @Test public void queNoSePuedanAgregarMateriasConMismoCodigo() { //
	 * preparacion String nombreMateria = "Matematica"; String nombreMateria2 =
	 * "Base De Datos";
	 * 
	 * // ejecucion Materia materia = new Materia(nombreMateria); Materia materia2 =
	 * new Materia(nombreMateria2);
	 * 
	 * // validacion assertNotNull(materia); assertNotNull(materia2);
	 * assertNotEquals(materia.getCodigoMateria(), materia2.getCodigoMateria()); }
	 * 
	 * @Test public void queSePuedaAgregarCorrelativaAUnaMateria() { // preparacion
	 * String nombreMateria = "pb1"; String nombreMateria2 = "pb2"; // ejecucion
	 * Materia materia = new Materia(nombreMateria); Materia materia2 = new
	 * Materia(nombreMateria2); ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	 * 
	 * // validacion
	 * 
	 * }
	 * 
	 * @Test public void
	 * queNoSePuedaAgregarUnAlumnoAUnaMateriaSiNoTieneSusCorrelativas() { //
	 * preparacion Materia materiaActual= new Materia("Pb2"); Materia materiaPrevia=
	 * new Materia("Pb1"); Alumno alumno = new
	 * Alumno("nombre","apellido","uwu",0202); Aula aula = new Aula(12, 50);
	 * 
	 * // ejecucion materiaActual.setMateriasCorrelativas(materiaPrevia);
	 * 
	 * materiaActual.getMateriasCorrelativas(); // validacion assertNotNull(curso);
	 * }
	 * 
	 * @Test public void queSePuedaCrearUnAula() { // preparacion Integer numeroAula
	 * = 0; Integer capacidad = 0;
	 * 
	 * // ejecucion Aula aula = new Aula(numeroAula, capacidad);
	 * 
	 * // validacion assertNotNull(aula); }
	 * 
	 * @Test public void queSePuedaCrearUnCicloLectivo() { // preparacion
	 * 
	 * Integer anio = 0; Cuatrimestre cuatrimestre =
	 * Cuatrimestre.SEGUNDO_CUATRIMESTRE;
	 * 
	 * // ejecucion CicloLectivo cicloLectivo = new CicloLectivo(anio,
	 * cuatrimestre);
	 * 
	 * // validacion assertNotNull(cicloLectivo); }
	 * 
	 * /*
	 * 
	 * @Test public void queSePuedaCrearUnaNota() { // preparacion Double valorNota
	 * = 0.0;
	 * 
	 * // ejecucion Nota nota = new Nota(valorNota);
	 * 
	 * // validacion assertNotNull(nota);
	 * 
	 * }
	 */

}
