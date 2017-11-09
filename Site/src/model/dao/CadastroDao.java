package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.Cadastro;

public class CadastroDao {

	public Connection connection;

	public CadastroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public boolean autenticar(Cadastro cadastro) {
		String login = null;
		String senha = null;
		
		String sql = "SELECT login, senha FROM cadastro WHERE login = ? AND senha = ?;";
		
		boolean autenticado = false;
        
        try {
            PreparedStatement pstmt;
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            ResultSet rs;
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String user = rs.getString("username");
                String pass = rs.getString("senha");
                autenticado = true;
            } else {
                //JOptionPane.showMessageDialog(this, "Acesso Negado \nInforme o setor de Inventário");
                pstmt.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }

//		try {
//			Statement stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//
//			while (rs.next()) {
//				cadastro.setLogin(rs.getString("login"));
//				cadastro.setSenha(rs.getString("senha"));
//			}
//			rs.close();
//			stmt.close();
//			return cadastro != null;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}

//	}
	
	

}
