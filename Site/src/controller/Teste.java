package controller;

import model.Cadastro;
import model.dao.CadastroDao;

public class Teste {
	
	public static void main(String[] args) {
		
		CadastroDao cDao = new CadastroDao();
		
		Cadastro c = new Cadastro();
		
		c.setLogin("pablo");
		c.setSenha("123");
		
	}

}
