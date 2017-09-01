package modelo;

import controle.Autenticavel;

public class Cliente extends Pessoa implements Autenticavel {

	@Override
	public boolean efetuaLogin() {

		return false;
	}
	
}
