package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> pessoas;

	public OrdenacaoPessoa() {
		this.pessoas = new ArrayList<>();
	}

	/**
	 * Adiciona uma nova {@link Pessoa} a lista de {@code pessoas}.
	 *
	 * @param nome
	 *   Nome da pessoa.
	 * @param idade
	 *   Idade de pessoa.
	 * @param altura
	 *   Altura da pessoa.
	 */
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}

	/**
	 * Retorna lista de pessoas ordenada pelas idades.
	 *
	 * @return
	 *   A lista de pessoas.
	 */
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoas);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}

	/**
	 * Retorna a lista de pessoas ordenada pelas alturas.
	 *
	 * @return
	 *   A lista de pessoas.
	 */
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoas);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}

class ComparatorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}

}
