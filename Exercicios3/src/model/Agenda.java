package model;

public class Agenda {

	private Contato[] contatos;

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public Contato[] adiciona(Contato contato) {
		for (int i = 0; i < 3; i++) {
			if (contatos != null) {
				contato = new Contato();
				contatos[i] = contato;
			}
		}
		return contatos;
	}
	
	public String obterInfo() {
		String info = "";
		if (contatos != null) {
			for (Contato c : contatos) {
				info = c.obterInfo();
			}
		}
		return info;
	}

	public void busca(Contato[] contatos) {
		
	}

}
