package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoDao {
	
	public Connection connection;
	
	public AlunoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(String nome, String cpf, String endereco, String contato) {
		String sql = "INSERT INTO alunos (nome, cpf, endereco, contato) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, cpf);
			ps.setString(3, endereco);
			ps.setString(4, contato);
			ps.execute();
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void deletar(int matricula) {
		String sql = "DELETE FROM alunos WHERE matricula = " + matricula + ";";
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterar(int matricula, String nome, String cpf, String endereco, String contato) {
		String sql = "UPDATE alunos SET nome = ?, cpf = ?, endereco = ?, contato = ? WHERE matricula = ?;";
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, cpf);
			ps.setString(3, endereco);
			ps.setString(4, contato);
			ps.setInt(5, matricula);
			ps.execute();
			JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Aluno buscarPorMatricula(int matricula) {
		String sql = "SELECT * FROM alunos WHERE matricula = " + matricula + ";";
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			Aluno a = new Aluno();
			while (rs.next()) {
				a.setNome(rs.getString("nome"));
				a.setCpf(rs.getString("cpf"));
				a.setEndereco(rs.getString("endereco"));
				a.setContato(rs.getString("contato"));
			}
			stmt.close();
			return a;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Aluno> listar() {
		String sql = "SELECT * FROM alunos;";
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Aluno> alunos = new ArrayList<>();
			
			while (rs.next()) {
				Aluno a = new Aluno();
				a.setMatricula(rs.getInt("matricula"));
				a.setNome(rs.getString("nome"));
				a.setCpf(rs.getString("cpf"));
				a.setEndereco(rs.getString("endereco"));
				a.setContato(rs.getString("contato"));
				alunos.add(a);
			}
			stmt.close();
			return alunos;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
