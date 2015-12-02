package com.ipartek.formacion.holamundo.pojo;

/**
 * Clase instanciable de tipo POJO o BEAN para representar a un alumno de un curso
 * @author Curso
 *
 */

public class Alumno {
	
	public static final String NOMBRE_ANONIMO = "Anonimo";
	public static final String NOMBRE_SIN_DEFINIR = "Sin definir";
	public static final char SEXO_HOMBRE = 'H';
	public static final char SEXO_MUJER = 'M';
	public static final char SEXO_INDEFINIDO = 'I';
	
	/* atributos
	 ******************/
	private String nombre;
	private String apellido;
	private boolean becado;
	private int edad;
	private char sexo;	// 'H':hombre, ''M:mujer, 'I':indefinido
	
	
	/* constructores
	 ******************/
	
	/**
	 * Un <code>Alumno</code> recien instanciado tendra los siguientes valores:
	 * <ul>
	 * 	<li><code>nombre</code>: NOMBRE_ANONIMO</li>
	 *  <li><code>apellido</code>: ""</li>
	 *  <li><code>becado</code>: false</li>
	 *  <li><code>edad</code>: 0</li>
	 *  <li><code>sexo</code>: SEXO_INDEFINIDO</li>
	 * </ul>
	 */
	public Alumno() {
		super();
		this.nombre = NOMBRE_ANONIMO;
		this.apellido = "";
		this.becado = false;
		this.edad = 0;
		this.sexo = SEXO_INDEFINIDO;
	}
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		this.apellido = "";
		this.becado = false;
		this.edad = 0;
		this.sexo = SEXO_INDEFINIDO;
	}

	
	/* gets y sets
	 ******************/
	public String getNombre() {
		return nombre;
	}

	
	/**
	 * Guardamos el nombre con la primera inicial en mayusculas.<br>
	 * Si (nombre = null) V (nombre = "") => nombre = "Sin definir" 
	 * @param nombre <String> nombre de la persona a guardar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	/* funciones heredadas
	 ******************/
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", becado=" + becado + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	
	/* funciones propias
	 ******************/
	/**
	 * Comprueba si es mayor de edad
	 * @return true <code>this.edad</code> > 18, false en caso contrario
	 */
	public boolean isMayorEdad(){
		boolean resul = false;
		
		if (this.edad >= 18) {
			resul = true;
		}
		
		return resul;
	}
	
}
