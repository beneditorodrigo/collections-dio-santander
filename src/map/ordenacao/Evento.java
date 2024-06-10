package map.ordenacao;

public class Evento {

	private String nome;

	// aqui poderia ser uma coleção de atrações, mas
	// uso String porque o objetivo é testar ordenação no Map
	private String atracao;

	public Evento(String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtracao() {
		return atracao;
	}

	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
	}
}
