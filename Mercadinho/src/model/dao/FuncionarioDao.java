package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Funcionario;

public class FuncionarioDao {
	
	static final Logger logger = LogManager.getLogger(FuncionarioDao.class.getName());

	public Connection connection;

	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Funcionario f) {
		String sql = "INSERT INTO funcionarios (nome, cpf, endereco) VALUES (?, ?, ?);";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getCpf());
			stmt.setString(3, f.getEndereco());
			stmt.execute();
			logger.info("Inserido com sucesso!");
			stmt.close();
		} catch (SQLException e) {
			logger.error("Falha!");
		}

	}

	public void atualizar(Funcionario f) {
		String sql = "UPDATE funcionarios SET nome = ?, cpf = ?, endereco = ? WHERE id = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getCpf());
			stmt.setString(3, f.getEndereco());
			stmt.setInt(4, f.getId());
			stmt.execute();
			logger.info("Atualizado com sucesso!");
			stmt.close();
		} catch (SQLException e) {
			logger.trace("Falha!");
			e.printStackTrace();
		}
	}

	public void excluir(Funcionario f) {
		String sql = "DELETE FROM funcionarios WHERE id = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, f.getId());
			stmt.execute();
			logger.info("Deletado com sucesso!");
			stmt.close();
		} catch (SQLException e) {
			logger.error("Falha!");
			e.printStackTrace();
		}
	}

	public List<Funcionario> listar() {
		String sql = "SELECT * FROM funcionarios;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);

			List<Funcionario> funcionarios = new ArrayList<Funcionario>();

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Funcionario f = new Funcionario();
				f.setId(rs.getInt("id"));
				f.setNome(rs.getString("nome"));
				f.setCpf(rs.getString("cpf"));
				f.setEndereco(rs.getString("endereco"));
				funcionarios.add(f);
			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (SQLException e) {
			logger.error("Falha!");
			throw new RuntimeException(e);
		}
		
	}
	
	public Funcionario buscarPorId(Funcionario f) {
		String sql = "SELECT * FROM funcionarios WHERE id = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, f.getId());

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				f.setNome(rs.getString("nome"));
				f.setCpf(rs.getString("cpf"));
				f.setEndereco(rs.getString("endereco"));
			}
			rs.close();
			stmt.close();
			return f;
		} catch (SQLException e) {
			logger.error("Falha!");
			throw new RuntimeException(e);
		}
		
	}

}
