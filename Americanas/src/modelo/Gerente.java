package modelo;

import controle.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public boolean efetuaLogin() {
		
		return false;
	}	
	
}
