package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoaComparableExample implements Comparable<PessoaComparableExample> {

	private String nome;
	private int idade;

	public PessoaComparableExample(String nome, int idade) {
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
	public int compareTo(PessoaComparableExample pessoaComparada) {
		// Comparando por idade
		return Integer.compare(this.idade, pessoaComparada.idade);
	}

	@Override
	public String toString() {
		return String.format("%s - %s", idade, nome);
	}

	public static void main(String[] args) {
		List<PessoaComparableExample> pessoas = new ArrayList<>();
		
		pessoas.add(new PessoaComparableExample("Benedito", 24));
		pessoas.add(new PessoaComparableExample("Letícia", 19));
		pessoas.add(new PessoaComparableExample("Graça", 45));
		pessoas.add(new PessoaComparableExample("Mônia", 25));
		
		Collections.sort(pessoas);

		pessoas.stream().forEach(System.out::println);
	}

}
