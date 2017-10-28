/*
 * Calcular IMC
 * imc = pesoEmKg / (alturaEmMts * alturaEmMts)
 */
package Imc;

/**
 *
 * @author Antonio Carlos
 */
public class CalcularImc extends javax.swing.JFrame {
	String peso;
	String altura;
	String massa;
	String imc;

	public CalcularImc() {
		initComponents();
		setResizable(false);// desabilitar o Botao Maximizar
		setLocationRelativeTo(null);// iniciar a tela no centro do monitor
	}

	public String setReturn() {

		return massa;

	}

	public void calcular() {

		String peso = jTxtPeso.getText().trim();
		String altura = jTxtPeso.getText().trim();

		double pesoEmKg = Double.parseDouble(peso);
		double alturaEmMts = Double.parseDouble(altura);

		double imc = pesoEmKg / (alturaEmMts * alturaEmMts);

		jLblResposta.setText(String.valueOf(imc));

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTxtPeso = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTxtAltura = new javax.swing.JTextField();
		jLblResposta = new javax.swing.JLabel();
		jBCalcular = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTxtPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jTxtPeso.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTxtPesoActionPerformed(evt);
			}
		});

		jLabel1.setText("Calcule  a Massa Corporal do seu Corpo.");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel2.setText("Peso");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel3.setText("Altura");

		jTxtAltura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jTxtAltura.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTxtAlturaActionPerformed(evt);
			}
		});

		jLblResposta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		jLblResposta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jBCalcular.setText("Calcular");
		jBCalcular.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBCalcularActionPerformed(evt);
			}
		});

		jLabel5.setText("Preencha os Campos Abaixo");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jLblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(74, 74, 74))
						.addGroup(layout.createSequentialGroup().addGap(55, 55, 55)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jTxtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 42,
												Short.MAX_VALUE)
										.addComponent(jTxtAltura))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jBCalcular).addGap(26, 26, 26))
						.addGroup(layout.createSequentialGroup().addGap(78, 78, 78).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup()
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(28, 28, 28)))
								.addContainerGap(46, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel1).addGap(21, 21, 21)
				.addComponent(jLabel5).addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(38, 38, 38))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jBCalcular).addGap(55,
										55, 55)))
				.addComponent(jLblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(23, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {
		calcular();
	}

	private void jTxtAlturaActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTxtPesoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CalcularImc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CalcularImc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CalcularImc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CalcularImc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CalcularImc().setVisible(true);

			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jBCalcular;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLblResposta;
	private javax.swing.JTextField jTxtAltura;
	private javax.swing.JTextField jTxtPeso;
	// End of variables declaration

}