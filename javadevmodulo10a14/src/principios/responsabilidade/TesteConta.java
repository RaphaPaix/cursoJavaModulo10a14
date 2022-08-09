package principios.responsabilidade;

public class TesteConta {
	public static void main(String[] args) {
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancária do Rapha");
		System.out.println(bancaria);
		bancaria.depositarDinheiro(1000);
		System.out.println(bancaria);
		bancaria.sacarDinheiro(3500);
		System.out.println(bancaria);
		bancaria.soma100reais();
		System.out.println(bancaria);
		bancaria.menos100reais();
		System.out.println(bancaria);
	}
}
