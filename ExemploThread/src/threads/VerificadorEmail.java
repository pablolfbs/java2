package threads;

import java.io.File;

import javax.swing.JOptionPane;

import exemplo.ManipulaArquivo;

public class VerificadorEmail extends Thread {
	
	private void notifica(File arq) {
		String msg = ManipulaArquivo.lerArquivo(arq);
		
		JOptionPane.showMessageDialog(null, msg, "Novo e-mail", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void run() {
		File arquivo = null;
		
		while(true) {
			arquivo = new File("C:/serializacao/email.txt");
			
			if(arquivo.exists()) {
				notifica(arquivo);
				arquivo.delete();
			}
			
		}
		
	}
	
}
