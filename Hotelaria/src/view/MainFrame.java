package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainFrame extends JFrame {
	
		public MainFrame() {
			build();
		}

		private void build() {
			setLayout(new GridBagLayout());
			buildMenu();
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
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
		}

		private void buildMenu() {
			
		}

}
