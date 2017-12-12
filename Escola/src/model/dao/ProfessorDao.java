package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Professor;

public class ProfessorDao {
	
	public Connection connection;
	
	public ProfessorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(String nome, String cpf) {
		String sql = "INSERT INTO professores (nome, cpf) VALUES ('" + nome + "', '" + cpf + "')";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int atualizar(int matricula, String nome, String cpf) {
		String sql = "UPDATE professores SET nome = '" + nome + "', cpf = '" + cpf + "' WHERE matricula = " + matricula + ";";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			stmt.close();
			return matricula;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public int excluir(int matricula) {
		String sql = "DELETE FROM professores WHERE matricula = " + matricula + ";";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			stmt.close();
			return matricula;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Professor buscarPorMatricula(int matricula) {
		String sql = "SELECT * FROM professores WHERE matricula = " + matricula + ";";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			Professor p = new Professor();
			while (rs.next()) {
				p.setNome(rs.getString("nome"));
				p.setCpf(rs.getString("cpf"));
			}
			stmt.close();
			return p;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Professor> listar() {
		String sql = "SELECT * FROM professores;";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Professor> professores = new ArrayList<>();
			
			while (rs.next()) {
				Professor p = new Professor();
				p.setMatricula(rs.getInt("matricula"));
				p.setNome(rs.getString("nome"));
				p.setCpf(rs.getString("cpf"));
				professores.add(p);
			}
			stmt.close();
			return professores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
