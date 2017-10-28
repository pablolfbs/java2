import javax.swing.JFrame;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		ContatoFrame contatoFrame = new ContatoFrame();
		
		contatoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contatoFrame.setSize(300, 250);
		contatoFrame.setLocationRelativeTo(null);
		contatoFrame.setVisible(true);
		
	}

}
