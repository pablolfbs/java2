package controller;

import model.Cliente;
import model.dao.ClienteDao;

public class Teste {
	
	public static void main(String[] args) {
		
	ClienteDao cDao = ClienteDao.getInstancia();
	Cliente c = new Cliente();
	
	c.setNome("Pablo");
	c.setCpf("07637049701");
	
	cDao.persist(c);
	
	}
	
}
