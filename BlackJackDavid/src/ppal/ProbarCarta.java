package ppal;

import clases.Carta;
import clases.Carta.Palo;

public class ProbarCarta {

	public static void main(String[] args) {
		
		Carta nueva = new Carta(12, Palo.CORAZONES);
		
		System.out.println("La carta es "+ nueva);

	}

}
