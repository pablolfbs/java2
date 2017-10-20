package modelo.dao;

import java.util.ArrayList;

import modelo.Reserva;

public class ReservaDao {
	
	ArrayList<Reserva> reservas;
	
	public ReservaDao() {
		reservas = new ArrayList<Reserva>();
	}
	
	public boolean cadastrarReserva(Reserva r) {
		return reservas.add(r);
		// return false;
	}

}
