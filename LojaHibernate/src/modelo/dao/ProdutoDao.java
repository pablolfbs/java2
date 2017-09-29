package modelo.dao;

import modelo.Produto;

public class ProdutoDao extends DaoGenerico<Produto>{

	private static ProdutoDao instancia;

	private ProdutoDao(){

	}

	public static ProdutoDao getInstancia(){

		if(instancia == null){
			instancia = new ProdutoDao();
			return instancia;
		} else {
			return instancia;
		}

	}

}
