
public class Mago {

	// Tipo 'primitivo'.
	private String nome;
	// Tipo primitivo.
	private int poder;
	// Percebe que eu coloquei um array de feitiços ao invés de um tipo
	// primitivo? É assim que eu coloco um OBJETO dentro de OUTRO OBJETO.
	private Feitico[] feiticos;

	// Construtor
	public Mago(String nome, int poder, int numFeiticos) {
		this.nome = nome;
		this.poder = poder;
		// Definindo quantos feitiço esse mago pode ter.
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

	// Nesse nosso caso não vale a pena eu ter um get feitiços que devolve um
	// array de feitiços. É melhor eu ter um método que devolve todos os meu
	// feitiços em uma string.
	public String getFeiticos() {
		// Criando a String vazia.
		String feiticos = "";
		// 'For' para rodar o array de feiticos
		for (int i = 0; i < this.feiticos.length; i++) {
			// Verifico se a posição do array não é null. Senão ele joga uma
			// NullPointerException.
			if (this.feiticos[i] != null) {
				// Estou formatando esses feitiços para mostrar na tela. Aquie
				// eu
				// estou acessando os métodos que eu tenho na minha outra
				// classe, a
				// classe de feitiços.
				feiticos += this.feiticos[i].getNome() + " -> " + this.feiticos[i].getEficiencia() + "\n";
			}
		}
		// Aqui eu faço um if ternário. Talvez a parte mais complexa do código,
		// mas é bom a gente usar esse tipo de código.
		return (feiticos != "") ? feiticos : "Você não é tão fodão assim...";
	}

	// Nesse caso eu não tenho setFeitico, nesse porgrama faz mais sentido eu
	// ter o método addFeitico.
	public void addFeitico(Feitico novoFeitico) {
		// Iníciando o for para rodar todo o array.
		for (int i = 0; i < this.feiticos.length; i++) {
			// Vericando se a posição está livre para que eu possa alocar o novo
			// feitiço.
			if (this.feiticos[i] == null) {
				// Se estiver vazio ele guarda esse novo feitiço.
				this.feiticos[i] = novoFeitico;
				// Se ele já alocou o feitiço no lugar que eu deve ficar, eu
				// saio do método com esse return.
				return;
			}
		}
		// Se ele chegou até aqui, significa que ele rodou o array todo e não
		// encontrou uma posição livre.
		System.out.println("Você já atingiu o número máximo de feitiços.");
	}

}
