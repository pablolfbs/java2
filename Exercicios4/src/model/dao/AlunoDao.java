package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aluno;

public class AlunoDao {

	public Connection connection;

	public AlunoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public Aluno cadastrar(int matricula, String nome, String curso, float media) {
		String sql = "INSERT INTO alunos VALUES (?, ?, ?, ?)";

		Aluno aluno = new Aluno();
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, matricula);
			ps.setString(2, nome);
			ps.setString(3, curso);
			ps.setFloat(4, media);
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}

	public Aluno atualizar(int matricula, String nome, String curso, float media) {
		String sql = "UPDATE alunos SET nome = '" + nome + "', curso = '" + curso + "', media = " + media
				+ " WHERE matricula = " + matricula + ";";

		Aluno aluno = new Aluno();
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}

	public Aluno buscarPorMatricula(int matricula) {
		String sql = "SELECT * FROM alunos WHERE matricula = " + matricula + ";";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			Aluno a = new Aluno();

			while (rs.next()) {
				a.setMatricula(rs.getInt("matricula"));
				a.setMatricula(rs.getInt("matricula"));
				a.setCurso(rs.getString("curso"));
				a.setMedia(rs.getFloat("media"));
			}
			stmt.close();
			return a;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public Aluno buscarPorNome(String nome) {
		String sql = "SELECT * FROM alunos WHERE nome = '" + nome + "';";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			Aluno a = new Aluno();

			while (rs.next()) {
				a.setMatricula(rs.getInt("matricula"));
				a.setNome(rs.getString("nome"));
				a.setCurso(rs.getString("curso"));
				a.setMedia(rs.getFloat("media"));
			}
			stmt.close();
			return a;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void excluir(int matricula) {
		String sql = "DELETE FROM alunos WHERE matricula = " + matricula + ";";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
