package dao;

import model.Produto;

public class ProdutoDAO extends GenericDAO<Produto>{
	
private static ProdutoDAO instancia;
	
	private ProdutoDAO() {
		
	}
	
	public static ProdutoDAO getInstancia() {
		if (instancia == null) {
			instancia = new ProdutoDAO();
			return instancia;
		} else {
			return instancia;
		}
		
	}

}
