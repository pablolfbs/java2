package controller;

import view.ViewSistema;

public class ControladorPrincipal {

	public static void main(String[] args) {
		
		ViewSistema sistema = new ViewSistema();
		
		ControladorReserva ctrlReserva = new ControladorReserva();
		
		sistema.criarTelaPrincipal();
		sistema.criarTelaCadastro(ctrlReserva);
		
	}

}
