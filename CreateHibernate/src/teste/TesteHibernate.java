package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Cliente;

public class TesteHibernate {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastrodb");
		
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("José da Silva");
		cliente.setTelefone("(21) 2222-3322");
		cliente.setEndereco("Rua Santa Luzia, 735");
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		manager.close();
		
	}

}
