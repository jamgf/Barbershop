package view;

import Controller.LoginController;
import ModelDAO.Banco;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField passwordField;
	private LoginController controller;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		controller = new LoginController(this);
		Banco.inicia();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 915);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(241, 485, 338, 37);
		contentPane.add(passwordField);
		
		userName = new JTextField();
		userName.setBounds(241, 336, 338, 37);
		contentPane.add(userName);
		userName.setColumns(10);
		
		JLabel titlePassword = new JLabel("Senha");
		titlePassword.setHorizontalAlignment(SwingConstants.CENTER);
		titlePassword.setForeground(Color.WHITE);
		titlePassword.setFont(new Font("Tahoma", Font.PLAIN, 35));
		titlePassword.setBackground(Color.WHITE);
		titlePassword.setBounds(301, 428, 214, 49);
		contentPane.add(titlePassword);
		
		JLabel titleUser = new JLabel("Usu\u00E1rio");
		titleUser.setHorizontalAlignment(SwingConstants.CENTER);
		titleUser.setForeground(Color.WHITE);
		titleUser.setFont(new Font("Tahoma", Font.PLAIN, 35));
		titleUser.setBackground(Color.WHITE);
		titleUser.setBounds(301, 276, 214, 49);
		contentPane.add(titleUser);
		
		JLabel mainTitle = new JLabel("LOGIN");
		mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		mainTitle.setBackground(Color.WHITE);
		mainTitle.setForeground(Color.WHITE);
		mainTitle.setFont(new Font("Tahoma", Font.BOLD, 40));
		mainTitle.setBounds(301, 190, 214, 49);
		contentPane.add(mainTitle);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.entrarNoSistema();
				System.out.println(userName.getText());
				System.out.println(passwordField.getPassword());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(241, 569, 340, 66);
		contentPane.add(btnNewButton);
		
		JLabel blackSquare = new JLabel("");
		blackSquare.setIcon(new ImageIcon(Login.class.getResource("/view/images/painel-login.png")));
		blackSquare.setBounds(112, -94, 570, 1013);
		blackSquare.setBackground(Color.WHITE);
		contentPane.add(blackSquare);
		
		JLabel backgroundImage = new JLabel("");
		backgroundImage.setBounds(0, -70, 796, 1013);
		backgroundImage.setIcon(new ImageIcon(Login.class.getResource("/view/images/Logo.jpg")));
		contentPane.add(backgroundImage);
	}
	
	

	public void exibeMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

	public JTextField getUserName() {
		return userName;
	}

	public void setUserName(JTextField userName) {
		this.userName = userName;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
}
