import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContatoFrame extends JFrame {

	JTextField nomeField;
	JTextField telefoneField;

	public ContatoFrame() {
		super("Agenda Telefônica");

		criarMenu();
		criarFormulario();

	}

	private void criarFormulario() {
		setLayout(new BorderLayout());

		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());

		JLabel titulo = new JLabel("Cadastro de Contato");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));

		panelTitulo.add(titulo);

		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(new FlowLayout());

		JLabel nomeLabel = new JLabel("Nome");
		nomeField = new JTextField(20);

		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneField = new JTextField(20);
		telefoneField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				try {
					int x = Integer.parseInt(telefoneField.getText() + e.getKeyChar());
				} catch (Exception e2) {
					e.consume();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

		panelCadastro.add(nomeLabel);
		panelCadastro.add(nomeField);
		panelCadastro.add(telefoneLabel);
		panelCadastro.add(telefoneField);

		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());

		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		JButton botaoFechar = new JButton("Fechar");
		botaoFechar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		panelBotoes.add(botaoSalvar);
		panelBotoes.add(botaoFechar);

		add(panelTitulo, BorderLayout.NORTH);
		add(panelCadastro, BorderLayout.CENTER);
		add(panelBotoes, BorderLayout.SOUTH);
	}

	private void criarMenu() {
		JMenu menuContato = new JMenu("Contato");

		JMenuItem menuItemNovo = new JMenuItem("Novo");
		menuItemNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nomeField.setText("");
				telefoneField.setText("");
			}
		});
		menuContato.add(menuItemNovo);

		JMenuItem menuItemSalvar = new JMenuItem("Salvar");
		menuItemSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuContato.add(menuItemSalvar);

		JMenuItem menuItemFechar = new JMenuItem("Fechar");
		menuItemFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuContato.add(menuItemFechar);

		JMenu menuAjuda = new JMenu("Ajuda");

		JMenuItem menuItemSobre = new JMenuItem("Sobre");
		menuItemSobre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa de Cadastro - Versão alpha 1.0", "Versão", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuAjuda.add(menuItemSobre);

		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(menuContato);
		barra.add(menuAjuda);
	}

}
