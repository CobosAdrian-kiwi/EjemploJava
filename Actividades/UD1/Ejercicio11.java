package com;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float KGmanzanas1, KGperas1, KGmanzanas2, KGperas2;
		double manzanasBeneficio, perasBeneficio, totalBeneficio;
		//Pregunto los KG vendidos el 1er semestre
		System.out.println("Inserte los KG de manzanas vendidos el primer semestre:");
		KGmanzanas1 = sc.nextFloat();
		
		System.out.println("Inserte los KG de peras vendidos el primer semenstre:");
		KGperas1 = sc.nextFloat();
		
		//Pregunto los KG vendidos el 2do semestre
		System.out.println("Inserte los KG de manzanas vendidos el segundo semestre:");
		KGmanzanas2 = sc.nextFloat();
		
		System.out.println("Inserte los KG de peras vendidos el segundo semenstre:");
		KGperas2 = sc.nextFloat();
		
		//Calculo las ganancias de cada fruta en los 2 semestres
		manzanasBeneficio = (KGmanzanas1 * 2.35) + (KGmanzanas2 * 2.35);
		perasBeneficio = (KGperas1 * 1.95) + (KGperas2 * 1.95);
		
		//Sumo las ganancias de ambas frutas
		totalBeneficio = manzanasBeneficio + perasBeneficio;
		
		System.out.println("El total de ganancias ha sido: " + totalBeneficio + " €");

	}

}