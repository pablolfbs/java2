package teste;

import dao.LocalDAO;
import modelo.Local;

public class TesteLocal {
	
	public static void main(String[] args) {
		
		LocalDAO dao = new LocalDAO();
		
//		Local l = new Local();
//		l.setPredio("Alfa");
//		l.setSala("L110");
//		l.setCapacidade(20);
		
//		dao.atualizar(l);
		
		Local l = dao.buscarPorId(23L);
		System.out.println(l.getPredio());
		
		// System.out.println("Local salvo " + l.getId() + " " + l.getPredio() + " " + l.getSala() + " " + l.getCapacidade());
		
	}

}
