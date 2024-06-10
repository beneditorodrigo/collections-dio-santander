package set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtos.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutoPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtos);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutoPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtos);
		return produtosPorPreco;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}
}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}
