package principios.responsabilidade;

public class ContaBancaria {
	
	//metodos simples e funçoes condizentes com o objeto
	//tudo o que eu preciso para o método está aqui?
	private String descricao;
	
	private double saldo = 8000;
	
	public void soma100reais(){
		saldo += 100;
	}
	
	public void menos100reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	public void depositarDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
}
