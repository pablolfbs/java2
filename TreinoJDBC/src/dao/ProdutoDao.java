package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDao {

	private Connection connection;

	PreparedStatement stmt;

	public ProdutoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrar(Produto p) {

		try {
			stmt = connection.prepareStatement("INSERT INTO produtos (nome, valor) VALUES (?, ?);");
			stmt.setString(1, p.getNome());
			stmt.setDouble(2, p.getValor());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void atualizar(Produto p) {
		try {
			stmt = connection.prepareStatement("UPDATE produtos SET nome = ?, valor = ? WHERE id = ?;");
			stmt.setString(1, p.getNome());
			stmt.setDouble(2, p.getValor());
			stmt.setInt(3, p.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Produto> listar() {

		Connection conn = new ConnectionFactory().getConnection();

		try {
			stmt = connection.prepareStatement("SELECT * FROM produtos;");

			ResultSet rs = stmt.executeQuery();

			List<Produto> produtos = new ArrayList<>();

			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setValor(rs.getDouble("valor"));

				produtos.add(p);
			}
			rs.close();
			stmt.close();
			conn.close();

			return produtos;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void excluir(Produto p) {
		try {
			stmt = connection.prepareStatement("DELETE FROM produtos WHERE id = ?;");
			stmt.setInt(1, p.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
