package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue
	@Column(name = "id_produto")
	private int id;
	
	@Column(name = "nome_produto")
	private String nome;
	
	@Column(name = "preco_produto")
	private double preco;
	
	/**
	 * Um certo tipo de produto pode pertencer a diversas vendas
	 * e uma venda possui diversos produtos. Neste caso temos um
	 * relacionamento muitos-para-muitos. 
	 * 
	 * Quando o relacionamento é bidirecional usamos a propriedade
	 * mappedBy para informar o atributo da outra classe que se
	 * relaciona com este. Esta propriedade é comumente usada na
	 * entidade dominante.
	 */
	@ManyToMany(mappedBy = "produtos")
	private List<Venda> vendas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
