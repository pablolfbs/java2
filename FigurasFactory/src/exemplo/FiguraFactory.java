package exemplo;

public class FiguraFactory {
	
	public static Figura getFigura(String tipoFigura) {
		if(tipoFigura == null) {
			return null;
		}
		if (tipoFigura.equalsIgnoreCase("circulo")) {
			return new Circulo();
		} else if(tipoFigura.equalsIgnoreCase("triangulo")) {
			return new Triangulo();
		} else if(tipoFigura.equalsIgnoreCase("quadrado")) {
			return new Quadrado();
		}
		return null;
	}
}
