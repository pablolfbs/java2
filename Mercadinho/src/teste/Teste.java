package teste;

import java.util.List;

import model.Cliente;
import model.Produto;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;

public class Teste {

	public static void main(String[] args) {
		
		/*
		ProdutoDao pDao = new ProdutoDao();

		List<Produto> p = pDao.listar();

		for (Produto produto : p) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco() + "\n");
		}


		List<Cliente> clientes = cDao.listar();

		for (Cliente cliente : clientes) {
			System.out.println("Classe: " + cliente.getClass());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Endereço: " + cliente.getEndereco() + "\n");
		}
		*/
		
		ClienteDao cDao = new ClienteDao();
		
		Cliente c = new Cliente();

		c.setId(1);

		cDao.buscarPorCodigo(c);

		System.out.println("Nome: " + c.getNome());
		System.out.println("CPF: " + c.getCpf());
		System.out.println("Endereço: " + c.getEndereco());

	}

}
