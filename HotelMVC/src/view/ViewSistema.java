package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControladorReserva;

public class ViewSistema {

	private JFrame janelaPrincipal;
	private JFrame janelaCadastro;

	public ViewSistema() {
		janelaPrincipal = new JFrame("Hotel");
		janelaCadastro = new JFrame("Hotel - Cadastro");
	}

	public void criarTelaPrincipal() {
		JPanel panel = new JPanel();

		JButton botaoCadastrar = new JButton("Cadastrar Reserva");
		JButton botaoSair = new JButton("Sair");

		ActionListener cadastrarListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janelaCadastro.setVisible(true);
			}
		};

		ActionListener sairListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};

		botaoCadastrar.addActionListener(cadastrarListener);
		botaoSair.addActionListener(sairListener);

		panel.add(botaoCadastrar);
		panel.add(botaoSair);
		
		janelaPrincipal.add(panel);
		janelaPrincipal.pack();
		janelaPrincipal.setVisible(true);
	}
	
	public void criarTelaCadastro(ControladorReserva controlador) {
		JPanel panel = new JPanel();
		
		JLabel labelNome = new JLabel("Nome: ");
		JTextField fieldNome = new JTextField(50);
		
		JLabel labelEmail = new JLabel("E-mail: ");
		JTextField fieldEmail = new JTextField(50);
		
		JButton botaoSalvar = new JButton("Gravar Reserva");
		
		ActionListener listenerSalvar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (controlador.realizarCadastro(fieldNome.getText(), fieldEmail.getText())) {
					JOptionPane.showMessageDialog(janelaCadastro, "Cadastro realizado com sucesso.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(janelaCadastro, "Falha no cadastro.", "Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}
		};
		
		botaoSalvar.addActionListener(listenerSalvar);
		
		panel.add(labelNome);
		panel.add(fieldNome);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		panel.add(botaoSalvar);

		
		janelaCadastro.add(panel);
		janelaCadastro.pack();
		
	}
}
