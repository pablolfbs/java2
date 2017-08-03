package controller;

import model.E;

class Test {
	
	public static void main(String[] args) {
		
		StringBuilder sb =  new StringBuilder();
		sb.append("Pablo ").append("Luiz ").append("Faria ")
		.append("Britto ").append("de ").append("Souza").reverse().toString();
		System.out.println(sb);
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.lastIndexOf("a"));
		
		String str = "             Pablo  Faria          ".replace("  ", " ");
		System.out.println(str.trim().toUpperCase());
		
		String empty = null;
		String full = "Pablo" + empty;
		System.out.println(full);
		
		String s = "guilherme";
		s = s.substring(0,3);
		System.out.println(s);
		
		new E().soma();
	}
}
