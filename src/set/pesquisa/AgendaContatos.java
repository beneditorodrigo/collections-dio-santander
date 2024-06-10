package set.pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

	private Set<Contato> contatos;

	public AgendaContatos() {
		this.contatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		return (Set<Contato>) contatos
				.stream()
				.filter(c -> c.getNome().startsWith(nome))
				.collect(Collectors.toSet());
	}
	
	public Contato atualizarNumeroContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for (Contato contato : contatos) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(numero);
				contatoAtualizado = contato;
				break;
			}
		}
		
		return contatoAtualizado;
	}

	public Set<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(Set<Contato> contatos) {
		this.contatos = contatos;
	}
}
