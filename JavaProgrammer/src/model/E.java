package model;

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
	}
	
}
