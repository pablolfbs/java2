package model.dao;

import java.sql.Connection;
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

	public Professor inserir(int id, String nome) {
		String sql = " INSERT INTO professor VALUES (" + id + ",'" + nome + "'); ";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Professor inserido com SUCESSO!");
			stmt.close();
			Professor p = new Professor();
			return p;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERRO!");
			throw new RuntimeException(e);
		}

	}

	public Professor atualizar(int id, String nome) {
		String sql = " UPDATE professor SET nome = '" + nome + "' WHERE id = " + id + "; ";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Professor atualizado com SUCESSO!");
			stmt.close();
			Professor p = new Professor();
			return p;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERRO!");
			throw new RuntimeException(e);
		}

	}

	public Professor buscarPorId(int id) {
		String sql = " SELECT * FROM professor WHERE id = " + id + "; ";

		Statement stmt;
		try {
			stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			Professor p = new Professor();

			while (rs.next()) {
				p.setNome(rs.getString("nome"));
			}
			stmt.close();
			return p;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERRO!");
			e.printStackTrace();
		}
		return null;

	}

	public Professor buscarPorNome(String nome) {
		String sql = " SELECT * FROM professor WHERE nome = '" + nome + "'; ";

		Statement stmt;
		try {
			stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			Professor p = new Professor();

			while (rs.next()) {
				p.setId(rs.getInt("id"));
			}
			stmt.close();
			return p;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERRO!");
			e.printStackTrace();
		}
		return null;

	}

	public void excluir(int id) {
		String sql = " DELETE FROM professor WHERE id = " + id + "; ";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Professor excluído com SUCESSO!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Professor> listar() {
		String sql = " SELECT * FROM professor; ";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<Professor> professores = new ArrayList<>();

			while (rs.next()) {
				Professor p = new Professor();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				professores.add(p);
			}
			stmt.close();
			return professores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
