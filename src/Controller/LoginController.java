package Controller;
import Model.Usuario;
import ModelDAO.UsuarioDAO;
import view.Login;
import view.MenuPrincipal;
import ControllerHelper.LoginHelper;

public class LoginController {
	
	private final Login view1;
	private LoginHelper helper;
	
	public LoginController(Login view1) {
		this.view1 = view1;
		this.helper = new LoginHelper(view1);
	}

	public void entrarNoSistema() {
		
		Usuario usuario = helper.obterModelo();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
		
		
		if(usuarioAutenticado != null) {
			MenuPrincipal menu = new MenuPrincipal();
			menu.setVisible(true);
			this.view1.dispose();
		} else {
			view1.exibeMensagem("Usuário ou senha inválidos");
		}
		
	}
	
	public void fizTarefa(){
		
		System.out.println("Fui no DB");
		this.view1.exibeMensagem("Fiz a tarefa");
	}
}
