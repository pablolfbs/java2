
public class Mago {

	// Tipo 'primitivo'.
	private String nome;
	// Tipo primitivo.
	private int poder;
	// Percebe que eu coloquei um array de feiti�os ao inv�s de um tipo
	// primitivo? � assim que eu coloco um OBJETO dentro de OUTRO OBJETO.
	private Feitico[] feiticos;

	// Construtor
	public Mago(String nome, int poder, int numFeiticos) {
		this.nome = nome;
		this.poder = poder;
		// Definindo quantos feiti�o esse mago pode ter.
		this.feiticos = new Feitico[numFeiticos];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	// Nesse nosso caso n�o vale a pena eu ter um get feiti�os que devolve um
	// array de feiti�os. � melhor eu ter um m�todo que devolve todos os meu
	// feiti�os em uma string.
	public String getFeiticos() {
		// Criando a String vazia.
		String feiticos = "";
		// 'For' para rodar o array de feiticos
		for (int i = 0; i < this.feiticos.length; i++) {
			// Verifico se a posi��o do array n�o � null. Sen�o ele joga uma
			// NullPointerException.
			if (this.feiticos[i] != null) {
				// Estou formatando esses feiti�os para mostrar na tela. Aquie
				// eu
				// estou acessando os m�todos que eu tenho na minha outra
				// classe, a
				// classe de feiti�os.
				feiticos += this.feiticos[i].getNome() + " -> " + this.feiticos[i].getEficiencia() + "\n";
			}
		}
		// Aqui eu fa�o um if tern�rio. Talvez a parte mais complexa do c�digo,
		// mas � bom a gente usar esse tipo de c�digo.
		return (feiticos != "") ? feiticos : "Voc� n�o � t�o fod�o assim...";
	}

	// Nesse caso eu n�o tenho setFeitico, nesse porgrama faz mais sentido eu
	// ter o m�todo addFeitico.
	public void addFeitico(Feitico novoFeitico) {
		// In�ciando o for para rodar todo o array.
		for (int i = 0; i < this.feiticos.length; i++) {
			// Vericando se a posi��o est� livre para que eu possa alocar o novo
			// feiti�o.
			if (this.feiticos[i] == null) {
				// Se estiver vazio ele guarda esse novo feiti�o.
				this.feiticos[i] = novoFeitico;
				// Se ele j� alocou o feiti�o no lugar que eu deve ficar, eu
				// saio do m�todo com esse return.
				return;
			}
		}
		// Se ele chegou at� aqui, significa que ele rodou o array todo e n�o
		// encontrou uma posi��o livre.
		System.out.println("Voc� j� atingiu o n�mero m�ximo de feiti�os.");
	}

}
