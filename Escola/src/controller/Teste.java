package controller;

import java.util.List;

import model.Professor;
import model.dao.ProfessorDao;

public class Teste {

	public static void main(String[] args) {

		/*
		 * AlunoDao aDao = new AlunoDao();
		 * aDao.inserir("Nadja", "0123456789", "Rua Ubiraci", "21 965618083");
		 * 
		 * aDao.deletar(14);
		 * 
		 * aDao.alterar(12, "Marcello", "987654321", "Rua Ubiraci", "21 99999999");
		 * 
		 * Aluno a = aDao.buscarPorMatricula(15);
		 * 
		 * List<Aluno> alunos = aDao.listar();
		 * for (Aluno aluno : alunos) {
		 * System.out.println(aluno.getMatricula());
		 * System.out.println(aluno.getNome());
		 * System.out.println(aluno.getCpf());
		 * System.out.println(aluno.getEndereco());
		 * System.out.println(aluno.getContato() + "\n");
		 * }
		 */

		ProfessorDao pDao = new ProfessorDao();

		/*
		 * pDao.atualizar(1, "Pablo", "07637049701");
		 * 
		 * pDao.inserir("Nadja", "12345678910");
		 * 
		 * pDao.excluir(3);
		 * 
		 * Professor p = pDao.buscarPorMatricula(1);
		 * 
		 * System.out.println(p.getNome());
		 */
		
		List<Professor> professores = pDao.listar();
		for (Professor professor : professores) {
			System.out.println(professor.getMatricula());
			System.out.println(professor.getNome());
			System.out.println(professor.getCpf() + "\n");
		}

	}

}
