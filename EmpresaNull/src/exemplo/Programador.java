package exemplo;

public class Programador extends Funcionario {
	
	public Programador(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean eNulo() {
		
		return false;
	}

	@Override
	public String getNome() {
		
		return this.nome;
	}
	
}
