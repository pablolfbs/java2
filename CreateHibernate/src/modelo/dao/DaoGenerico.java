package modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DaoGenerico<T> {

	protected EntityManager entityManager;

	protected DaoGenerico() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastrodb");

		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public T buscaPorId(Class<T> clazz, int id) {
		// T t = null;
		return (T) entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> buscarTodos(Class<T> clazz) {
		// T t = null;
		return entityManager.createQuery("FROM " + clazz.getName()).getResultList();
	}

	public void persistir(T t) {
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
	}

	public void atualiza(T t) {
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
	}

	public void remove(T t) {
		entityManager.getTransaction().begin();
		entityManager.remove(t);
		entityManager.getTransaction().commit();
	}

	public void remove(Class<T> clazz, int id) {
		T t = buscaPorId(clazz, id);
		remove(t);
	}
}
