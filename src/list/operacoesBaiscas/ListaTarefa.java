package list.operacoesBaiscas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefa {

	private List<Tarefa> tarefas;

	public ListaTarefa() {
		this.tarefas = new ArrayList<Tarefa>();
	}
	
	/**
	 * Adiciona uma nova {@link Tarefa} na lista {@code tarefas}.
	 *
	 * @param descricao
	 *   Descrição da tarefa.
	 */
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	
	/**
	 * Remove as tarefas que contêm a descrição informada.
	 *
	 * @param descricao
	 *   Descrição das tarefas que devem ser removidas.
	 */
	public void removerTarefas(String descricao) {
		tarefas.removeAll(tarefas
				.stream()
				.filter(e -> e.getDescricao().equalsIgnoreCase(descricao))
				.toList());
	}
	
	/**
	 * Retorna o número de tarefas presente em {@code tarefas};
	 *
	 * @return
	 *   O número de tarefas.
	 */
	public int obterNumeroTotalTarefas() {
		return tarefas.size();
	}
	
	/**
	 * Retorna a lista de todas as descrições das tarefas presentes em {@code tarefas}.
	 *
	 * @return
	 *   A lista de descrições.
	 */
	public String obterDescricoesTarefas() {
		return tarefas
				.stream()
				.map(Tarefa::getDescricao)
				.collect(Collectors.joining(", "));
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}
