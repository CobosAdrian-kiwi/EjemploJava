package com;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String llueveStr, biblioStr, tareaStr;
		boolean lloviendo, biblioteca, tarea, puedeSalir;
		
		System.out.println("¿Está lloviendo (si/no)?");
		llueveStr = sc.nextLine();
		
		lloviendo = llueveStr == "si";
		
		System.out.println("¿Tienes tarea (si/no)?");
		tareaStr = sc.nextLine();
		
		tarea = tareaStr == "si";
		
		System.out.println("¿Tienes que ir a la biblioteca (si/no)?");
		biblioStr = sc.nextLine();
		
		biblioteca = biblioStr == "si";
		
		puedeSalir = lloviendo == false && tarea == false || biblioteca == true;
		
		System.out.println("Puede salir? " + puedeSalir);
	}

}
