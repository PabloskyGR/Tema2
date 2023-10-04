package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la respuesta del primer jugador
		String jugador1;
		
		// Variable donde guardaremos la respuesta del segundo jugador
		String jugador2;
		
		// Le pedimos al primer jugador que opción quiere jugar
		System.out.println("Jugador 1, dime que quieres sacar: PIEDRA, PAPEL O TIJERA:");
		jugador1 = sc.nextLine().toLowerCase();
		
		// Le pedimos al segundo jugador que opción quiere jugar
		System.out.println("Jugador 2, dime que quieres sacar: PIEDRA, PAPEL O TIJERA:");
		jugador2 = sc.nextLine().toLowerCase();

		// Comprobamos las diferentes jugadas para saber quien es el ganador y mostramos el mensaje del jugador que haya ganado
		
/*		if (!jugador1.equals("piedra") || !jugador1.equals("papel") || !jugador1.equals("tijera") ||
			!jugador2.equals("piedra") || !jugador2.equals("papel") || !jugador2.equals("tijera")) 	{
			System.err.println("Juego no válido"); */
/*		} else */ if (jugador1.equals(jugador2)) {
			System.out.println("EMPATE, volved a repetir");
		} else if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
			System.out.println("FELICIDADES JUGADOR 1, HAS GANADO");
		} else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
			System.out.println("FELICIDADES JUGADOR 1, HAS GANADO");
		} else if (jugador1.equals("tijera") && jugador2.equals("papel")) {
			System.out.println("FELICIDADES JUGADOR 1, HAS GANADO");
		} else {
			System.out.println("FELICIDADES JUGADOR 2, HAS GANADO");
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
