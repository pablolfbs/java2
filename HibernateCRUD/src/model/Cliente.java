package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name="cod_cliente")
	private int cod;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String telefone;
	
	@OneToMany(mappedBy="cliente")
	private List<Venda> compras;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	

}
