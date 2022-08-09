package modulo10;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class Aluno extends Pessoa{
	//atributos do aluno
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	//Lista disciplina dentro do objeto aluno
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	//set e get da lista
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	//metodo calculo da media
	public double getMediaNota() {
		double somaDasNotas=0.0;
		for( Disciplina disciplina : disciplinas) {
			somaDasNotas += disciplina.getNota();
		}
		return somaDasNotas / disciplinas.size();
	}
	//metodo aprovado 1 (mais utilizado pela praticidade - a responsabilidade da String fica para a tela)
		public boolean getAlunoAprovado() {
			double media = this.getMediaNota();
			if(media>=70) {
				return true;
			}else {
				return false;
			}
		}
	//metodo aprovado 2
		public String getAlunoAprovado2() {
			double media = this.getMediaNota();
			if(media>=50) {
				if(media<=70) {
					return StatusAluno.RECUPERACAO;
				}else {
					return StatusAluno.APROVADO;
				}
			}else {
				return StatusAluno.REPROVADO;
			}
		}
	//construtor padrao
	public Aluno() {
		
	}
	//1 parametro
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	//2 parametro
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	//metodo toString
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", numeroCpf=" + numeroCpf + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}
}
