package teste;

import dao.ClienteDAO;
import dao.GenericDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import model.Cliente;

public class Teste {
	
	public static void main(String[] args) {
		
		ClienteDAO cDAO = ClienteDAO.getInstancia();
//		ProdutoDAO pDAO = ProdutoDAO.getInstancia();
//		VendaDAO vDAO = VendaDAO.getInstancia();
		
		
		Cliente c = new Cliente();
//		c.setNome("Pablo");
//		c.setCpf("07637049701");
//		c.setTelefone("998761112");
		cDAO.remove(Cliente.class, 2);
		
		
	}

}
