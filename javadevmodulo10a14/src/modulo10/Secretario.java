package modulo10;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	/*
	CUIDADO AO ADICIONAR ATRIBUTOS A MAIS
	PODE TER QUEBRA NA ESTRUTURA E PROBLEMA NO BANCO DE DADOS
	*/
	private String login;
	private String senha;
	
	//criando construtores
	//padrao
	public Secretario() {
	}
	//com parametro
	public Secretario(String login, String senha) {
		this.login=login;
		this.senha=senha;
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
	public double salario() {
		// TODO Auto-generated method stub
		return 1800*0.9;
	}
	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		//return login.equals("admin")&&senha.equals("admin");
		//na aula para nao quebrar o codigo:
		this.login=login;
		this.senha=senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin")&&senha.equals("admin");
	}
	
	/*
	//padrão é false
	//esse é o método do contrato de autenticação
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin")&&senha.equals("admin");
	}
	*//*
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	*/
	
}
