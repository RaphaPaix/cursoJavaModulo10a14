package executavel;

import modulo10.Aluno;
import modulo10.Diretor;
import modulo10.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1130103");
		diretor.setNome("Rapha");
		diretor.setTitulacao("Diretor Acadêmico");
		diretor.setIdade(24);
		System.out.println(diretor);
		System.out.println(diretor.estudante() ? "Estudante" : "Trabalhador");

	}
}
