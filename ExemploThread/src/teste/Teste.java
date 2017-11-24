package teste;

import model.Exemplo1;
import threads.Contador;
import threads.VerificadorEmail;

public class Teste {

	public static void main(String[] args) {

		Exemplo1 ex1 = new Exemplo1();
		Exemplo2 ex2 = new Exemplo2();

//		ex1.imprime();
//		ex1.imprime();

		Contador contador1 = new Contador("Thread1");
		Contador contador2 = new Contador("                              Thread2");

		contador1.start();
		contador2.start();
		
		VerificadorEmail verifica = new VerificadorEmail();
		verifica.start();
		

	}

}
