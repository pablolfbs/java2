package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Cliente;

public class ClienteDao {

	public Connection connection;

	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Cliente cliente) {
		String sql = "INSERT INTO clientes (nome, cpf, endereco) VALUES (?, ?, ?)";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEndereco());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "INSERIDO COM SUCESSO!");
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "FALHOU!");
		}

	}

	public void atualizar(Cliente cliente) {
		String sql = "UPDATE clientes SET nome = ?, cpf = ?, endereco = ? WHERE id = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEndereco());
			stmt.setInt(4, cliente.getId());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO!");
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "FALHOU!");
		}

	}

	public void excluir(Cliente cliente) {
		String sql = "DELETE FROM clientes WHERE id = " + cliente.getId() + ";";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.execute();
			JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO!");
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "FALHOU!");
		}
	}

	public List<Cliente> listar() {

		String sql = "SELECT * FROM clientes;";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			List<Cliente> clientes = new ArrayList<>();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));

				clientes.add(cliente);
			}
			stmt.executeQuery();
			rs.close();
			stmt.close();

			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Cliente buscarPorCodigo(Cliente cliente) {
		String sql = "SELECT * FROM clientes WHERE id = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getId());
//			stmt.executeQuery();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				cliente.setId(rs.getInt("id"));
			}
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
