package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Tbl {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private int qtdHospedes;
	
	@Column
	private String checkin;
	
	@Column
	private String checkout;
	
	@Column
	private String noites;
	
	@Column
	private String quarto;
	
	@Column
	private float valorDiaria;
	
	@Column
	private float valorPeriodo;
	
	@Column
	private float gastosExtras;

}
