package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;


import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
		Alumno a = new Alumno();
		assertTrue("No coincide nombre", 
				a.getNombre().equals(Alumno.NOMBRE_ANONIMO));
		
	}

	@Test
	public void constructorConNombre() {
		String nombre = "Santi";
		Alumno a = new Alumno(nombre);
		assertTrue("El alumno no se ha creado con el nombre correcto", 
				a.getNombre().equals(nombre) );
	}

	@Test
	public void letraNombreMayus() {
		String nombre = "manolo";
		Alumno a = new Alumno();
		a.setNombre(nombre);
		assertTrue("El nombre no se ha guardado correctamente", 
				Character.isUpperCase(a.getNombre().charAt(0)));
	}

	@Test
	public void testIsMayorEdad() {
		int edad = 18;
		Alumno a = new Alumno();
		a.setEdad(edad);
		assertTrue("No reconoce bien la mayoria de edad", 
				a.isMayorEdad());
	}

}
