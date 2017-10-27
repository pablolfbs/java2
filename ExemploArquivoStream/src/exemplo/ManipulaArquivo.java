package exemplo;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ManipulaArquivo {
	
	public void escreveArquivo(String str, String caminho) {
		
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream(caminho));
			byte[] bytes = str.getBytes();
			
			output.write(bytes);
			output.flush();
			output.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo ou diretório não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Impossível escrever no arquivo");
			e.printStackTrace();
		}
		
	}
	
	public String lerArquivo (String caminho) {
		String str = "";
		
		try {
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(caminho));
			
			int entrada = input.read();
			
			while (entrada != -1) {
				System.out.println(entrada);
				str += (char) entrada;
				
				entrada = input.read();
			}
			
			input.close();			
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo ou diretório não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Impossível escrever no arquivo");
			e.printStackTrace();
		}
		return str;
		
	}

}
