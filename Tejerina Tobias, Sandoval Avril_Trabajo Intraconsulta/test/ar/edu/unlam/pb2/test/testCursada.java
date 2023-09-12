package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCursada {

	@Test
	public void queSePuedaLoguearUnProfesor() {
		// preparacion
		String nombre = "";
		String apellido = "";
		Integer dni = 00000000; // usuario para ingresar
		String contrasenia = "";

		// ejecucion
		Profesor profesor = new Profesor(nombre, apellido, dni, contrasenia);

		// validacion
		assertNotNull(profesor);
	}

	@Test
	public void queSePuedaLoguearUnAlumno() {
		// preparacion
		String nombre = "";
		String apellido = "";
		Integer dni = 00000000; // usuario para ingresar
		String contrasenia = "";

		// ejecucion
		Alumno alumno = new Alumno(nombre, apellido, dni, contrasenia);

		// validacion
		assertNotNull(alumno);
	}

	@Test
	public void queSePuedaAregarUnaMateria() {
		// preparacion
		String nombreMateria = "";
		Integer codigoMateria = 0;

		// ejecucion
		Materia materia = new Materia(nombreMateria, codigoMateria);

		// validacion
		assertNotNull(materia);
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
		Semana diaIniciacion;
		Mes mesIniciacion; 
		Integer anio = 0;
		Integer cuatrimestre = 0;

		// ejecucion
		CicloLectivo cicloLectivo = new CicloLectivo(diaIniciacion, mesIniciacion, anio, cuatrimestre);

		// validacion
		assertNotNull(cicloLectivo);
	}
	
	@Test
	public void queSePuedaCrearUnaNota() {
		// preparacion
		Double valorNota = 0.0;

		// ejecucion
		Nota nota = new Nota(valorNota);

		// validacion
		assertNotNull(nota);
	}
}
