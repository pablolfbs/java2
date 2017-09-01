package exemplo;

public class JanelaPrincipal {
	
	private static JanelaPrincipal instancia;
	// Construtor da classe private
	private JanelaPrincipal() {
		
	}
	public static JanelaPrincipal getInstancia() {
		if(instancia == null) {
			instancia = new JanelaPrincipal();
			return instancia;
		} else {
			return instancia;
		}
	}
	public void exibeMensagem() {
		System.out.println("Olá, JanelaPrincipal");
	}	
}
