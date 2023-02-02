package clases;

public class Carta {

	public enum Palo {
			TREBOl, DIAMANTE ,CORAZONES, PICAS
	};
	
//	private static int valores [] = {
//			11, 2, 3, 4,5, 6, 7, 8, 9, 10, 10, 10, 10};
//	private static String representacion [] = {
//			"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
//			"J", "Q", "K"};
	
	private int numero;
	private Palo palo;
	
	
	public Carta(int numero, Palo palo) {
		if (numero>=1 && numero<=13) {
			this.numero = numero;
			this.palo = palo;
		}
	}

	public int getNumero() {
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}
	
	public int getValor() {
		int valor;
		
		if (this.numero>=2 && this.numero<=10) {
			valor=this.numero;
		} else if (this.numero==1){
			valor=11;
		} else {
			valor=10;
		}
		
//		switch(this.numero) {
//		case 1: return 11;
//		case 11:
//		case 12:
//		case 13:return 10;
//		default: return this.numero;
//		}
		return valor;
		
//		return valores[this.numero-1];
	}
	
	public String mostrarNumero() {
		switch(this.numero) {
		case 1: return "AS";
		case 11: return "J";
		case 12: return "Q";
		case 13:return  "K";
		default: return ""+this.numero;
		}
//		return representacion[this.numero-1];
	}

	@Override
	public String toString() {
		return "["+ mostrarNumero() + " - " + palo + "]";
	}

}
