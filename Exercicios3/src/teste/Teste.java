package teste;

import model.Agenda;
import model.Contato;
import model.Exercicios;

public class Teste {
	
	public static void main(String[] args) {
		
//		Exercicios.maiorNumero(5, 8);
//		Exercicios.numeroDecrescente(10);
//		Exercicios.operacoes();
//		Exercicios.trocaNumero(2, 100);
//		Exercicios.comparaNumero(1, 1);
//		Exercicios.mediaAluno();
//		Exercicios.calcular(4, 8);
//		Exercicios.aprovacao("Pablo", 10, 4, 9);
//		Exercicios.calculoIdade(15, 13, 20, 18);
//		System.out.println(Exercicios.salario(1000, 2, 10000));
//		System.out.println(Exercicios.descontoPrev(3000));
//		Exercicios.contaCliente("Pablo", 10);
//		Exercicios.tabuada(3);
//		Exercicios.comparar(2, 2);
//		Exercicios.sort();
//		Exercicios.jogo();
//		Exercicios.adicao(15);
		
		float[] nota = new float[3];
		nota[0] = 10;
		nota[1] = 4;
		nota[2] = 4;
		Exercicios.calculaMedia("Pablo", nota);
		
		
//		int[] array = new int[3];
//		array[0] = 8;
//		array[1] = 5;
//		array[2] = 15;
//		Exercicios.vetor(array);
		
//		Contato[] contatos = new Contato[3];
//				
//		Contato contato = new Contato();
//		contato.setNome("Pablo");
//		contato.setEmail("pablo@pablo.com");
//		
//		contatos[0] = contato;
//		
//		contato.setNome("Ingrid");
//		contato.setEmail("ingrid@ingrid.com");
//		
//		contatos[1] = contato;
//		
//		contato.setNome("Nadja");
//		contato.setEmail("nadja@nadja.com");
//		
//		contatos[2] = contato;
//		
//		for (int i = 0; i < contatos.length; i++) {
//			System.out.println(contatos[i].getNome());
//		}
		
//		for (Contato c : contatos) {
//			if (c != null) {
//				System.out.println(c.getNome() + "\n" + c.getEmail());
//			}
//		}
		
		
		Agenda a = new Agenda();
//		System.out.println(a.adiciona(contato));
//		
//		System.out.println(a.getContatos());
		
//		if (a != null) {
//			System.out.println(a.obterInfo());
//		}
		
	}

}
