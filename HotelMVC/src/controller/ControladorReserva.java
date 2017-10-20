package controller;

import modelo.Hospede;
import modelo.Quarto;
import modelo.Reserva;
import modelo.dao.ReservaDao;

public class ControladorReserva {
	
	public boolean realizarCadastro(String nome, String email) {
		ReservaDao dao = new ReservaDao();
		
		Hospede h = new Hospede();
		Quarto q = new Quarto();
		Reserva r = new Reserva();
		
		h.setNome(nome);
		h.setEmail(email);
		h.setTelefone("");
		
		q.setNumero(5);
		q.setPrecoDiaria(250);
		
		r.setHospede(h);
		r.setQuarto(q);
		r.setDataEntrada("12/12/2016");
		r.setDataSaida("15/01/2017");
		
		return dao.cadastrarReserva(r);
		
	}

}
