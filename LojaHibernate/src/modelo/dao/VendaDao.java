package modelo.dao;

import modelo.Venda;

public class VendaDao extends DaoGenerico<Venda>{

	private static VendaDao instancia;

	private VendaDao(){

	}

	public static VendaDao getInstancia(){

		if(instancia == null){
			instancia = new VendaDao();
			return instancia;
		} else {
			return instancia;
		}

	}

}
