package list.pesquisa;

public class TestePesquisa {
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		System.out.println(catalogoLivros.getLivros().isEmpty());
		
		catalogoLivros.adicionarLivro("Java Iniciante", "Benedito", 2018);
		catalogoLivros.adicionarLivro("Java Intermediário", "Benedito", 2019);
		catalogoLivros.adicionarLivro("Java Avançado", "Benedito", 2021);
		catalogoLivros.adicionarLivro("Dio Santander", "Dio", 2024);
		catalogoLivros.adicionarLivro("Santander Coders", "Santander", 2023);
		
		System.out.println(catalogoLivros.pesquisarPorTitulo("Java Avançado").get().toString());
		System.out.println(catalogoLivros.pesquisarPorAutor("Benedito"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 2024));
	}
}
