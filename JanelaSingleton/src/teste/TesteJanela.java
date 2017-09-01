package teste;

import exemplo.JanelaPrincipal;

public class TesteJanela {
	
	public static void main(String[] args) {
		
		JanelaPrincipal obj = JanelaPrincipal.getInstancia();
		obj.exibeMensagem();
		
		JanelaPrincipal obj2 = JanelaPrincipal.getInstancia();
		obj2.exibeMensagem();
		
		System.out.println(obj);
		System.out.println(obj2);
	}
	
}
