package set.ordenacao;

public class TestarOrdenacao {
	public static void main(String[] args) {
		CadastroProdutos produtos = new CadastroProdutos();
		
		System.out.println(produtos.getProdutos().isEmpty());
		
		produtos.adicionarProduto(5225, "Teclado", 19.90, 15);
		produtos.adicionarProduto(2552, "Mouse", 10.90, 10);
		produtos.adicionarProduto(3358, "Monitor", 890.90, 5);
		produtos.adicionarProduto(5225, "Headset", 90.15, 20);
		produtos.adicionarProduto(9856, "Adaptador USB", 29.90, 12);
		
		System.out.println(produtos.exibirProdutoPorNome());
		System.out.println(produtos.exibirProdutoPorPreco());
	}
}
