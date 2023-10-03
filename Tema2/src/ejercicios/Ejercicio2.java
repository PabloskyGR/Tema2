package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el primero número introducido
		int num1;
		
		// Variable donde guardaremos el segundo número introducido
		int num2;
		
		// Le pedimos al usuario dos números enteros
		System.out.println("Dime dos números enteros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Comprobamos si son iguales y mostramos el correspondiente mensaje
		if (num1 == num2) {
			System.out.println("Los números introducidos son iguales");
		} else {
			System.out.println("Los números introducidos no son iguales");
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
