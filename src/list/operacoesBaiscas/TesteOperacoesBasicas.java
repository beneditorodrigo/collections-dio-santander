package list.operacoesBaiscas;

public class TesteOperacoesBasicas {
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println(listaTarefa.getTarefas().isEmpty());
		
		listaTarefa.adicionarTarefa("Criar Entidades");
		listaTarefa.adicionarTarefa("Criar Atributos");
		listaTarefa.adicionarTarefa("Criar Métodos");
		listaTarefa.adicionarTarefa("Criar Validações");
		listaTarefa.adicionarTarefa("Criar Entidades");
		
		System.out.println(listaTarefa.obterDescricoesTarefas());
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefas("Criar entidades");
		
		System.out.println(listaTarefa.obterDescricoesTarefas());
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
	}
}
