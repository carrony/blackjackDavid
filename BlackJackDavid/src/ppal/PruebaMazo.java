package ppal;

import clases.Carta;
import clases.Mazo;
import excepciones.NoHayMasCartasException;

public class PruebaMazo {

	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		
		System.out.println("Barajando...");
		mazo.barajar();
		System.out.println(mazo);
		
		boolean hayCartas=true;
		do {
			try {
				Carta c= mazo.solicitarCarta();
				System.out.println(c);	
			} catch (NoHayMasCartasException e) {
				System.out.println("No hay mas cartas");
				hayCartas=false;
			}
		}while(hayCartas);

		
//		try {
//			do {
//					Carta c= mazo.solicitarCarta();
//			}while(true);
//		} catch (NoHayMasCartasException e) {
//			System.out.println("No hay mas cartas");
//		}
	}

}
