package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoDao {

	private Connection connection;

	public AlunoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Aluno aluno) {
		String sql = "INSERT INTO alunos (nome, dtNasc, nomeMae) VALUES (?, ?, ?);";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getDtNasc());
			stmt.setString(3, aluno.getNomeMae());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void excluir(Aluno aluno) {

		String sql = "DELETE FROM alunos WHERE id = ?;";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, aluno.getId());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "REGISTRO APAGADO COM SUCESSO");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void atualizar(Aluno aluno) {
		
		String sql = "UPDATE alunos SET nome = ?, dtNasc = ?, nomeMae = ? WHERE id = ?;";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getDtNasc());
			stmt.setString(3, aluno.getNomeMae());
			stmt.setInt(4, aluno.getId());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Aluno> listar() {
		
		String sql = "SELECT * FROM alunos;";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Aluno> alunos = new ArrayList<>();
			
			while (rs.next()) {
				Aluno aluno = new Aluno();
				
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setDtNasc(rs.getString("dtNasc"));
				aluno.setNomeMae(rs.getString("nomeMae") + "\n");
				
				alunos.add(aluno);
			}
			stmt.executeQuery();
			rs.close();
			stmt.close();
			return alunos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
