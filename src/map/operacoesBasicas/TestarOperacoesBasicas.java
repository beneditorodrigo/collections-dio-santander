package map.operacoesBasicas;

public class TestarOperacoesBasicas {
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		System.out.println(agendaContatos.getAgendaContatos().isEmpty());

		agendaContatos.adicionarContato("Dio", 5545);
		agendaContatos.adicionarContato("Java", 8822);
		agendaContatos.adicionarContato("Java", 5500);
		agendaContatos.adicionarContato("Collections", 2212);

		agendaContatos.exibirContatos();

		System.out.println(agendaContatos.pesquisarPorNome("Java"));

		agendaContatos.removerContato("Java");

		agendaContatos.exibirContatos();

		System.out.println(agendaContatos.pesquisarPorNome("Java"));

	}
}
