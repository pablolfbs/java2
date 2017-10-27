package teste;

import javax.swing.JOptionPane;

import exemplo.ManipulaArquivo;

public class TesteArquivo {
	
	public static void main(String[] args) {
		
		ManipulaArquivo manipulador = new ManipulaArquivo();
		
//		String str = JOptionPane.showInputDialog("O que deseja salvar?");
		
		String caminho = "c:/arquivos/stream.meuarquivo";
		
//		manipulador.escreveArquivo(str, caminho);
		
		String conteudo = manipulador.lerArquivo(caminho);
		
		JOptionPane.showMessageDialog(null, conteudo);
		
	}

}
