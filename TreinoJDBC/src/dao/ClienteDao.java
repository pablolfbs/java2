package dao;

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

	public void cadastrar(Cliente c) {
		String sql = "INSERT INTO clientes (nome, cpf, endereco, telefone) VALUES (?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setString(3, c.getEndereco());
			stmt.setString(4, c.getTelefone());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "INSERIDO COM SUCESSO!!");
			stmt.close();
		} catch (SQLException e) {
			System.out.println("FALHOU!!");
		}
	}

	public void atualizar(Cliente c) {
		String sql = "UPDATE clientes SET nome = ?, cpf = ?, endereco = ?, telefone = ? WHERE id = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setString(3, c.getEndereco());
			stmt.setString(4, c.getTelefone());
			stmt.setInt(5, c.getId());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "CONTATO ' " + c.getId() + " ' FOI ATUALIZADO COM SUCESSO!!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> listar() {
		
		Connection con = new ConnectionFactory().getConnection();

		String sql = "SELECT * FROM clientes;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Cliente> clientes = new ArrayList<>();
			
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEndereco(rs.getString("endereco"));
				c.setTelefone(rs.getString("telefone"));
				
				clientes.add(c);
			}
			stmt.executeQuery();
			rs.close();
			stmt.close();
			con.close();
			return clientes;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void excluir(Cliente c) {
		String sql = "DELETE FROM clientes WHERE id = ?;";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, c.getId());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "O CLIENTE DE ID ' " + c.getId() + " ' FOI EXCLUÍDO COM SUCESSO");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
