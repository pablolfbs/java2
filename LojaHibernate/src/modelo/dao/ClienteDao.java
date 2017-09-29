package modelo.dao;

import modelo.Cliente;

public class ClienteDao extends DaoGenerico<Cliente>{
	
	private static ClienteDao instancia;
	
	private ClienteDao(){
		
	}
	
	public static ClienteDao getInstancia(){
		
		if(instancia == null){
			instancia = new ClienteDao();
			return instancia;
		} else {
			return instancia;
		}
		
	}

}
