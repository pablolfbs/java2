package view;

import java.util.Scanner;

import model.Paciente;

public class Console {

	private Scanner in = new Scanner(System.in);

	int cont = 0;

	public Console() {
		menu();
	}

	private void menu() {
		System.out.println("-----------------------------------------------");
		System.out.println("|        ESCOLHA UMA DAS OPÇÕES ABAIXO        |");
		System.out.println("| 1 -          CADASTRA PACIENTE              |");
		System.out.println("| 2 -       QUANTIDADE DE PACIENTES           |");
		System.out.println("| 3 -      MÉDIA DE IDADE DOS HOMENS          |");
		System.out.println("| 4 -   MULHERES 1.60m A 1.70m E + 70Kg       |");
		System.out.println("| 5 -      PESSOAS IDADE 18 A 25 ANOS         |");
		System.out.println("| 6 -     NOME DO PACIENTE MAIS VELHO         |");
		System.out.println("| 7 -      NOME DA MULHER MAIS BAIXA          |");
		System.out.println("|---------------------------------------------|");

		String s1 = in.nextLine();
		escolha(s1);
	}

	private void escolha(String s1) {
		switch (s1) {
		case "1":
			addPaciente();
			System.out.println();
			menu();
			break;
		case "2":
			countPacientes(cont);
			System.out.println();
			menu();
			break;
		case "3":
			System.out.println();
			menu();
			break;
		case "4":
			System.out.println();
			menu();
			break;
		case "5":
			System.out.println();
			menu();
			break;
		case "6":
			System.out.println();
			menu();
			break;
		case "7":
			System.out.println();
			menu();
			break;
		default:
			System.out.println();
			System.out.println("FIM!!");
			break;
		}
	}

	private void countPacientes(int cont) {
		System.out.println(cont);
	}

	private Paciente addPaciente() {

		System.out.println("INFORME O NOME: ");
		String nome = in.nextLine();
		System.out.println("INFORME O SEXO: ");
		String sexo = in.nextLine();
		System.out.println("INFORME O PESO: ");
		float peso = in.nextFloat();
		System.out.println("INFORME A IDADE: ");
		int idade = in.nextInt();
		System.out.println("INFORME A ALTURA: ");
		float altura = in.nextFloat();

		cont++;
		return new Paciente(nome, sexo, peso, idade, altura);
	}

}
