package modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Cliente;

public class ClienteDao {

	private static ClienteDao instancia;
	private EntityManager entityManager;

	private ClienteDao() {
		entityManager = getEntityManager();
	}

	public static ClienteDao getInstancia() {
		if (instancia == null) {
			instancia = new ClienteDao();
			return instancia;
		} else {
			return instancia;
		}
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastrodb");

		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Cliente buscaPorId(int id) {
		return entityManager.find(Cliente.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> buscarTodos() {
		return entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
	}
	
	public void persistir(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.persist(c);
		entityManager.getTransaction().commit();
	}
	
	public void atualiza(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.merge(c);
		entityManager.getTransaction().commit();
	}
	
	public void remove(Cliente c) {
		entityManager.getTransaction().begin();
		c = entityManager.find(Cliente.class, c.getId());
		entityManager.remove(c);
		entityManager.getTransaction().commit();
	}
	
	public void remove(int id) {
		Cliente c = buscaPorId(id);
		remove(c);
	}
}
