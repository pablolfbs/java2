package modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DaoGenerico<T> {

	protected EntityManager entityManager;
	
	protected DaoGenerico(){
		entityManager = getEntityManager();
	}
	
	public void closeManager(){
		entityManager.close();
	}
	
	private EntityManager getEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vendaDB");
		if(entityManager == null){
			entityManager = factory.createEntityManager();
		}
		
		return entityManager;
	}
	
	public T getById(Class<T> clazz, int id){
		
		T t = null;
		t = entityManager.find(clazz, id);
		
		return t;
		
	}
	
	public void persist(T t){
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
	}
	
	public void merge(T t){
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
	}
	
	public void remove(Class<T> clazz, int id){
		entityManager.getTransaction().begin();
		T t = null;
		t = entityManager.find(clazz, id);
		entityManager.remove(t);
		entityManager.getTransaction().commit();
	}
	
}
