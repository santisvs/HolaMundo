package com.ipartek.formacion.holamundo.pruebas;

import com.ipartek.formacion.holamundo.pojo.Alumno;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Primer Ejercicio:");

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Par " + i);
			} else {
				System.out.println("Impar " + i);
			}
		}

		System.out.println("//////// FIN EJERCICIO ///////");
		
		Alumno a1 = new Alumno("Manolo");
		Alumno a2 = new Alumno("Manolita");
		Alumno a3 = new Alumno("Heufrasio");
		
		
		//Cambio para probar GIT
		
	}

}
