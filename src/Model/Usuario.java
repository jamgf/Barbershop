package Model;



public class Usuario extends Pessoa{
	
	private String nivelAcesso;
	private String senha;
	
	public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String nivelAcesso, String senha) {
		super(id, nome);
		this.nivelAcesso = nivelAcesso;
		this.senha = senha;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public  Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
