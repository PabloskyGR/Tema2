package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		int b;
		
		int c;
		
		double x1;
		
		double x2;
		
		System.out.println("Le pedimos al usuario los valores de 'a', 'b' y 'c' para resolver una ecuación de 2º grado");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		x1 = (((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		x2 = (((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		
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
		
		sc.close();

	}

}
