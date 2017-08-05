package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E {

	public void soma() {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int a = in.nextInt();
		System.out.println("Digite outro nº: ");
		int b = in.nextInt();
		int c = a + b;
		System.out.println("O resultado é: " + c);
		in.close();
	}

	public void sortidos() {

		ArrayList<Integer> arl = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 1; i <= 50; i++) {
			arl.add(rand.nextInt(100));
		}
		System.out.println(arl);
	}

	public void sortidos2() {

		int[] array = new int[50];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + " ");
		}
	}

	public void jogo() {

		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int a;
		int countsize = 0;
		int x = rand.nextInt(100);
		System.out.println(x);
		int i = 0;
		System.out.println("Tente adivinhar o número!!");
		System.out.println("Digite um número de 1 a 100");

		do {
			a = in.nextInt();
			countsize++;

			if (a > x) {
				System.out.println("Muito alto!!");
				System.out.println(countsize + " tentativa(s)");
			}
			if (a < x) {
				System.out.println("Muito baixo!!");
				System.out.println(countsize + " tentativa(s)");
			}
			if (a == x) {
				System.out.println("Parabéns!!!!\n Você acertou em " + countsize + " tentativa(s).");
			}
		} while (a != x);
	}

	
}
