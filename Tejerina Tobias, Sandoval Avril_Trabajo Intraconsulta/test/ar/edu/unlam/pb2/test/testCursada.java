package ar.edu.unlam.pb2.test;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Alumno;
import ar.edu.unlam.pb2.dominio.Aula;
import ar.edu.unlam.pb2.dominio.CicloLectivo;
import ar.edu.unlam.pb2.dominio.Comision;
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
	public void queSePuedaLoguearUnProfesor() {
		// preparacion
		String nombre = "Sergei";
		String apellido = "";
		Integer dni = 00000000; // usuario para ingresar
		String contrasenia = "";
		String nombreUniversidad = "";
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Comision> comisiones = new ArrayList<Comision>();

		// ejecucion
		Profesor profesor = new Profesor(nombre, apellido, dni, contrasenia);
		Universidad universidad = new Universidad(nombreUniversidad, profesores, alumnos, materias, comisiones);
		
		// validacion
		assertNotNull(profesor);
		assertNotNull(universidad);
		assertNotNull(universidad.getProfesores(0));
	}

	@Test
	public void queSePuedaLoguearUnAlumno() {
		// preparacion
		String nombre = "";
		String apellido = "";
		Integer dni = 00000000; // usuario para ingresar
		String contrasenia = "";
		// LocalDate fechaIngreso;

		// ejecucion
		Alumno alumno = new Alumno(nombre, apellido, dni, contrasenia);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(alumno);

		// validacion
		assertNotNull(alumno);
		assertEquals(alumno, alumnos.get(0));
		alumno.getDni();
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
		Integer cuatrimestre = 0;

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

	public void queSePuedaCrearUnaCursada() {
		// preparacion
		Materia materiaAsignada = new Materia("Programacion", 20);
		Integer codigoComision = 0;
		Aula aula = new Aula(12, 50);
		Turno turno = Turno.MANIANA;
		CicloLectivo cicloLectivo = new CicloLectivo(2023, 2);

		// ejecucion
		Comision curso = new Comision(materiaAsignada, codigoComision, aula, turno, cicloLectivo);

		// validacion
		assertNotNull(curso);

	}

}
