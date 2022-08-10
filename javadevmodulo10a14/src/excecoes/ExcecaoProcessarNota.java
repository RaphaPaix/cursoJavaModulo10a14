package excecoes;

//utilizando para customizar a exceçao
public class ExcecaoProcessarNota extends Exception{
	public ExcecaoProcessarNota(String erro) {
		super("Erro ao processar as notas do aluno: "+erro);
	}
}
