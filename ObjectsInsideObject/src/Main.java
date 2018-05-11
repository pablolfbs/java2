
public class Main {

	public static void main(String[] args) {
		
		// Criando o mago
		Mago magoFodao = new Mago("Pablo", 8, 5);
		
		// Imprimindo os feitiços
		System.out.println(magoFodao.getFeiticos());
		
		// Criando um novo feitiço
		Feitico bolaDeFogo = new Feitico("Bola de Fogo", 4);
		
		// Adicionando o feitico ao mago.
		magoFodao.addFeitico(bolaDeFogo);
		
		// Imprimindo os feitiços
		System.out.println(magoFodao.getFeiticos());
		
		// Adicionando mais um feitico ao mago.
		magoFodao.addFeitico(new Feitico("Missel Arcano", 2));
		
		// Imprimindo os feitiços
		System.out.println(magoFodao.getFeiticos());
		
	}

}
