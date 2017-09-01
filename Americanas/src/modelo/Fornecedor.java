package modelo;

import controle.Autenticavel;

public class Fornecedor implements Autenticavel {
	
	private String cnpj;
	private String razaoSocial;
	
	@Override
	public boolean efetuaLogin() {
		
		return false;
	}
	
}
