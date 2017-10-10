package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	@Column(name="cod_produto")
	private int cod;
	
	@Column
	private String nome;
	
	@Column
	private float preco;
	
	@ManyToMany(mappedBy="produtos")
	private List<Venda> vendas;

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
