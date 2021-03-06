package modelo.dao;

import java.util.List;

import javax.persistence.Query;

import modelo.Venda;

public class VendaDao extends DaoGenerico<Venda>{
	
	private static VendaDao instancia;
	
	private VendaDao() {
		
	}
	
	public static VendaDao getInstancia() {
		if (instancia == null) {
			instancia = new VendaDao();
			return instancia;
		} else {
			return instancia;
		}
	}
	
	public List<Venda> buscaPorCliente(int idCliente) {
		Query q = entityManager.createNamedQuery("Venda.buscaPorCliente");
		q.setParameter("idCliente", idCliente);
		return q.getResultList();
	}
}
