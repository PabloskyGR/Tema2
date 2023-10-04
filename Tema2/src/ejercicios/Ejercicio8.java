package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la nota que introduzca el usuario
		int nota;
		
		// Le pedimos al usuario una nota
		System.out.println("Dime tu nota:");
		nota = sc.nextInt();
		
		// Comprobamos en que rango esta la nota introducida y mostramos el mensaje pertinente
		if (nota >= 0 && nota < 5) {
			System.out.println("Tienes un INSUFICIENTE");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Tienes un SUFICIENTE");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Tienes un BIEN");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Tienes un NOTABLE");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Tienes un SOBRESALIENTE");
		} else {
			System.err.println("Nota no válida");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
