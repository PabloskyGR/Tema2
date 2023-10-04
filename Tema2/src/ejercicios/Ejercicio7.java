package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número comprendido entre 0-99999:");
		num = sc.nextInt();
		
		// Comprobamos si el número no es correcto y mostramos un mensaje de error en caso de que no lo sea
		if (num > 99999 || num < 0) {
			System.err.println("Número introducido no es correcto");
		// Comprobamos si el número tiene 5 cifras
		} else if (num > 9999) {
			System.out.println("El número tiene 5 cifras");
		// Comprobamos si el número tiene 4 cifras
		} else if (num > 999) {
			System.out.println("El número tiene 4 cifras");
		// Comprobamos si el número tiene 3 cifras
		} else if (num > 99) {
			System.out.println("El número tiene 3 cifras");
		// Comprobamos si el número tiene 2 cifras
		} else if (num > 9) {
			System.out.println("El número tiene 2 cifras");
		// Comprobamos si el número tiene 1 cifras
		} else {
			System.out.println("El número tiene 1 cifra");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
