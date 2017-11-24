package exemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ManipulaArquivo {

	public void escreveArquivo(String str, String caminho) {

		FileWriter file;
		try {
			file = new FileWriter(caminho, true);
			BufferedWriter saida = new BufferedWriter(file);

			saida.append(str);
			saida.flush();
			saida.close();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static synchronized String lerArquivo(File arq) {
		String conteudo = "";

		try {
			BufferedReader leitor = new BufferedReader(new FileReader(arq));

			String linha = "";

			while (true) {
				if (linha != null) {
					conteudo += linha;
				} else {
					break;
				}
				linha = leitor.readLine();
			}
			leitor.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo ou diretório não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conteudo;
	}
	
}
