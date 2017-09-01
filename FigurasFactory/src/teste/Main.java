package teste;

import exemplo.Figura;
import exemplo.FiguraFactory;

public class Main {
	
	public static void main(String[] args) {
		
//		FiguraFactory fabrica = new FiguraFactory();
		
		Figura figura1 = FiguraFactory.getFigura("QUADRADO");
		figura1.desenhar();
		
		Figura figura2 = FiguraFactory.getFigura("triangulo");
		figura2.desenhar();		
	}
}
