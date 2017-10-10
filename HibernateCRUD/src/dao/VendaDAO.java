package dao;

import model.Venda;

public class VendaDAO extends GenericDAO<Venda> {
	
private static VendaDAO instancia;
	
	private VendaDAO() {
		
	}
	
	public static VendaDAO getInstancia() {
		if (instancia == null) {
			instancia = new VendaDAO();
			return instancia;
		} else {
			return instancia;
		}
		
	}

}
