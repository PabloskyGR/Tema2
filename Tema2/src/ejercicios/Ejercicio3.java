package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el numero introducido
		double num;
		
		// Le pedimos al usuario que nos intriduzca un número
		System.out.println("Dime un número:");
		num = sc.nextDouble();
		
		// Comprobamos si el numero es casi-cero o no y mostramos el mensaje
		if (num >= 1 || num == 0 || num <= -1) {
			System.out.println("El número introducido no es casi-cero");
		} else {
			System.out.println("El número introducido es casi-cero");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
