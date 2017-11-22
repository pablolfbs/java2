package controller;

import java.util.List;

import model.Aluno;
import model.Professor;
import model.dao.AlunoDao;
import model.dao.ProfessorDao;

public class Teste {

	public static void main(String[] args) {

//		AlunoDao aDao = new AlunoDao();
//
//		List<Aluno> alunos = aDao.listar();
//
//		for (Aluno aluno : alunos) {
//			System.out.println("ID: " + aluno.getId());
//			System.out.println("Nome: " + aluno.getNome());
//			System.out.println("Data de Nascimento: " + aluno.getDtNasc());
//			System.out.println("Nome da Mãe: " + aluno.getNomeMae());
//		}
		
		
		

//		AlunoDao aDao = new AlunoDao();
//
//		Aluno a = new Aluno();
//
//		a.setNome("Pablo");
//		a.setDtNasc("12/09/1978");
//		a.setNomeMae("Nadja");
//
//		aDao.inserir(a);
		
		
		
		
//		AlunoDao aDao = new AlunoDao();
//		
//		Aluno a = new Aluno();
//		
//		a.setId(4);
//		
//		aDao.excluir(a);
		
		
		
		
//		AlunoDao aDao = new AlunoDao();
//		
//		Aluno a = new Aluno();
//		
//		a.setNome("Ingrid");
//		a.setDtNasc("25/08/1988");
//		a.setNomeMae("Rosa Maria");
//		a.setId(3);
//		
//		aDao.atualizar(a);
		
		
		
		
		
		ProfessorDao pDao = new ProfessorDao();
		Professor p = new Professor();
		
		p.setMatricula(2);
		pDao.buscarPorMatricula(p);
		
		System.out.println(p.getMatricula());
		System.out.println(p.getNome());
		
		
//		List<Professor> professores = pDao.listar();
//		
//		for (Professor professor : professores) {
//			System.out.println("Matricula: " + professor.getMatricula());
//			System.out.println("Nome: " + professor.getNome());
//		}
		
	}

}
