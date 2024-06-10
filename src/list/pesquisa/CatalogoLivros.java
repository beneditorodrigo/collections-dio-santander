package list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {

	private List<Livro> livros;

	public CatalogoLivros() {
		this.livros = new ArrayList<>();
	}

	/**
	 * Adiciona um novo {@link Livro} a lista {@code livros}.
	 *
	 * @param titulo
	 *   Título do livro.
	 * @param autor
	 *   Autor do livro.
	 * @param anoPublicacao
	 *   Ano de publicação do livro.
	 */
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}

	/**
	 * Retorna uma lista de {@link Livro} para o autor informado.
	 *
	 * @param autor
	 *   Autor do livro.
	 *
	 * @return
	 *   A lista de livros.
	 */
	public List<Livro> pesquisarPorAutor(String autor) {
		return livros
				.stream()
				.filter(t -> t.getAutor().equalsIgnoreCase(autor))
				.toList();
	}

	/**
	 * Retorna uma lista de {@link Livro} para o título informado.
	 *
	 * @param titulo
	 *   Título do livro.
	 *
	 * @return
	 *   A lista de livros.
	 */
	public Optional<Livro> pesquisarPorTitulo(String titulo) {
		return livros
				.stream()
				.filter(t -> t.getTitulo().equalsIgnoreCase(titulo))
				.findFirst();
	}

	/**
	 * Retorna uma lista de {@link Livro} para o intervalo de anos informado.
	 *
	 * @param anoInicial
	 *   Ano inicial de publicação do livro.
	 * @param anoFinal
	 *   Ano final de publicação do livro.
	 *
	 * @return
	 *   A lista de livros.
	 */
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		return livros
				.stream()
				.filter(t -> t.getAnoPublicacao() >= anoInicial && t.getAnoPublicacao() <= anoFinal)
				.toList();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
