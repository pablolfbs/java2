package model.dao;

import model.Cliente;

public class ClienteDao extends GenericDao<Cliente> {

	private static ClienteDao instancia;

	private ClienteDao() {

	}

	public static ClienteDao getInstancia() {

		if (instancia == null) {
			instancia = new ClienteDao();
			return instancia;
		} else {
			return instancia;
		}

	}

}
