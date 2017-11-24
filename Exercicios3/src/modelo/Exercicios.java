package modelo;

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

}
