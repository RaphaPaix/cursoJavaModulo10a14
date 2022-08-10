package modulo10;

import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public boolean estudante() {
		// TODO Auto-generated method stub
		return idade<=25;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 45000;
	}
	
	//autenticando o DIRETOR, copiando dados e métodos da classe secretario
	private String login;
	private String senha;
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
		return login.equals("rapha")&&senha.equals("123");
	}
	
	//construtor padrao
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	public Diretor(String login, String senha) {
		this.login=login;
		this.senha=senha;
		// TODO Auto-generated constructor stub
	}
}