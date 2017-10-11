package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Persistence;

import dao.ClienteDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import model.Cliente;
import model.Produto;
import model.Venda;

public class Console {

	Scanner s = new Scanner(System.in);

	int s1, s2;

	ClienteDAO cDAO = ClienteDAO.getInstancia();
	ProdutoDAO pDAO = ProdutoDAO.getInstancia();
	VendaDAO vDAO = VendaDAO.getInstancia();

	public Console() {
		menu();
	}

	private void menu() {

		System.out.println("-----------------------");
		System.out.println("|  ESCOLHA UMA OPÇÃO  |");
		System.out.println("|1 - Gerenciar Cliente|");
		System.out.println("|2 - Gerenciar Produto|");
		System.out.println("|3 - Gerenciar Venda  |");
		System.out.println("|---------------------|");

		s1 = s.nextInt();

		System.out.println("------------------------");
		System.out.println("|  ESCOLHA UMA OPÇÃO  |");
		System.out.println("|1 - Inserir          |");
		System.out.println("|2 - Atualizar        |");
		System.out.println("|3 - Remover          |");
		System.out.println("|---------------------|");

		s2 = s.nextInt();

		escolha();
	}

	private void escolha() {

		switch (s1) {
		case 1:
			gerenciaCliente();
			break;
		case 2:
			gerenciaProduto();
			break;
		case 3:
			gerenciaVenda();
			break;
		default:
			System.out.println("Valor inválido! Tente novamente!");
			break;
		}

	}

	private void gerenciaCliente() {
		switch (s2) {
		case 1:
			insereCliente();
			break;
		case 2:
			atualizaCliente();
			break;
		case 3:
			removeCliente();
			break;

		default:
			break;
		}
	}

	private void gerenciaProduto() {
		switch (s2) {
		case 1:
			insereProduto();
			break;
		case 2:
			atualizaProduto();
			break;
		case 3:
			removeProduto();
			break;

		default:
			break;
		}
	}

	private void gerenciaVenda() {
		switch (s2) {
		case 1:
			insereVenda();
			break;
		case 2:
			atualizaVenda();
			break;
		case 3:
			removeVenda();
			break;

		default:
			break;
		}
	}

	private void insereCliente() {
		Cliente c = new Cliente();
		System.out.println("Insira o nome:");
		c.setNome(s.next());
		System.out.println();
		System.out.println("Insira o cpf:");
		c.setCpf(s.next());
		System.out.println();
		System.out.println("Insira o telefone:");
		c.setTelefone(s.next());
		cDAO.persist(c);
	}

	private void atualizaCliente() {
		Cliente c = new Cliente();
		System.out.println("Insira o código do cliente:");
		c.setCod(s.nextInt());
		System.out.println("Insira o nome:");
		c.setNome(s.next());
		System.out.println();
		System.out.println("Insira o cpf:");
		c.setCpf(s.next());
		System.out.println();
		System.out.println("Insira o telefone:");
		c.setTelefone(s.next());
		cDAO.merge(c);
	}

	private void removeCliente() {
		Cliente c = new Cliente();
		System.out.println("Qual cliente deseja remover?");
		c.setCod(s.nextInt());
		cDAO.remove(Cliente.class, c.getCod());

	}

	private void insereProduto() {
		Produto p = new Produto();
		System.out.println("Insira o nome:");
		p.setNome(s.next());
		System.out.println();
		System.out.println("Insira o preço:");
		p.setPreco(s.nextFloat());

		pDAO.persist(p);
	}

	private void atualizaProduto() {
		Produto p = new Produto();
		System.out.println("Insira o código do produto:");
		p.setCod(s.nextInt());
		System.out.println();
		System.out.println("Insira o nome:");
		p.setNome(s.next());
		System.out.println();
		System.out.println("Insira o preço do produto:");
		p.setPreco(s.nextFloat());
		pDAO.merge(p);
	}

	private void removeProduto() {
		Produto p = new Produto();
		System.out.println("Qual produto deseja remover?");
		p.setCod(s.nextInt());
		pDAO.remove(Produto.class, p.getCod());
	}

	private void insereVenda() {
		Cliente c = new Cliente();
		Venda v = new Venda();
		System.out.println("Insira o código do cliente:");
		c = cDAO.getById(Cliente.class, s.nextInt());
		v.setCliente(c);
		System.out.println();
		String resposta;
		do {
			List<Produto> produtos = new ArrayList<Produto>();
			System.out.println("Insira o código do produto:");
			Produto p = pDAO.getById(Produto.class, s.nextInt());
			produtos.add(p);
			System.out.println("Deseja inserir um novo produto? S / N ?");
			resposta = s.next();
		} while (resposta.toUpperCase().equals("S"));
		vDAO.persist(v);
	}

	private void atualizaVenda() {

	}

	private void removeVenda() {

	}

}
