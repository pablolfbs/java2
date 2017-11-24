package controller;

import java.util.List;

import javax.swing.JOptionPane;

import model.Cliente;
import model.dao.ClienteDao;

public class Teste {
	
	public static void main(String[] args) {
		
		ClienteDao cDao = new ClienteDao();
		
//		Cliente c = new Cliente();
//		
//		c.setNome("Pablo");
//		c.setId(39);
//		
//		c.setNome("Ingrid");
//		c.setId(29);
//		cDao.salvar(c);
		
//		List<Cliente> clientes = cDao.listarTodos();
//		for (Cliente cliente : clientes) {
//			System.out.println(cliente.getNome());
//		}
		
		Cliente c = cDao.buscarPorId(4);
		JOptionPane.showMessageDialog(null, c.getNome());
		
	}

}
