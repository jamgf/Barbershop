package ControllerHelper;

import Model.Usuario;
import view.Login;

public class LoginHelper implements IHelper{
	
	private final Login view1;
	
	public LoginHelper(Login view1) {
		super();
		this.view1 = view1;
	}

	public Usuario obterModelo() {
		String nome = view1.getUserName().getText();
		String senha = view1.getPasswordField().getText();
		
		Usuario modelo = new Usuario(1, nome, 'M', "09/05/1996", senha, "barbeiro@barbershop.com", "521454123", "barbeiro", "administrador");
		return modelo;
	}
	
	public void setarModelo(Usuario modelo) {
		
		String nome = modelo.getNome();
		String senha = modelo.getSenha();
		view1.getUserName().setText(nome);
		view1.getPasswordField().setText(senha);
	}
	
	public void limparTela() {
		
		view1.getUserName().setText("");
		view1.getPasswordField().setText("");
	}
}
