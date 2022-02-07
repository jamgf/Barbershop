package Controller;

import java.util.ArrayList;

import ControllerHelper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import ModelDAO.AgendamentoDAO;
import ModelDAO.ClienteDAO;
import ModelDAO.ServicoDAO;
import Servico.Correio;
import view.Agenda;

public class AgendaController {
	
	private Agenda view;
	private AgendaHelper helper;


	public AgendaController(Agenda view) {
		this.view = view;
		this.helper = new AgendaHelper(view);
	}

	
	public void atualizaTabela() {
		
		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
		
		helper.preencherTabela(agendamentos);
	}
	
	public void atualizaCliente() {
		ClienteDAO clienteDAO = new ClienteDAO();
		ArrayList<Cliente> clientes = clienteDAO.selectAll();
		
		helper.preencherClientes(clientes);
	}
	
	public void atualizaServico() {
		ServicoDAO servicoDAO = new ServicoDAO();
		ArrayList<Servico> servicos = servicoDAO.selectAll();
		
		helper.preencherServicos(servicos);
	}
	
	public void atualizaValor() {
		Servico servico = helper.obterServico();
		helper.setarValor(servico.getValor());
	}
	
	public void agendar() {
		Agendamento agendamento = helper.obterModelo();
		new AgendamentoDAO().insert(agendamento);
		atualizaTabela();
		Correio correio = new Correio();
		correio.NotificarPorEmail(agendamento);
		helper.limparTela();
		
		
	}
}
