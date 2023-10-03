package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el primer número
		int num1;
		
		// Variable donde guardaremos el segundo número
		int num2;
		
		// Variable donde guardaremos el tercer número
		int num3;
		
		// Le pedimos al usuario 3 números
		System.out.println("Dime 3 números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		// Hacemos todas las comprobaciones para ordenarlos
		// Primero comprobamos si el num1 es el mayor
		if (num1 >= num2 && num1 >= num3) {
			// En caso de que num1 sea el mayor, comprobamos si num2 es el segundo mayor
			if (num2 >= num3) {
				System.out.println("Ordenados quedaria --> " + num1 + " --> " + num2 + " --> " + num3);
			// En caso contrario num3 sera el segundo mayor	
			} else {
				System.out.println("Ordenados quedaria --> " + num1 + " --> " + num3 + " --> " + num2);
			}
		// Comprobamos si el num2 es el mayor
		} else if (num2 >= num1 && num2 >= num3) {
			// En caso de que num2 sea el mayor, comprobamos si num1 es el segundo mayor
			if (num1 >= num3) {
				System.out.println("Ordenados quedaria --> " + num2 + " --> " + num1 + " --> " + num3);
			// En caso contrario num3 sera el segundo mayor	
			} else {
				System.out.println("Ordenados quedaria --> " + num2 + " --> " + num3 + " --> " + num1);
			}
		// Comprobamos si el num3 es el mayor
		} else {
			// En caso de que num3 sea el mayor, comprobamos si num1 es el segundo mayor
			if (num1 >= num2) {
				System.out.println("Ordenados quedaria --> " + num3 + " --> " + num1 + " --> " + num2);
			// En caso contrario num2 sera el segundo mayor			
			} else {
				System.out.println("Ordenados quedaria --> " + num3 + " --> " + num2 + " --> " + num1);
			}
		}
		
		// Cerramos el scanner
		sc.close();
		    

	}

}
