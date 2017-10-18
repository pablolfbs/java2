package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutDialog extends JDialog {
	
	public AboutDialog(MainFrame mainFrame) {
		build(mainFrame);
	}

	private void build(MainFrame mainFrame) {
		addComponents();
		setSize(300, 200);
		setResizable(false);
		setLocationRelativeTo(mainFrame);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	private void addComponents() {
		String s = "Programa de gestão - Hotelaria 2017";
		JLabel label = new JLabel(s);
		add(label);
	}
	
}
