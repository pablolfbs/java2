package model;

import java.util.List;

public class Turma {
	
	private String nome;
	private List<Aluno> turma;

	public List<Aluno> getTurma() {
		return turma;
	}

	public void setTurma(List<Aluno> turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
