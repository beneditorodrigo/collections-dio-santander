package set.pesquisa;

public class TestarPesquisa {
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		
		System.out.println(contatos.getContatos().isEmpty());
		
		contatos.adicionarContato("Benedito", 34225512);
		contatos.adicionarContato("Benedito Rodrigo", 35655522);
		contatos.adicionarContato("Benedito", 12253552);
		contatos.adicionarContato("Java", 45585265);
		
		contatos.exibirContatos();
		
		System.out.println(contatos.pesquisarPorNome("Benedito"));
		
		contatos.atualizarNumeroContato("Benedito Rodrigo", 55558888);
		
		System.out.println(contatos.pesquisarPorNome("Benedito Rodrigo"));
		
		contatos.exibirContatos();
	}
}
