package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name = "id_cliente")
	private int id;
	
	@Column(name = "nome_cliente")
	private String nome;
	
	@Column(name = "email_cliente")
	private String email;
	
	/**
	 * Relacionamento bidirecional do tipo um-para-muitos.
	 * Um cliente pode estar relacionado a várias vendas. O
	 * mappedBy aparece aqui por ser a entidade dominante. 
	 */
	@OneToMany(mappedBy = "cliente")
	private List<Venda> compras;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
