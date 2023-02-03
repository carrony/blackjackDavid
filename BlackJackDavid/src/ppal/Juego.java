package ppal;

import java.util.Scanner;

import clases.Mano;
import clases.Mazo;
import excepciones.NoHayMasCartasException;

public class Juego {

	private static Mazo baraja;
	private static Mano jugador;
	private static Mano banca;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			inicializaJuego();
			String respuesta="";
			do {
				System.out.println("¿Quiéres carta (S/N):");
				respuesta = teclado.nextLine();
				
				if (respuesta.equalsIgnoreCase("S")) {
					jugador.pedirCarta(baraja);
					System.out.println("Tus cartas son: "+jugador);
				} else if (respuesta.equalsIgnoreCase("n")){
					// El usuario se planta
					System.out.println("Te has plantado con "+jugador);
				} else {
					System.out.println("Debe introducir S o N");
				}
				
			} while (!respuesta.equalsIgnoreCase("n")
					&& !jugador.finDeJuego());
			
			
			
			
			
			
		}catch(NoHayMasCartasException e) {
			System.out.println("No hay mas cartas en la baraja.\n"
					+ "Fin de juego");
			System.out.println("Tus cartas son:"+jugador);
		}
		
		
		
	}

	public static void inicializaJuego() {
		baraja = new Mazo();
		jugador = new Mano();
		banca = new Mano();
		
		baraja.barajar();
	}
	
	
	
}
