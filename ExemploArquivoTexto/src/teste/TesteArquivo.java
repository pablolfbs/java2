package teste;

import javax.swing.JOptionPane;

import exemplo.ManipulaArquivo;

public class TesteArquivo {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("O que deseja gravar?");
		
		String caminho = "c:/arquivos/teste.txt";
		
		ManipulaArquivo manipulador = new ManipulaArquivo();
		
		manipulador.escreveArquivo(str, caminho);
		
//		String conteudo = manipulador.lerArquivo(caminho);
		
//		JOptionPane.showMessageDialog(null, conteudo);
		
	}

}
