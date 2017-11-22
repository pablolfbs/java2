package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Professor;

public class ProfessorDao {

	public Connection connection;

	public ProfessorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Professor professor) {
		String sql = "INSERT INTO professores (nome) VALUES (?, ?)";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, professor.getMatricula());
			stmt.setString(2, professor.getNome());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void atualizar(Professor professor) {
		String sql = "UPDATE professores SET nome = ? WHERE matricula = ?;";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, professor.getNome());
			stmt.setInt(2, professor.getMatricula());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Professor buscarPorMatricula(Professor p) {
		String sql = "SELECT * FROM professores WHERE matricula = ?;";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, p.getMatricula());
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				p.setNome(rs.getString("nome"));
			}
			rs.close();
			stmt.close();
			return p;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void excluir(Professor professor) {
		String sql = "DELETE FROM professores WHERE matricula = ?;";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, professor.getMatricula());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "REGISTRO APAGADO COM SUCESSO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Professor> listar() {
		String sql = "SELECT * FROM professores;";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Professor> professores = new ArrayList<>();
			
			while(rs.next()) {
				Professor professor = new Professor();
				
				professor.setMatricula(rs.getInt("matricula"));
				professor.setNome(rs.getString("nome"));
				
				professores.add(professor);
			}
			stmt.executeQuery();
			rs.close();
			stmt.close();
			return professores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
