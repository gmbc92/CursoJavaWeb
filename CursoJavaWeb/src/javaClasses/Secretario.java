package javaClasses;

import javaInterfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario() {
	}

	// private String login, senha; não precisa mais, estamos passando por parametro
	// pela função da interface PermitirAcesso

	// ctrl espaço vê os atributos da super class

	@Override
	public double salario() {
		return 0;
	}

	// metodo obrigatorio da interface de autenticação

	// metodo diferente por ter parametros diferentes

	@Override
	public boolean autenticar(String login, String senha) {
	
		this.login = login;
		this.senha = senha;
		//return login.equals("admin") && senha.equals("admim");
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		return false;
	}
	
	
	
	

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", registroGeral=" + registroGeral
				+ ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", idade=" + idade
				+ "]";
	}

	
	
	

}
