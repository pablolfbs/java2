package controller;

import java.util.List;

import model.Aluno;
import model.Professor;
import model.dao.AlunoDao;
import model.dao.ProfessorDao;

public class Teste {
	
	public static void main(String[] args) {
		
//		AlunoDao aDao = new AlunoDao();
//		Aluno a = new Aluno();
		
//		a.setNome("Roberta");
//		a.setId(5);
		
//		aDao.inserir(a);
		
//		aDao.excluir(a);
		
//		aDao.atualizar(a);
		
//		List<Aluno> alunos = aDao.listar();
		
//		for (Aluno aluno : alunos) {
//			System.out.println(aluno.getId());
//			System.out.println(aluno.getNome());
//		}
		
//		Aluno a = aDao.buscarPorId(1);
		
//		aDao.excluir(3);
		
//		List<Aluno> alunos = aDao.listar();
//		
//		for (Aluno aluno : alunos) {
//			System.out.println(aluno.getId() + "\n" + aluno.getNome());
//		}
		
		ProfessorDao pDao = new ProfessorDao();
		
//		Professor p = pDao.inserir(8, "Rogério");
		
//		pDao.excluir(8);
		
//		Professor p = pDao.buscarPorNome("Rosa Maria");
		
//		System.out.println(p.getId());
		
		
		List<Professor> professores = pDao.listar();
		
		for (Professor professor : professores) {
			System.out.println(professor.getId());
			System.out.println(professor.getNome());
			System.out.println("");
		}
		
		
	}

}
