package repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidade.Cliente;

public class RepositorioCliente {

	EntityManagerFactory emf;
	EntityManager em;

	public RepositorioCliente() {
		emf = Persistence.createEntityManagerFactory("loja");
		em = emf.createEntityManager();
	}

	public Cliente obterPorId(int id) {
		em.getTransaction().begin();
		Cliente c = em.find(Cliente.class, id);
		em.getTransaction().commit();
		emf.close();
		return c;
	}

	public void salvar(Cliente c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		emf.close();
	}

	public void remover(Cliente c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		emf.close();
	}

	public List<Cliente> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("SELECT cliente FROM Cliente cliente");

		List<Cliente> clientes = consulta.getResultList();

		em.getTransaction().commit();
		emf.close();

		return clientes;
	}

}
