package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDao<T> {

	protected EntityManager entityManager;
	protected EntityManagerFactory factory;

	protected GenericDao() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("csv_db");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	public T buscaPorId(Class<T> clazz, int id) {
		return (T) entityManager.find(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	List<T> buscarTodos(Class<T> clazz) {
		return entityManager.createQuery("FROM" + clazz.getName()).getResultList();
	}
	
	public void persistir(T t) {
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
		factory.close();
	}
	
	public void atualiza(T t) {
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
		factory.close();
	}
	
	public void remove(T t) {
		entityManager.getTransaction().begin();
		entityManager.remove(t);
		entityManager.getTransaction().commit();
		factory.close();
	}
	
	public void remove(Class<T> clazz, int id) {
		T t = buscaPorId(clazz, id);
		remove(t);
		factory.close();
	}

}
