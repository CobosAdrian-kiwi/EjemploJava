package com;

public class TiposDatos {

	public static void main(String[] args) {
		// Tipos de datos
		
		int numero = 100;
		final int constante = 100; //en vez de variable con el final es una constante
		float num_decimal = 1.5F;
		double num_decimal2 = 1.4;
		boolean logico = true;
		String palabra = "Hola";
		char caracter = 'H';
		
		System.out.println("Numero: " + numero);
		System.out.println("Decimal (Float): " + num_decimal);
		System.out.println("Decimal (Double): " + num_decimal2);
		System.out.println("Lógico (booleano): " + logico);
		System.out.println("Palabra: " + palabra);
		System.out.println("Letra / Caracter suelto: " + caracter);
		System.out.println("barra alreves + t = tab y con n = salto de linea");	
	}

}
