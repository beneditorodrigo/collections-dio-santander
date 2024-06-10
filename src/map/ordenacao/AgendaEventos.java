package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> agendaEventos;

	public AgendaEventos() {
		this.agendaEventos = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		agendaEventos.put(data, new Evento(nome, atracao));
	}

	public void voidExibirAgenda() {
		Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaEventos);
		System.out.println(eventosOrdenados);
	}

	public Optional<Evento> obterproximoEvento(){
		LocalDate hoje = LocalDate.now();
		
		return agendaEventos.entrySet()
				.stream()
				.filter(entry -> !entry.getKey().isBefore(hoje))
				.min(Map.Entry.comparingByKey())
				.map(Map.Entry::getValue);
	}

	public Map<LocalDate, Evento> getAgendaEventos() {
		return agendaEventos;
	}

	public void setAgendaEventos(Map<LocalDate, Evento> agendaEventos) {
		this.agendaEventos = agendaEventos;
	}
}
