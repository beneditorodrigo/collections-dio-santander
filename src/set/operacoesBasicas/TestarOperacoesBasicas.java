package set.operacoesBasicas;

public class TestarOperacoesBasicas {
	public static void main(String[] args) throws Exception {
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		
		System.out.println(convidados.getConvidados().isEmpty());
		
		convidados.adicionarConvidado("Dio", 1299);
		convidados.adicionarConvidado("Santander", 1159);
		// não deve ser incluído esse próximo registro por causa
		// do hashCode and equals implementados em Convidado.
		convidados.adicionarConvidado("Bootcamp", 1299);
		convidados.adicionarConvidado("Java", 2552);
		convidados.adicionarConvidado("IA", 2112);
		
		System.out.println("Número de convidados: " + convidados.contarConvidados());
		convidados.exibirConvidados();
		
		// vamos remover um registro
		convidados.removerConvidadoPorCodigoConvite(2112);
		
		System.out.println("Número de convidados: " + convidados.contarConvidados());
		convidados.exibirConvidados();
	}
}
