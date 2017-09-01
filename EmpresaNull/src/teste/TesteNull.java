package teste;

import exemplo.FabricaFuncionario;
import exemplo.Funcionario;

public class TesteNull {
	
	public static void main(String[] args) {
		
		Funcionario func1 = FabricaFuncionario.getFuncionario("Ivan");
		System.out.println(func1.getNome());
		
		Funcionario func2 = FabricaFuncionario.getFuncionario("Camila");
		System.out.println(func2.getNome());
	}
	
}
