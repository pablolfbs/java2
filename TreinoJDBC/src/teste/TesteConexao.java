package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dao.ClienteDao;
import dao.ConnectionFactory;
import dao.ContatoDao;
import dao.ProdutoDao;
import model.Cliente;
import model.Contato;
import model.Produto;

public class TesteConexao {
	
	public static void main(String[] args) {
		
//		Connection connection = new ConnectionFactory().getConnection();
//		System.out.println("Conexão Aberta");
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		ContatoDao cDao = new ContatoDao();
//		
//		Contato c = new Contato();
//		c.setNome("Ingrid");
//		c.setEndereco("Rua B");
//		c.setEmail("ingrid@ingrid.com.br");
//		c.setDataNascimento(Calendar.getInstance());
		
//		cDao.cadastrar(c);
		
//		ProdutoDao pDao = new ProdutoDao();
//		
//		Produto p = new Produto();
//		p.setNome("Uva");
//		p.setValor(15.50);
//		
//		pDao.cadastrar(p);
		
//		ContatoDao cDao = new ContatoDao();
		
//		Contato c = new Contato();
		
//		c.setNome("Pablito");
//		c.setEmail("pablo@pablo.com");
//		c.setEndereco("Rua A");
//		c.setDataNascimento(Calendar.getInstance());
		
//		c.setId(1l);
		
//		cDao.deletar(c);
		
//		List<Contato> contatos = cDao.listar();
//		
//		for (Contato contato : contatos) {
//			System.out.println("Id: " + contato.getId());
//			System.out.println("Nome: " + contato.getNome());
//			System.out.println("E-mail: " + contato.getEmail());
//			System.out.println("Endereço: " + contato.getEndereco());
//			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
	
//	ProdutoDao pDao = new ProdutoDao();
	
//	Produto p = new Produto();
	
//	p.setNome("Coke");
//	p.setValor(6.99);
//	p.setId(3);
	
//	List<Produto> produtos = pDao.listar();
//	
//	for (Produto produto : produtos) {
//		System.out.println("Id: " + produto.getId());
//		System.out.println("Nome: " + produto.getNome());
//		System.out.println("Valor: " + produto.getValor());
//	}
	
//	pDao.excluir(p);
	
//	pDao.atualizar(p);	
	
//	pDao.cadastrar(p);
		
		ClienteDao cDao = new ClienteDao();
		
		List<Cliente> clientes = cDao.listar();
		
		for (Cliente cliente : clientes) {
			System.out.println("Id: " + cliente.getId());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Endereço: " + cliente.getEndereco());
			System.out.println("Telefone: " + cliente.getTelefone());
		}
	
		Cliente c = new Cliente();
		
//		c.setNome("Ingrid");
//		c.setCpf("13120910708");
//		c.setEndereco("Rua Andiara 42 ap202 fds - Higienópolis");
//		c.setTelefone("(21) 99826-1988");
//		cDao.cadastrar(c);
		
//		c.setId(3);
//		cDao.excluir(c);
		
//		c.setNome("Nadja");
//		c.setCpf("12345678910");
//		c.setEndereco("Rua Ubiraci - Higienópolis");
//		c.setTelefone("(21) 96561-8083");
//		c.setId(2);
//		cDao.atualizar(c);
		
	}
	
}
