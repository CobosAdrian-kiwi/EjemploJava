package com;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//definimos los coeficientes
		double coefA, coefB, coefC, ResultadoX1, ResultadoX2, Delta, DeltaRaiz;
		
		//Pedimos los coeficientes
		System.out.println("Dime cuanto vale a, b y c");
		coefA = sc.nextDouble();
		coefB = sc.nextDouble();
		coefC = sc.nextDouble();
		
		//Calculamos cuanto vale Delta que, en la ecuación es la raiz cuadrada √b^2 - 4aC
		Delta = (coefB * coefB) - 4 * coefA * coefC;
		DeltaRaiz = Math.sqrt(Delta);
		
		/*
		* Comprobar si a es 0 porque si a = 0 y b no es cero la ecuación con b y c sería de
		* primer grado.		
		*/
		if (coefA == 0) {
			
			if (coefB != 0) {
				ResultadoX1 = -coefC / coefB;
				System.out.println("Esto es una ecuacion de primer grado... x = " + ResultadoX1);
			} else {
				//Si a es cero y c es cero la ecuación tendría infinitas soluciones
				if (coefC == 0) {
					System.out.println("La ecuación tiene infinitas soluciones (0=0).");
				} else {
					//Si a es 0, b es 0 y c es otra cosa la ecuación es inconsistente
					System.out.println("La ecuación no tiene solcucion (inconsistente)");
				}
			}
		
		} else {

			//Aquí comprobamos si el resultado de la raiz es mayor que cero, si es así
			//hay 2 soluciones posibles, las calculamos
			if (DeltaRaiz > 0) {
					
			ResultadoX1 = ((-1 * coefB) + DeltaRaiz) / (2 * coefA);
			ResultadoX2 = ((-1 * coefB) + (-1 *DeltaRaiz)) / (2* coefA);
			
			System.out.println("Dado los cocientes hay 2 resultados Reales: " + ResultadoX1 + " y "+ ResultadoX2);
					
			}else if (DeltaRaiz == 0) {

			//Si el resultado de la raiz es igual a 0 entonces hay una solucion posible, asi que la mostramos
			//y el 2do resultado lo definimos como 0
			ResultadoX1 = ((-1 * coefB) + DeltaRaiz) / (2 * coefA);
			ResultadoX2 = 0;
			
			System.out.println("Dado los cocientes hay 1 resultado Real: " + ResultadoX1);
			
		}else{
			//Si el resultado de la raiz es igual a negativo entonces no hay soluciones reales
			//serían irreales y por tanto lo decimos y definimos ambos resultados como 0
			System.out.println("Dado los cocientes hay 0 soluciones reales...");
			
			ResultadoX1 = 0;
			ResultadoX2 = 0;
		}
	}
	}

}

