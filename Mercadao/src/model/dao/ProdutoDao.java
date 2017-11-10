package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Produto;

public class ProdutoDao {

	public Connection connection;

	public ProdutoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Produto produto) {
		String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?);";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getPreco());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "INSERIDO COM SUCESSO!!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Produto produto) {
		String sql = "UPDATE produtos SET nome = ?,  preco = ? WHERE codigo = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getPreco());
			stmt.setInt(3, produto.getCodigo());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO!!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir(Produto produto) {
		String sql = "DELETE FROM produtos WHERE codigo = ?;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, produto.getCodigo());
			stmt.execute();
			JOptionPane.showMessageDialog(null, "REGISTRO APAGADO COM SUCESSO!!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Produto> listar() {
		String sql = "SELECT * FROM produtos;";

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			List<Produto> produtos = new ArrayList<>();
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codigo"));
				p.setNome(rs.getString("nome"));
				p.setPreco(rs.getFloat("preco"));
				
				produtos.add(p);
			}
			stmt.executeQuery();
			rs.close();
			stmt.close();
			
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
