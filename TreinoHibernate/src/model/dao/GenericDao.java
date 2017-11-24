package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDao<T> {
	
	EntityManager entityManager;
	
	public GenericDao() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("treino");
		if(entityManager == null){
			entityManager = factory.createEntityManager();
		}
		
		return entityManager;
	}
	
	public T getById(Class<T> clazz, int id) {
		
		return (T) entityManager.find(clazz, id);
		
	}
	
	public void persist(T t) {
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void merge(T t) {
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void excluir(Class<T> clazz, int id) {
		entityManager.getTransaction().begin();
		T t = entityManager.find(clazz, id);
		entityManager.remove(t);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
