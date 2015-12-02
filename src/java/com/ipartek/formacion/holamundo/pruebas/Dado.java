package com.ipartek.formacion.holamundo.pruebas;

import java.util.Random;

/**
 * Clase Java para simular un dado y sacar un alumno de modo aleatorio
 * 
 * @author Curso
 *
 */

public class Dado {
	
	/**
	 * Variable para representar el numero de alumnos static: Solo se reserva
	 * memoria una vez final: No es modificable => Es una constante int: Tipo
	 * interger, entero
	 */
	public static final int NUMERO_ALUMNOS = 15;

	public static final String NOMBRE_ALUMNOS[] = { "David Ibarzabal", "Oscar", "Gorka", "Ariane", "Gontzal", "Aitor",
			"Santi", "Raul", "David Ortiz", "Sergio", "David Barbudo", "Edorta", "Asier", "Alberto", "Iñigo" };

	/**
	 * Muestra por consola todos los alumnos del array
	 * <code>NOMBRE_ALUMNOS</code>.<br>
	 * ejemplo:
	 * <ul>
	 * <li>[0] David Ibarzabal</li>
	 * <li>[1] Oscar</li>
	 * <li>[x] ...</li>
	 * <li>[x] ...</li>
	 * <li>[14] Iñigo</li>
	 * </ul>
	 */
	// Por defecto ambito: Package
	public static void mostrarAlumnos() {
		for (int i = 0; i < NOMBRE_ALUMNOS.length; i++) {
			System.out.println("[" + i + "] " + NOMBRE_ALUMNOS[i]);
		}
	}

	/**
	 * Genera numero aleatorio entre 0 y <code>NUMERO_ALUMNOS</code> Utilizamos
	 * funcion Random del paquete util de Java. Método nextInt() *
	 * cantidad_numeros_rango + término_inicial_rango
	 * 
	 * @return numero entero, si falla -1
	 */
	public static int generarNumero() {
		int resul = -1;
		Random md = new Random();
		resul = md.nextInt(NUMERO_ALUMNOS);
		System.out.println("El número aleatorio es: " + resul);
		return resul;
	}
	
	/**
	 * 
	 */
	public static String mostrarAfortunado(){
		String resul = "No hay aforunado";
		int numAleatorio = generarNumero();
		resul = mostrarAfortunado(numAleatorio);
		return resul;
		
	}
	
	/**
	 * 
	 */
	public static String mostrarAfortunado( int numeroAleatorio ){
		String resul = "No hay afortunado";
		return "El afortunado es: "+NOMBRE_ALUMNOS[numeroAleatorio];
		
	}
	

	public static void main(String[] args) {

		mostrarAlumnos();

		System.out.println("El afortunado en leer es: ");

		System.out.println(NOMBRE_ALUMNOS[generarNumero()]);

	}

}
