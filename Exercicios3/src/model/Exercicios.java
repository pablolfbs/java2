package model;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

	public static void maiorNumero(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("Os números são iguais");
		}
	}

	public static void numeroDecrescente(int i) {
		for (i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void operacoes() {
		int b = 0;
		for (int a = 0; a <= 30; a++) {
			if (a % 2 == 1) {
				System.out.println("A soma é: " + b + " + " + a + " = " + (a + b));
				b = b + a;
			}
		}
		System.out.println();
		int c = 0;
		for (int a = 0; a <= 30; a++) {
			if (a % 2 == 0) {
				System.out.println("A soma é: " + c + " * " + a + " = " + (a * c));
				c = c * a;
			}
		}
	}

	public static void trocaNumero(int a, int b) {
		System.out.println(b + "\n" + a);
	}

	public static void comparaNumero(int a, int b) {
		if (a > b) {
			System.out.println("Números diferentes");
			System.out.println(a + "  " + b);

		} else if (b > a) {
			System.out.println("Números diferentes");
			System.out.println(b + "  " + a);
		} else {
			System.out.println("Os números são iguais");
		}
	}

	public static void mediaAluno() {
		int[] notas = new int[4];

		for (int i = 0; i < notas.length; i++) {
			adiciona(notas);
		}
	}

	private static int[] adiciona(int notas[]) {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 0 && notas[i] <= 100) {
			}
		}
		return notas;
	}

	public static void calcular(int a, int b) {
		int c;
		if (a > b) {
			System.out.println(a + " é maior do que " + b);
		} else if (b > a) {
			System.out.println(b + " é maior do que " + a);
		} else {
			System.out.println("Os números são iguais!");
		}
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		c = a * b;
		System.out.println(a + " x " + b + " = " + c);
	}

	public static void aprovacao(String nome, float n1, float n2, float n3) {
		float media = (n1 + n2 + n3) / 3;
		System.out.println(nome + "\n" + media);
		if (media >= 6) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}

	public static void calculoIdade(int h1, int h2, int m1, int m2) {
		if (h1 != h2 && m1 != m2) {
			if (h1 > h2) {
				if (m1 < m2) {
					System.out.println(h1 + m1);
				} else if (m1 > m2) {
					System.out.println(h1 + m2);
				}
			} else if (h1 < h2) {
				if (m1 < m2) {
					System.out.println(h2 + m1);
				} else if (m2 > m1) {
					System.out.println(h2 + m2);
				}
			}
			if (h1 < h2) {
				if (m1 > m2) {
					System.out.println(h1 * m1);
				} else if (m1 < m2) {
					System.out.println(h1 * m2);
				}
			} else if (h1 > h2) {
				if (m1 > m2) {
					System.out.println(h2 * m1);
				} else if (m2 < m1) {
					System.out.println(h2 * m2);
				}
			}
		}
	}

	public static float salario(float salario, int carVendidos, float totalVendas) {
		salario = (salario * 2) + (50 * carVendidos) + (totalVendas * 5 / 100);
		return salario;
	}

	public static float descontoPrev(float salario) {
		float desconto = salario * 11 / 100;
		if (desconto > 318.2) {
			return 318.2f;
		}
		return desconto;
	}

	public static void contaCliente(String nome, int nDiarias) {
		float diaria = 120;
		float taxa;
		if (nDiarias > 15) {
			taxa = 9.5f;
		} else if (nDiarias < 15) {
			taxa = 17;
		} else {
			taxa = 13;
		}
		float total = (diaria * nDiarias) + (taxa * nDiarias);
		System.out.println("Cliente: " + nome + "\nTotal da Conta: " + total);
	}

	public static void tabuada(int num) {
		int res;
		for (int i = 0; i <= 10; i++) {
			res = num + i;
			System.out.println(num + " + " + i + " = " + res);
		}
		System.out.println();
		for (int i = 0; i <= 10; i++) {
			res = num - i;
			System.out.println(num + " - " + i + " = " + res);
		}
		System.out.println();
		for (int i = 0; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " x " + i + " = " + res);
		}
		System.out.println();
		for (int i = 0; i <= 10; i++) {
			if (i == 0) {
				System.out.println(num + " / " + i + " = Impossível dividir por zero");
			} else {
				res = num / i;
				System.out.println(num + " / " + i + " = " + res);
			}
		}
	}

	public static void vetor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void comparar(int a, int b) {
		if (a > b) {
			System.out.println(a + " é maior do que " + b);
		} else if (a < b) {
			System.out.println(b + " é maior do que " + a);
		} else {
			System.out.println("Os números são iguais.");
		}
	}

	public static void sort() {
		Random rand = new Random();

		for (int i = 0; i < 50; i++) {
			int x = rand.nextInt(100) + 1;
			System.out.println(x);
		}
	}

	public static void jogo() {
		Scanner in = new Scanner(System.in);

		Random rand = new Random();
		int a = rand.nextInt(100);
		int b;
		int count = 0;

		do {
			System.out.println("Digite um número: ");

			b = in.nextInt();

			if (a > b) {
				System.out.println("Número muito baixo\n");
			} else if (b > a) {
				System.out.println("Número muito alto\n");
			}
			count++;
		} while (a != b && count < 5);
		if (a == b) {
			System.out.println("Parabéns!! Você acertou em " + count + " tentativa(s) !");
		} else {
			System.out.println("GAME OVER!!!");
		}

		in.close();
	}

	public static void adicao(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				if (i < 10) {
					System.out.print("0" + i + " ");
				} else {
					System.out.print(i + " ");
				}
			}
			if (i > 0) {
				System.out.println();
			}
		}
	}

	public static void calculaMedia(String nome, float[] nota) {
		float soma = 0;
		for (int i = 0; i < nota.length; i++) {
			soma += nota[i];
		}
		float media = soma / 3;
		System.out.println(nome);
		System.out.println("Média: " + media);
		if (media >= 6) {
			System.out.println("O aluno " + nome + " foi aprovado!");
		} else {
			System.out.println("O aluno " + nome + " foi reprovado!");
		}

	}

}
