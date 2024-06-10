package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AgendaContatos {

	private Map<String, Integer> agendaContatos;

	public AgendaContatos() {
		this.agendaContatos = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatos.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatos.isEmpty()) {
			agendaContatos.remove(nome);
		}
	}

	public void exibirContatos() {
		System.out.println(agendaContatos);
	}

	public Optional<Integer> pesquisarPorNome(String nome) {
		return Optional.ofNullable(agendaContatos.get(nome));
	}

	public Map<String, Integer> getAgendaContatos() {
		return agendaContatos;
	}

	public void setAgendaContatos(Map<String, Integer> agendaContatos) {
		this.agendaContatos = agendaContatos;
	}
}
