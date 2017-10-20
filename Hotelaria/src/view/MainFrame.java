package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	public MainFrame() {
		buildMainFrame();
	}
	
	public void buildMainFrame() {
		setLayout(new GridBagLayout());
		buildComponents();
		setTitle("Hotelaria");
		setSize(600, 400);
		setMinimumSize(new Dimension(600, 400));
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void buildComponents() {
		buildMenu();
		buildMainPanel();
		buildButtonPanel();
	}

	private void buildButtonPanel() {
		
	}

	private void buildMainPanel() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		String[] itens = {"Check-in", "Check-out"};
		JComboBox<String> comboBox = new JComboBox<>(itens);
		panel.add(comboBox, new GBC(0, 0));
		
		JTextField searchField = new JTextField(20);
		panel.add(searchField, new GBC(1, 0).horizontal());
		
		buildTable(panel);
		
		add(panel, new GBC(0, 0).insets(10, 5, 5, 0));
	}

	private void buildTable(JPanel panel) {
		
	}

	private void buildMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);
		JMenuItem aboutItem = new JMenuItem("Sobre");
		helpMenu.add(aboutItem);
		aboutItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutDialog(MainFrame.this);
			}
		});
		JMenuItem exitItem = new JMenuItem("Sair");
		helpMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
