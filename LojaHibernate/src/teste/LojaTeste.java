package teste;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Produto;
import modelo.Venda;
import modelo.dao.ClienteDao;
import modelo.dao.ProdutoDao;
import modelo.dao.VendaDao;

public class LojaTeste {

	public static void main(String[] args) {
		
		ClienteDao cDao = ClienteDao.getInstancia();
		ProdutoDao pDao = ProdutoDao.getInstancia();
		VendaDao vDao = VendaDao.getInstancia();
//		
//		Produto p1 = new Produto();
//		p1.setNome("Caderno Caligrafia");
//		p1.setPreco(5.6);
//		
//		Produto p2 = new Produto();
//		p2.setNome("Caneta Tinteiro");
//		p2.setPreco(67.9);
//		
//		Cliente c = new Cliente();
//		c.setNome("Jorge Vasconcelos");
//		c.setEmail("jorge.v@dominio.com");
//		
//		cDao.persist(c);
//		pDao.persist(p1);
//		pDao.persist(p2);
		
		
		Cliente c = cDao.getById(Cliente.class, 2);

		List<Produto> produtos = new ArrayList<Produto>();
		Produto p = pDao.getById(Produto.class, 1);
		produtos.add(p);
		p = pDao.getById(Produto.class, 3);
		produtos.add(p);
		
		Venda v = new Venda();
		
		v.setCliente(c);
		v.setProdutos(produtos);
		
		vDao.persist(v);
		
		/*
		 */
	
	}

}
