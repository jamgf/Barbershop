package Servico;
import java.util.Date;

import Model.Agendamento;

public class Correio {
	public void NotificarPorEmail(Agendamento agendamento) {
		String emailFormatado = formatarEmail(agendamento);
		String destinatario = agendamento.getCliente().getEmail();
		
		Email email = new Email("Agendamento Barbershop", emailFormatado, destinatario);
		email.enviar();
		
	}

	private String formatarEmail(Agendamento agendamento) {
		String nomeCliente = agendamento.getCliente().getNome();
		String servico = agendamento.getServico().getDescricao();
		Date dataAgendamento = agendamento.getData();
		float valor = agendamento.getValor();
		return "Olá, "+ nomeCliente + "! Seu agendamento para "+servico + " ficou marcado para "+ dataAgendamento"."
				+ "O valor total é " + valor;
	}
}
