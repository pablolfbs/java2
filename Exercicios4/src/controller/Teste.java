package controller;

import java.util.List;

import model.Aluno;
import model.Turma;
import model.dao.AlunoDao;
import model.dao.TurmaDao;

public class Teste {

	public static void main(String[] args) {

		AlunoDao aDao = new AlunoDao();
		TurmaDao tDao = new TurmaDao();
		
//		Aluno a = aDao.cadastrar(6, "Carlos", "Filosofia", 9.5f);

//		Aluno a = aDao.atualizar(3, "Nadja", "Letras", 8);

//		Aluno a = aDao.buscarPorMatricula(4);
//		System.out.println(a.getNome());
		
//		Aluno a = aDao.buscarPorNome("Ingrid");
//		System.out.println(a.getMatricula() + " - " + a.getNome() + " - " + a.getCurso() + " - "
//				+ a.getMedia());

//		aDao.excluir(3);

//		List<Aluno> alunos = aDao.listar();

//		for (Aluno aluno : alunos) {
//			System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso() + " - "
//					+ aluno.getMedia());
//			System.out.println();
//		}
		
		List<Aluno> turma = tDao.listar();
		Turma t = new Turma();
		
		t.setNome("Turma1");
		System.out.println(t.getNome());
		System.out.println();
		
		for (Aluno aluno : turma) {
			System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso() + " - "
					+ aluno.getMedia());
			System.out.println();
		}
		
		turma = tDao.listarPorNome();
		t = new Turma();
		
		t.setNome("Turma1");
		System.out.println(t.getNome());
		System.out.println();
		
		for (Aluno aluno : turma) {
			System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso() + " - "
					+ aluno.getMedia());
			System.out.println();
		}
		
		turma = tDao.listarPorMedia();
		t = new Turma();
		
		t.setNome("Turma1");
		System.out.println(t.getNome());
		System.out.println();
		
		for (Aluno aluno : turma) {
			System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso() + " - "
					+ aluno.getMedia());
			System.out.println();
		}
		
//		for (Aluno aluno : alunos) {
//			System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso() + " - "
//					+ aluno.getMedia());
//			System.out.println();
//		}
	}
}
