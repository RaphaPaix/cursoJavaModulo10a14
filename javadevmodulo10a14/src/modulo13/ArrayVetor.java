package modulo13;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		/*array pode ser de todos os tipos de dados e objetos*/
		float[] array = new float[6];
		
		//para passar vários tipos de dados diferentes, utilizamos Array de String
		String[] valores = new String[4];
		//valores[0] = "Rapha 007"; - pode escrever QUALQUER COISA
		
		
		//usuario pede a quantidade de notas
		//é o mesmo que declarar o tamanho do array
		String tamanhoArray = JOptionPane.showInputDialog("Quantas notas quer adicionar?");
		
		//lista é mais dinâmica quanto a quantidade
		//a quantidade de posiçoes deve ser declaradas
		//double[] notas;
		double notas[] = new double[Integer.valueOf(tamanhoArray)];
		//?não sei qual a diferença entre valueof e parseint
		//posição = elmento - 1
		
		/*atribuindo valores a posição*/
		//entrada e leitura de forma dinâmica
		for(int i=0;i<notas.length;i++) {
			String nota = JOptionPane.showInputDialog("Digite a nota "+(i+1));
			notas[i] = Integer.valueOf(nota);
		}
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}
	}
}
