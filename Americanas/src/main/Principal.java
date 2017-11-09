package main;

import controle.Autenticavel;

public class Principal {
	
	// Polimorfismo no método
	public void concedeAcesso(Autenticavel a) {
		a.efetuaLogin();
	}
	
	public static void main(String[] args) {
		
		
	}

}
