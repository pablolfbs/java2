package threads;

public class Contador extends Thread {
	
	private String nome;
	
	public Contador(String nome) {
		this.nome = nome;
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(nome + " - " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
