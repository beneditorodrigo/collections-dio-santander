package list.ordenacao;

public class TesteOrdenacao {
	public static void main(String[] args) {
		OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
		
		System.out.println(pessoas.getPessoas().isEmpty());
		
		pessoas.adicionarPessoa("José", 25, 1.73);
		pessoas.adicionarPessoa("Maria", 15, 1.25);
		pessoas.adicionarPessoa("Rafael", 50, 1.82);
		pessoas.adicionarPessoa("Raisa", 12, 1.38);
		pessoas.adicionarPessoa("Rebeca", 51, 1.67);
		
		System.out.println("=== PESSOAS ORDENADAS POR IDADE ===");
		System.out.println(pessoas.ordenarPorIdade());
		System.out.println("=== PESSOAS ORDENADAS POR ALTURA ===");
		System.out.println(pessoas.ordenarPorAltura());
	}
}
