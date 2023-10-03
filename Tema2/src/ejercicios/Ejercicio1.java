package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número del usuario
		int num;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número: ");
		num = sc.nextInt();
		
		// Usamos los condicionales para comprobar si es par o impar y mostrarlo
		if (num % 2 == 0) {
			System.out.println("Tu número " + num + " es par");
		} else {
			System.out.println("Tu número " + num + " es impar");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
