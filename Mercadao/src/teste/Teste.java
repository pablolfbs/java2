package teste;

import java.util.List;

import model.Cliente;
import model.Produto;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;

public class Teste {
	
	public static void main(String[] args) {
		
//		ProdutoDao pDao = new ProdutoDao();
//		
//		List<Produto> p = pDao.listar();
//		
//		for (Produto produto : p) {
//			System.out.println("Código: " + produto.getCodigo());
//			System.out.println("Nome: " + produto.getNome());
//			System.out.println("Preço: " + produto.getPreco() + "\n");
//		}
		
		ClienteDao cDao = new ClienteDao();
		
		Cliente c = new Cliente();
		
		c.setId(1);
		
		Cliente c1 = cDao.buscarPorCodigo(c);
		System.out.println(c1.getNome());
	}

}
