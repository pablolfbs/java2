package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipulaArquivo {

	public static void serializa(Object obj, String caminho) {

		ObjectOutputStream saida;

		try {
			saida = new ObjectOutputStream(new FileOutputStream(caminho));

			saida.writeObject(obj);
			saida.flush();
			saida.close();

		} catch (FileNotFoundException e) {
			System.out.println("ARQUIVO OU DIRETÓRIO NÃO ENCONTRADO.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("PROBLEMAS AO MANIPULAR ARQUIVO.");
			e.printStackTrace();
		}

	}

	public static Object deserializa(String caminho) {

		Object obj = null;

		try {
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(caminho));
			obj = entrada.readObject();
			entrada.close();

		} catch (FileNotFoundException e) {
			System.out.println("ARQUIVO OU DIRETÓRIO NÃO ENCONTRADO.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("PROBLEMAS AO MANIPULAR ARQUIVO.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("IMPOSSÍVEL DESERIALIZAR OBJETO.");
			e.printStackTrace();
		}

		return obj;

	}

}
