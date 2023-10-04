package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el primer número
		int num1;
		
		// Variable donde guardaremos el segundo número
		int num2;
		
		// Variable donde guardaremos el tercer número
		int num3;
		
		// Le pedimos al usuario los 3 números 
		System.out.println("Dime 3 números enteros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		// Comprobamos si la suma del primer y dels egundo número da como resultado el tercer número y mostramos el mensaje 
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " + " + num2 + " si da como el resultado el número " + num3);
		} else {
			System.out.println("La suma de " + num1 + " + " + num2 + " no da como el resultado el número " + num3);
		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
