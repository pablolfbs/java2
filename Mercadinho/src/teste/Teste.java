package teste;

import java.util.List;

import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.dao.ClienteDao;
import model.dao.FuncionarioDao;
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
		
		ClienteDao cDao = new ClienteDao();
		
		Cliente c = new Cliente();

		c.setId(1);

		cDao.buscarPorCodigo(c);

		System.out.println("Nome: " + c.getNome());
		System.out.println("CPF: " + c.getCpf());
		System.out.println("Endereço: " + c.getEndereco());
		
		
		
		FuncionarioDao fDao = new FuncionarioDao();
		
		Funcionario f = new Funcionario();
		f.setId(1);
		
		fDao.buscarPorId(f);
		
		System.out.println("ID: " + f.getId());
		System.out.println("Nome: " + f.getNome());
		System.out.println("CPF: " + f.getCpf());
		System.out.println("Endereço: " + f.getEndereco() + "\n");
		
		List<Funcionario> funcionarios = fDao.listar();
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("ID: " + funcionario.getId());
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("CPF: " + funcionario.getCpf());
			System.out.println("Endereço: " + funcionario.getEndereco() + "\n");
		}
		
		
		
		ClienteDao cDao = new ClienteDao();
		
		Cliente c = new Cliente();
		
		c.setId(2);
		
		cDao.buscarPorCodigo(c);
		
		System.out.println(c.getNome());
		System.out.println(c.getCpf());

		 */
		
		ProdutoDao pDao = new ProdutoDao();
		
		Produto p = new Produto();
		
		p.setCodigo(1);
		
		pDao.buscarPorCodigo(p);
		
		System.out.println(p.getNome());
				
	}

}
