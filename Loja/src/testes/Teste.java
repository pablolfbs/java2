package testes;

import java.util.List;

import entidade.Cliente;
import repositorio.RepositorioCliente;

public class Teste {
	
	public static void main(String[] args) {
		
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		
		List<Cliente> clientes = repositorioCliente.listarTodos();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getIdade() + "\n");
		}
		
//		Cliente c = repositorioCliente.obterPorId(2);
		
//		Cliente c = new Cliente();
//		c.setNome("Ingrid");
//		c.setIdade(29);
		
//		repositorioCliente.salvar(c);
		
//		c.setNome("Ingrid");
//		c.setIdade(29);
//		
//		repositorioCliente.salvar(c);
		
	}

}
