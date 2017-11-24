package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoDao {

	public Connection connection;

	public AlunoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Aluno aluno) {
		String sql = "INSERT INTO aluno VALUES(?, ?);";

		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, aluno.getId());
			ps.setString(2, aluno.getNome());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void excluir(int id) {
		String sql = "DELETE FROM aluno WHERE id = " + id + ";";
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void atualizar(Aluno aluno) {
		String sql = "UPDATE aluno SET nome = ? WHERE id = ?;";

		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Aluno> listar() {
		String sql = "SELECT * FROM aluno ORDER BY id;";

		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			List<Aluno> alunos = new ArrayList<>();

			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				alunos.add(aluno);
			}
			rs.close();
			ps.close();
			return alunos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public Aluno buscarPorId(int id) {
		String sql = "SELECT * FROM aluno WHERE id = ?;";
		
		Aluno a = new Aluno();
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				a.setNome(rs.getString("nome"));
			}
			rs.close();
			ps.close();
			return a;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
