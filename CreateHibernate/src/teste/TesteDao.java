package teste;

import modelo.Cliente;
import modelo.dao.ClienteDao;

public class TesteDao {
	
	public static void main(String[] args) {
		
		ClienteDao dao = ClienteDao.getInstancia();
		
		Cliente c = dao.buscaPorId(2);
		
		System.out.println(c.getNome() + "\n" + c.getTelefone() + "\n" + c.getEndereco());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria Santos");
		cliente.setEndereco("Rua das Flores, 10");
		cliente.setTelefone("21 2222-8899");
		
		dao.persistir(cliente);
		dao.remove(cliente);
		
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
		
		
		
	}
}
