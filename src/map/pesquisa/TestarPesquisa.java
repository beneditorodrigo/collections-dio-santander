package map.pesquisa;

public class TestarPesquisa {
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

		System.out.println(estoqueProdutos.getEstoqueProdutos().isEmpty());

		estoqueProdutos.adicionarProduto(1l, "Mouse", 56.50, 4);
		estoqueProdutos.adicionarProduto(2l, "PC", 2500.75, 2);
		estoqueProdutos.adicionarProduto(3l, "Headset", 220.05, 5);
		estoqueProdutos.adicionarProduto(4l, "Teclado", 120.75, 2);
		estoqueProdutos.adicionarProduto(5l, "Monitor", 1250.80, 5);

		estoqueProdutos.exibirProdutos();

		System.out.printf("Valor do Estoque: R$ %.2f\n", estoqueProdutos.calcularValorTotalEstoque());
		
		System.out.println(estoqueProdutos.obterProdutoMaisCaro());
		System.out.println(estoqueProdutos.obterProdutoMaisBarato());
		System.out.println(estoqueProdutos.obterProdutoMaiorPatrimonio());
	}
}
