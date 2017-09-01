package exemplo;

public class FuncionarioNulo extends Funcionario {

	@Override
	public boolean eNulo() {
		
		return true;
	}

	@Override
	public String getNome() {
		
		return "Funcionário não existente.";
	}
	
	
	
}
