import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {

	JFrame telaPrincipal;
	JLabel tipoTriangulo;
	JLabel lado1Label;
	JLabel lado2Label;
	JLabel lado3Label;
	JLabel resultadoLabel;

	public View() {
		telaPrincipal();
	}

	private void telaPrincipal() {
		setLayout(new GridBagLayout());
		setSize(400, 200);
		setMinimumSize(new Dimension(400, 200));
		buildMainPainel();
		// buildPainel();
		// pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void buildMainPainel() {
		JPanel panel = new JPanel(new GridBagLayout());

		lado1Label = new JLabel("Lado 1: ");
		panel.add(lado1Label, new GBC(0, 0));

		JTextField lado1Field = new JTextField(10);
		panel.add(lado1Field, new GBC(1, 0));

		lado2Label = new JLabel("Lado 2: ");
		panel.add(lado2Label, new GBC(0, 1));

		JTextField lado2Field = new JTextField(10);
		panel.add(lado2Field, new GBC(1, 1));

		lado3Label = new JLabel("Lado 3: ");
		panel.add(lado3Label, new GBC(0, 2));

		JTextField lado3Field = new JTextField(10);
		panel.add(lado3Field, new GBC(1, 2));

		resultadoLabel = new JLabel("");
		panel.add(resultadoLabel, new GBC(2, 1));

		JButton botaoVerifica = new JButton("Verifica");
		botaoVerifica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buildPainel();
			}
		});
		panel.add(botaoVerifica, new GBC(1, 3));

		add(panel, new GBC(0, 0));

	}

	private void buildPainel() {
		// JPanel panel = new JPanel(new GridBagLayout());
		// int a = 10;
		// if (a >= 10) {
		// tipoTriangulo = new JLabel(String.valueOf(a));

		if (lado1Label.getText().equals(lado2Label.getText()) && lado2Label.getText().equals(lado3Label.getText())) {
			resultadoLabel.setText("Triângulo Equilátero");
		} else {
			resultadoLabel.setText("Outro Triângulo");
		}

//		panel.add(tipoTriangulo, new GBC(0, 0).right());

//		add(panel, new GBC(1, 0));
		// }
	}
}
