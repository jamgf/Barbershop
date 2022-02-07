package ControllerHelper;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import view.Agenda;
import view.Login;

public class AgendaHelper implements IHelper{
	
private final Agenda view;
	
	public AgendaHelper(Agenda view) {
		this.view = view;
	}

	public void preencherTabela(ArrayList<Agendamento> agendamentos) {
		DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
		tableModel.setNumRows(0);
		
		for (Agendamento agendamento : agendamentos) {
			tableModel.addRow(new Object[]{
			agendamento.getId(),
			agendamento.getCliente(),
			agendamento.getServico(),
			agendamento.getValor(),
			agendamento.getData(),
			agendamento.getObservacao(),
			});
			
		}
		
	}

	public void preencherClientes(ArrayList<Cliente> clientes) {
		
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
		for (Cliente cliente : clientes) {
			comboBoxModel.addElement(cliente);
		}
	}

	public void preencherServicos(ArrayList<Servico> servicos) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
		
		for (Servico servico:servicos) {
			comboBoxModel.addElement(servico);
		}
		
	}
	public Cliente obterCliente() {
		return (Cliente) view.getjComboBoxCliente().getSelectedItem();
		
	}
	public Servico obterServico() {
		return (Servico) view.getjComboBoxServico().getSelectedItem();
		
	}

	public void setarValor(float valor) {
		view.getTextField_1().setText(valor+"");
		
	}

	@Override
	public Agendamento obterModelo() {
		String idString = view.getTextField().getText();
		int id = Integer.parseInt(idString);
		Cliente cliente = obterCliente();
		Servico servico = obterServico();
		String valorString = view.getTextField_1().getText();
		float valor = Float.parseFloat(valorString);
		String data = view.getTextField_3().getText();
		String observacao = view.getTextArea().getText();
		
		Agendamento agendamento = new Agendamento(id, cliente, servico, valor, data, observacao);
		
		return agendamento;
	}

	@Override
	public void limparTela() {
		view.getTextField().setText("0");
		view.getTextField_1().setText("");
		view.getTextArea().setText("");
		view.getTextField_2().setText("");
		view.getTextField_3().setText("");
		
	}

}
