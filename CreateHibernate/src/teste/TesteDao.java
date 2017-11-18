package teste;

import java.util.List;

import modelo.Cliente;
import modelo.Venda;
import modelo.dao.ClienteDao;
import modelo.dao.VendaDao;

public class TesteDao {
	
	public static void main(String[] args) {
		
		ClienteDao dao = ClienteDao.getInstancia();
		
//		VendaDao vDao = VendaDao.getInstancia();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria Santos");
		cliente.setEndereco("Rua das Flores, 10");
		cliente.setTelefone("21 2222-8899");
		
		dao.persistir(cliente);
//		dao.remove(cliente);
		
//		Cliente jose = dao.buscaPorId(1);
//		System.out.println(jose.getNome() + "\n" + jose.getTelefone());
//		jose.setNome("José da Silva Pacheco");
//		
//		dao.atualiza(jose);
		
//		Cliente c = dao.buscaPorId(3);
//		System.out.println(c.getNome() + "\n" + c.getTelefone());
//		c.setTelefone("21 2222-8899");
		
//		dao.atualiza(c);
		
//		dao.remove(2);
		
//		ClienteDao cDao = ClienteDao.getInstancia();
//		VendaDao vDao = VendaDao.getInstancia();
		
//		Cliente c = cDao.buscaPorId(Cliente.class, 2);
		
//		Venda v = new Venda();
//		v.setCliente(c);
//		v.setValor(500);
//		
//		vDao.persistir(v);
		
//		List<Venda> resultado = vDao.buscaPorCliente(2);
//		
//		for (Venda venda : resultado) {
//			System.out.println(venda.getCliente().getNome() + " | " +
//		venda.getCliente().getEndereco() + " | " + venda.getValor());
//		}
		
	}
	
}
