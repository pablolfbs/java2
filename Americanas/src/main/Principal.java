package main;

import controle.Autenticavel;

public class Principal {
	
	// Polimorfismo no m�todo
	public void concedeAcesso(Autenticavel a) {
		a.efetuaLogin();
	}
	
	public static void main(String[] args) {
		
		
	}

}
