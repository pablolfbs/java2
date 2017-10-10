package view;

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

	public Console() {
		menu();
	}

	private void menu() {

		System.out.println("1 - Gerenciar Cliente");
		System.out.println("2 - Gerenciar Produto");
		System.out.println("3 - Gerenciar Venda");

		int esc1 = s.nextInt();
		
		System.out.println("1 - Inserir");
		System.out.println("2 - Atualizar");
		System.out.println("3 - Remover");
		int esc2 = s.nextInt();
		
		escolha(esc1);
}

	private void escolha(int esc1) {

		switch (esc1) {
		case 1:
			gerenciaCliente(esc1);
			break;
		case 2:
			gerenciaProduto(esc1);
			break;
		case 3:
			gerenciaVenda(esc1);
			break;
		default:
			System.out.println("Valor inválido! Tente novamente!");
			break;
		}

	}

	private void gerenciaCliente(int esc2) {
		switch (esc2) {
		case 1:
			insereCliente();
			break;
		case 2:
			insereProduto();
			break;
		case 3:
			insereVenda();
			break;

		default:
			break;
		}
	}

	private void insereVenda() {
		/*
		Venda v = new Venda();
		System.out.println("Insira o nome:");
		v.setCliente(s.next());			
		System.out.println();
		System.out.println("Insira o cpf:");
		v.set(s.next());
		VendaDAO vDAO = VendaDAO.getInstancia();
		vDAO.persist(v);
		*/
	}

	private void insereProduto() {
		Produto p = new Produto();
		System.out.println("Insira o nome:");
		p.setNome(s.next());			
		System.out.println();
		System.out.println("Insira o preço:");
		p.setPreco(s.nextFloat());
		ProdutoDAO pDAO = ProdutoDAO.getInstancia();
		pDAO.persist(p);
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
		ClienteDAO cDAO = ClienteDAO.getInstancia();
		cDAO.persist(c);
	}

	private void gerenciaProduto(int esc2) {

	}

	private void gerenciaVenda(int esc2) {

	}

}
