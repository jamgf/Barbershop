package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tableAgendamentos;
	private Object controller;
	private JComboBox<String> jComboBoxCliente;
	private JComboBox<String> jComboBoxServico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
					//iniciar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	/*public void iniciar() {
		this.controller.atualizaTabela();
		this.controller.atualizaCliente();
		this.controller.atualizaServico();
		this.controller.atualizaValor();
		this.controller.atualizaValor();
	} */
	public Agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1157, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		tableAgendamentos = new JTable();
		tableAgendamentos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Id", "Cliente", "Servi\u00E7o", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableAgendamentos.getColumnModel().getColumn(0).setResizable(false);
		
		JButton btnNewButton = new JButton("Agendar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.agendar();
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 41));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(439, 361, 300, 55);
		contentPane.add(btnNewButton);
		tableAgendamentos.setBounds(115, 448, 964, 85);
		contentPane.add(tableAgendamentos);
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("Hor\u00E1rio:");
		lblNewLabel_2_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_5_1_1.setBounds(642, 296, 60, 35);
		contentPane.add(lblNewLabel_2_5_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(714, 298, 247, 35);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Data:");
		lblNewLabel_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_5_1.setBounds(48, 301, 60, 24);
		contentPane.add(lblNewLabel_2_5_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 298, 247, 35);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(712, 78, 367, 191);
		contentPane.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 242, 247, 35);
		contentPane.add(textField_1);
		
		JComboBox<String> jComboBoxCliente = new JComboBox<String>();
		jComboBoxCliente.setBounds(115, 129, 247, 35);
		contentPane.add(jComboBoxCliente);
		
		JComboBox<String> jComboBoxServico = new JComboBox<String>();
		jComboBoxServico.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			controller.atualizaValor();
			}
		});
		jComboBoxServico.setBounds(115, 184, 247, 35);
		contentPane.add(jComboBoxServico);
		
		JLabel lblNewLabel_2_5 = new JLabel("Valor:");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(48, 245, 60, 24);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_4 = new JLabel("Servi\u00E7o:");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(48, 187, 60, 24);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_3 = new JLabel("Cliente:");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(48, 132, 60, 24);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Observa\u00E7\u00E3o:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(610, 76, 92, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(48, 76, 60, 24);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(115, 73, 247, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Agenda.class.getResource("/view/images/Agenda-PainelFundo.png")));
		lblNewLabel_1.setBounds(28, 32, 1091, 526);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Agenda.class.getResource("/view/images/AgendaFundo.png")));
		lblNewLabel.setBounds(5, 5, 1151, 576);
		contentPane.add(lblNewLabel);
	}

	public JTable getTableAgendamentos() {
		return tableAgendamentos;
	}

public JComboBox<String> getjComboBoxCliente() {
		
		return jComboBoxCliente;
	}

	public JComboBox<String> getjComboBoxServico() {
		
		return jComboBoxServico;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextArea getTextArea() {
		return JTextArea;
	}
}
