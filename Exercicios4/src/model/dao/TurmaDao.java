package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Turma;

public class TurmaDao {
	
	public Connection connection;

	public TurmaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public List<Aluno> listar() {
		String sql = "SELECT * FROM turma;";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Aluno> alunos = new ArrayList<>();
			
			Turma turma = new Turma();
			
			while (rs.next()) {
				Aluno a = new Aluno();
				a.setMatricula(rs.getInt("matricula"));
				a.setNome(rs.getString("nome"));
				a.setCurso(rs.getString("curso"));
				a.setMedia(rs.getFloat("media"));
				alunos.add(a);
				turma.setAlunos(alunos);
			}
			rs.close();
			stmt.close();
			return alunos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public List<Aluno> listarPorNome() {
		String sql = "SELECT * FROM alunos ORDER BY nome;";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Aluno> turma = new ArrayList<>();
			
			while (rs.next()) {
				Aluno a = new Aluno();
				a.setMatricula(rs.getInt("matricula"));
				a.setNome(rs.getString("nome"));
				a.setCurso(rs.getString("curso"));
				a.setMedia(rs.getFloat("media"));
				turma.add(a);
			}
			rs.close();
			stmt.close();
			return turma;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public List<Aluno> listarPorMedia() {
		String sql = "SELECT * FROM alunos ORDER BY media DESC;";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Aluno> turma = new ArrayList<>();
			
			while (rs.next()) {
				Aluno a = new Aluno();
				a.setMatricula(rs.getInt("matricula"));
				a.setNome(rs.getString("nome"));
				a.setCurso(rs.getString("curso"));
				a.setMedia(rs.getFloat("media"));
				turma.add(a);
			}
			rs.close();
			stmt.close();
			return turma;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
