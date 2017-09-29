package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Local;

public class LocalDAO {

	EntityManager manager;
	EntityManagerFactory factory;

//	public LocalDAO() {
//		manager = getEntityManager();
//	}

	public EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("eventopu");
		return factory.createEntityManager();
	}

	public Local buscarPorId(Long id) {
		manager = getEntityManager();
		Local local;
		try {
			manager.getTransaction().begin();
			local = manager.find(Local.class, id);
			manager.getTransaction().commit();
		} finally {
			factory.close();
		}
		return local;
	}

	public Local salvar(Local local) {
		manager = getEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(local);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			factory.close();
		}
		return local;
	}

	public Local atualizar(Local local) {
		manager = getEntityManager();
		try {
			manager.getTransaction().begin();
			manager.merge(local);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			factory.close();
		}
		return local;
	}

	public Local remover(Long id) {
		manager = getEntityManager();
		Local local = manager.find(Local.class, id);
		try {
			manager.getTransaction().begin();
			manager.remove(local);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			factory.close();
		}
		return local;
	}

	@SuppressWarnings("unchecked")
	public List<Local> listarTodos() {
		manager = getEntityManager();
		manager.getTransaction().begin();
		Query consulta = manager.createQuery("select local from Local local");
		List<Local> locais = consulta.getResultList();
		manager.getTransaction().commit();
		factory.close();
		return locais;
	}

}
