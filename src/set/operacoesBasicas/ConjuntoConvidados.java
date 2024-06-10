package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ConjuntoConvidados {

	Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {

		Optional<Convidado> convidadoRemover = convidados
		.stream()
		.filter(c -> c.getCodigoConvite() == codigoConvite)
		.findFirst();
		
		boolean removeu = false;
		
		if (!convidadoRemover.isEmpty() && convidadoRemover.get() != null) {
			removeu = convidados.remove(convidadoRemover.get());
		}

		if (removeu) {
			System.out.println(
					String.format("Convidado de código de convite %s removido com sucesso",
					convidadoRemover.get().getCodigoConvite()));
		} else {
			System.err.println(
					String.format("Convidado de código de convite %s não encontrado",
					codigoConvite));
		}
	}

	public int contarConvidados() {
		return convidados.size();
	}

	public void exibirConvidados() {
		System.out.println(convidados);
	}

	public Set<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(Set<Convidado> convidados) {
		this.convidados = convidados;
	}
}
