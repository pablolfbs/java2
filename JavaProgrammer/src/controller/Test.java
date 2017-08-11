package controller;

import javax.swing.plaf.synth.SynthSeparatorUI;

import model.E;
import view.Console;

class Test {

	public static void main(String[] args) {

//		StringBuilder sb = new StringBuilder();
//		sb.append("Pablo ").append("Luiz ").append("Faria ").append("Britto ").append("de ").append("Souza").reverse()
//				.toString();
//		System.out.println(sb);
//		System.out.println(sb.indexOf("a"));
//		System.out.println(sb.lastIndexOf("a"));
//
//		String str = "             Pablo  Faria          ".replace("  ", " ");
//		System.out.println(str.trim().toUpperCase());
//
//		String empty = null;
//		String full = "Pablo" + empty;
//		System.out.println(full);
//
//		String s = "guilherme";
//		s = s.substring(0, 3);
//		System.out.println(s);
//
//		E e = new E();
//		e.sortidos();
//		System.out.println();
//		e.sortidos2();
//		System.out.println("\n");
//		e.jogo();
		
//		new Console();
		
//		int i = 5;
//		System.out.println(i == 5 ? "match": "oops");
//		System.out.println(i != 5 ? 1: 2);
//		String mensagem = i % 2 == 0 ? "even" : "odd";
//		System.out.println(mensagem);
		
//		System.out.println(15 + 0 + " != 150");
//		// 15 != 150
//		System.out.println(15 + (0 + " == 150"));
//		// 150 == 150
//		System.out.println(10 + (10 + " == 30"));
		
		
//		Client c1 = new Client("guilherme");
//		Client c2 = new Client("mario");
//		System.out.println(c1.equals(c2)); // false
//		System.out.println(c1.equals(c1)); // true
//		Client c3 = new Client("guilherme");
//		System.out.println(c1.equals(c3)); // false, pois não é a mesma referência: são objetos diferentes na memória
		
		String s1 = "s1";
		String s2 = s1.substring(1, 1) + s1.substring(1,1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2);

	}
}
