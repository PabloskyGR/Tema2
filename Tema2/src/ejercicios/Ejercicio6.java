package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el valor de "a"
		int a;
		
		// Variable donde guardaremos el valor de "b"
		int b;
		
		// Variable donde guardaremos el valor de "c"
		int c;
		
		// Variable donde guardaremos el primer resultado de la ecuación
		int x1;
		
		// Variable donde guardaremos el segundo resultado de la ecuación
		int x2;
		
		// Le pedimos al usuario los valores de 'a', 'b' y 'c' para resolver una ecuación de 2º grado
		System.out.println("Dime los valores de  'a', 'b' y 'c' para resolver una ecuación de 2º grado");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// Sacamos el primer resultado de la ecuación
		x1 = (int) (((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		
		// Sacamos la segunda respuesta de la ecuación
		x2 = (int) (((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		
		// Comprobamos si las soluciones de la ecuación existen o no y cuanto valdría en caso de existir
		System.out.println(x1);
		if (x1 > 0) {
			System.out.println("'x1' valdría: " + x1);
			if (x2 > 0) {
				System.out.println("Y 'x2' valdria: " + x2);
			} else {
				System.out.println("Y 'x2' no existiría");
			}
		} else {
			System.out.println("'x1' no existiría");
			if (x2 > 0) {
				System.out.println("Y 'x2' valdria: " + x2);
			} else {
				System.out.println("Y 'x2' no existiría");
			}
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
