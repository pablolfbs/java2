package controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Cliente;
import model.ManipulaArquivo;

public class Principal {
	
	static final Logger logger = LogManager.getLogger(Principal.class.getName());
	
	public static void main(String[] args) {
		
		logger.info("Iniciando a aplicação");
		
		String caminho = "c:/users/pablo/log/teste.obj";
		
		/*
		Cliente cliente = new Cliente();
		
		cliente.setNome("Pablo");
		cliente.setCpf("000.111.222-34");
		cliente.setEmail("pablo@pablo.com");
		cliente.setId(10);
		
		ManipulaArquivo.serializa(cliente, caminho);
		 */
		
		logger.trace("Chamando o método deserializa");
		
		Cliente recuperado = (Cliente) ManipulaArquivo.deserializa(caminho);
		System.out.println(recuperado.getNome() + " | " + recuperado.getEmail());
		
	}

}
