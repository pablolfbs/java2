package model;

public class MediaAluno {

	int[] notas = new int[3];

	public void adiciona(int nota) {
		if (nota >= 0 && nota <= 100) {
			notas[0] = 100;
			notas[1] = 70;
			notas[2] = 60;
		} else {
			System.out.println("Valor inválido!!");
		}

	}

	public void calculaMedia() {

	}

}
