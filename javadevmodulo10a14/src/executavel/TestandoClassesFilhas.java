package executavel;

import javax.swing.JOptionPane;

import classesauxiliares.FuncaoAutenticacao;
import interfaces.PermitirAcesso;
import modulo10.Aluno;
import modulo10.Diretor;
import modulo10.Pessoa;
import modulo10.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		/*Secretario secretario = new Secretario(); //interface diretamente com o objeto
		//as classes diretor e aluno nao sabem da existencia do método autenticar
		secretario.setLogin(login);
		secretario.setSenha(senha);*/
		//fazendo um contrato mais amarrado:
		//PermitirAcesso secretario = new Secretario();
		//if(secretario.autenticar())
		
		
		/* com parametro
		 * outra forma é 
		 * PermitirAcesso permitirAcesso = new Secretario(login,senha);
		 * if(permitirAcesso.autenticar())
		 */
		
		/* com parametro
		 * diretamente = if(new Secretario().autenticar(login, senha))
		 */
		
		//interface pode ser igual ao objeto que a implementa
		//PermitirAcesso permitirAcesso = new Secretario(login,senha);
		
		//FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { //vou travar o contrato para autorizar somente quem tem o contrato 100% legitimo
			Diretor diretor = new Diretor();
			diretor.setRegistroGeral("1130103");
			diretor.setNome("Marcio");
			diretor.setTitulacao("Diretor Acadêmico");
			diretor.setIdade(48);
			System.out.println(diretor);
			System.out.println(diretor.estudante() ? "Estudante" : "Trabalhador");
			System.out.println("Salário do diretor = R$"+diretor.salario());
			/*Pessoa pessoa = new Aluno();
			pessoa = diretor;*/
			Aluno aluno = new Aluno();
			aluno.setNome("Rapha");
			teste(diretor);
			teste(aluno);
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	}
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = "+pessoa.getNome()
		+" e o salário é de: R$"+pessoa.salario());
	}
}
