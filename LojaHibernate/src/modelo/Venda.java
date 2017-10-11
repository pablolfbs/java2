package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "vendas")
public class Venda {
	
	@Id
	@GeneratedValue
	@Column(name = "id_venda")
	private int id;
	
	/**
	 * Muitas vendas podem estar relacionadas a um único
	 * cliente (relacionamento muitos-para-um). A anotação
	 * JoinColumn informa o nome da coluna que referenciará
	 * o cliente envolvido.
	 */
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	/**
	 * O outro lado da relação. Aqui descrevemos qual será o
	 * nome da tabela que concretizará o relacionamento entre
	 * a venda e os produtos e quais colunas formarão a tabela:
	 * joinColumn informando a PK desta entidade e 
	 * inverseJoinColumn informando a PK da outra entidade. 
	 */
	@ManyToMany
	@JoinTable(name = "vendas_produtos",
			joinColumns = @JoinColumn(name = "id_venda"),
			inverseJoinColumns = @JoinColumn(name = "cod_produto"))
	private List<Produto> produtos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> listaProdutos) {
		this.produtos = listaProdutos;
	}

}
