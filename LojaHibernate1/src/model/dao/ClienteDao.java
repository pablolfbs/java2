package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Cliente;

public class ClienteDao {
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public ClienteDao() {
		factory = Persistence.createEntityManagerFactory("vendas");
		em = factory.createEntityManager();
	}
	
	public void salvar(Cliente c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		factory.close();
	}
	
	public void remover(Cliente c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		factory.close();
	}
	
	public Cliente buscarPorId(int id) {
		em.getTransaction().begin();
		Cliente c = em.find(Cliente.class, id);
		
		em.getTransaction().commit();
		factory.close();
		
		return c;
	}
	
	public List<Cliente> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("SELECT cliente FROM Cliente cliente");
				
		List<Cliente> clientes = consulta.getResultList();
		
		em.getTransaction().commit();
		factory.close();
		
		return clientes;
	}
	

}
