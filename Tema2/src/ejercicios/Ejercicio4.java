package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el primer número introducido
		int num1;
		
		// Variable donde guardaremos el segundo número introducido
		int num2;
		
		// Le pedimos al usuario 2 números
		System.out.println("Dime dos números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Comprobamos que número es menor y los mostramos de menor a mayor
		if (num1 < num2) {
			System.out.println("Así quedaría ordenado de menor a mayor: " + num1 + " --> " + num2);
		} else {
			System.out.println("Así quedaría ordenado de menor a mayor: " + num2 + " --> " + num1);
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
