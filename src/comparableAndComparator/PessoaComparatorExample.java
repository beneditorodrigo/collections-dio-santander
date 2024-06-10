package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PessoaComparatorExample {

	private String nome;
	private int idade;

	public PessoaComparatorExample(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s - Idade: %s", nome, idade);
	}

	public static void main(String[] args) {
		List<PessoaComparatorExample> pessoas = new ArrayList<>();

		pessoas.add(new PessoaComparatorExample("Benedito", 24));
		pessoas.add(new PessoaComparatorExample("Letícia", 19));
		pessoas.add(new PessoaComparatorExample("Graça", 45));
		pessoas.add(new PessoaComparatorExample("Mônia", 25));

		// Comparador por nome da Pessoa
		Comparator<PessoaComparatorExample> comparadorPorNome = new Comparator<PessoaComparatorExample>() {

			@Override
			public int compare(PessoaComparatorExample pessoa01, PessoaComparatorExample pessoa02) {
				return pessoa01.getNome().compareTo(pessoa02.getNome());
			}
		};

		// Comparador por idade da Pessoa
		Comparator<PessoaComparatorExample> comparadorPorIdade = new Comparator<PessoaComparatorExample>() {

			@Override
			public int compare(PessoaComparatorExample pessoa01, PessoaComparatorExample pessoa02) {
				return Integer.compare(pessoa01.getIdade(), pessoa02.getIdade());
			}
		};

		// Ordenando por nome
		System.out.println("=== ORDENADO POR NOME ===");
		Collections.sort(pessoas, comparadorPorNome);
		pessoas.stream().forEach(System.out::println);

		// Ordenando por idade
		System.out.println("=== ORDENADO POR IDADE ===");
		Collections.sort(pessoas, comparadorPorIdade);
		pessoas.stream().forEach(System.out::println);
	}
}
