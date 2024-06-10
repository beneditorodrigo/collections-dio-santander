package map.pesquisa;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutos;

	public EstoqueProdutos() {
		this.estoqueProdutos = new HashMap<>();
	}

	public void adicionarProduto(Long codigo, String nome, double preco, int quantidade) {
		estoqueProdutos.put(codigo, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	
	public double calcularValorTotalEstoque() {
		if(estoqueProdutos.isEmpty()) {
			return 0d;
		}
		return estoqueProdutos.values()
				.stream()
				.mapToDouble(produto -> produto.getPreco() * produto.getQuantidade())
				.sum();
	}
	
	public Optional<Produto> obterProdutoMaisCaro(){
		return estoqueProdutos.values()
				.stream()
				.max(Comparator.comparingDouble(Produto::getPreco));
	}
	
	public Optional<Produto> obterProdutoMaisBarato(){
		return estoqueProdutos.values()
				.stream()
				.min(Comparator.comparingDouble(Produto::getPreco));
	}
	
	public Optional<Produto> obterProdutoMaiorPatrimonio(){
		return estoqueProdutos.values()
				.stream()
				.max(Comparator.comparingDouble(produto -> produto.getPreco() * produto.getQuantidade()));
	}

	public Map<Long, Produto> getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(Map<Long, Produto> estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}
}
