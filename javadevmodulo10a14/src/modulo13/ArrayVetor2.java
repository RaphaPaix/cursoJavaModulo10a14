package modulo13;

import modulo10.Aluno;
import modulo10.Disciplina;


public class ArrayVetor2 {
	public static void main(String[] args) {
		//criação do arrau
		double[] notasJAVA = {8.7,8.8,8.9,9.5};
		double[] notasGIT = {7.4,10,7.8,9.8};
		//instanciando o aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Rapha");
		aluno.setNomeEscola("JDEV");
		//instanciando a disciplina1
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Curso de JAVA");
		disciplina1.setNota(notasJAVA);
		//instanciando a disciplina2
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso de GitHub");
		disciplina2.setNota(notasGIT);
		//ligando os objetos
		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);
		//criando array de objetos
		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		for(int i=0;i<arrayAlunos.length;i++) {
			System.out.println("Nome do aluno: "+arrayAlunos[i].getNome());
			for (Disciplina disciplina : arrayAlunos[i].getDisciplinas()) {
				System.out.println("Disciplina: "+disciplina.getDisciplina()+" / Nota média da disciplina: "+disciplina.getMediaDisciplina());
			}
		}
		
		
		/*
		//varrendo array e imprimindo dados
		System.out.println("\nAluno: "+aluno.getNome()+" / Inscrito no curso: "+aluno.getNomeEscola());
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("\nDisciplina: "+d.getDisciplina());
			//obtendo nota maxima
			double notaMax = 0.0;
			double notaMin = 0.0;
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota "+(i+1)+": "+d.getNota()[i]);
				if(i==0) {
					notaMax=d.getNota()[i];
					notaMin=d.getNota()[i];
				}else {
					if(d.getNota()[i]>notaMax) {
						notaMax=d.getNota()[i];
					}
					if(d.getNota()[i]<notaMin) {
						notaMin=d.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota da disciplina "+d.getDisciplina()+" é igual a: "+notaMax);
			System.out.println("A menor nota da disciplina "+d.getDisciplina()+" é igual a: "+notaMin);
		}
		*/
		
	}
}
