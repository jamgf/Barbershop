package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Pessoa {
	
	protected int id;
	protected String nome;
	protected char sexo;
	protected Date dataNascimento;
	protected String telefone;
	protected String email;
	protected String rg;
	
	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Pessoa(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		try {
			this.dataNascimento = new SimpleDateFormat("MM/dd/yyyy").parse(dataNascimento);
		} catch (ParseException e) {
			System.out.println("Wrong date");
			e.printStackTrace();
		}
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
