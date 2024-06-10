package map.ordenacao;

import java.time.LocalDate;

public class TestarOrdenacao {
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();

		System.out.println(agendaEventos.getAgendaEventos().isEmpty());
		
		
		agendaEventos.adicionarEvento(LocalDate.of(2025, 01, 01), "Ano Novo", "Esperança");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 06, 9), "Hoje", "Teste");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 25), "Natal", "Jesus");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 31), "Réveillon", "Dio");
		
		agendaEventos.voidExibirAgenda();
		
		System.out.println(agendaEventos.obterproximoEvento());
	}
}
