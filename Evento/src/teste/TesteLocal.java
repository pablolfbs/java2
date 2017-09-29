package teste;

import java.util.List;

import dao.LocalDAO;
import modelo.Local;

public class TesteLocal {
	
	public static void main(String[] args) {
		
		LocalDAO dao = new LocalDAO();
		
//		Local l = new Local();
//		l.setPredio("Delta");
//		l.setSala("D110");
//		l.setCapacidade(70);
		
//		dao.salvar(l);
		
//		dao.atualizar(l);
		
		Local l = dao.buscarPorId(25L);
		System.out.println(l.getId() + " " + l.getPredio() + " " + l.getSala());
		
//		l.setPredio("Gama");
//		dao.atualizar(l);
//		System.out.println(l.getPredio());
		
//		Local l = dao.buscarPorId(24L);
//		dao.remover(l.getId());
		
//		List<Local> locais = dao.listarTodos();
		
//		for (Local local : locais) {
//			System.out.println(local.getId() + " " + local.getPredio() + " " + local.getSala() + " " + local.getCapacidade()); 
//			
//		}
		
		// System.out.println("Local salvo " + l.getId() + " " + l.getPredio() + " " + l.getSala() + " " + l.getCapacidade());
		
	}

}
