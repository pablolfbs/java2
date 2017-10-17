package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tbl {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String cliente;
	
	@Column
	private int qtdHospedes;
	
	@Column
	private String checkin;
	
	@Column
	private String checkout;
	
	@Column
	private int noites;
	
	@Column
	private String tipo_uh;
	
	@Column
	private String vl_diaria;
	
	@Column
	private String rs_uh;
	
	@Column
	private String gastos_extras;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getQtdHospedes() {
		return qtdHospedes;
	}

	public void setQtdHospedes(int qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getNoites() {
		return noites;
	}

	public void setNoites(int noites) {
		this.noites = noites;
	}

	public String getTipo_uh() {
		return tipo_uh;
	}

	public void setTipo_uh(String tipo_uh) {
		this.tipo_uh = tipo_uh;
	}

	public String getVl_diaria() {
		return vl_diaria;
	}

	public void setVl_diaria(String vl_diaria) {
		this.vl_diaria = vl_diaria;
	}

	public String getRs_uh() {
		return rs_uh;
	}

	public void setRs_uh(String rs_uh) {
		this.rs_uh = rs_uh;
	}

	public String getGastos_extras() {
		return gastos_extras;
	}

	public void setGastos_extras(String gastos_extras) {
		this.gastos_extras = gastos_extras;
	}

}
