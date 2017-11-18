package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.management.RuntimeErrorException;

import model.Contato;

public class ContatoDao {

	private Connection connection;

	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrar(Contato contato) {

		String sql = "INSERT INTO contatos (nome, endereco, email, dataNascimento) values (?,?,?,?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEndereco());
			stmt.setNString(3, contato.getEmail());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Contato> listar() {

		Connection con = new ConnectionFactory().getConnection();

		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM contatos;");
			ResultSet rs = stmt.executeQuery();

			List<Contato> contatos = new ArrayList<>();

			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				c.setDataNascimento(data);

				contatos.add(c);
			}
			rs.close();
			stmt.close();
			con.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public Contato buscarPorId(Contato c) {
		String sql = "SELECT * FROM contatos WHERE id = ?;";

		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setLong(1, c.getId());
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				c.setDataNascimento(data);
			}
			return c;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void atualizar(Contato contato) {

		String sql = "UPDATE contatos SET nome = ?, email = ?, endereco = ?, dataNascimento = ? WHERE id = ?;";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deletar(Contato contato) {

		String sql = "DELETE FROM contatos WHERE id = ?;";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
