package modulo13;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		/*array pode ser de todos os tipos de dados e objetos*/
		float[] array = new float[6];
		
		//para passar v�rios tipos de dados diferentes, utilizamos Array de String
		String[] valores = new String[4];
		//valores[0] = "Rapha 007"; - pode escrever QUALQUER COISA
		
		
		//usuario pede a quantidade de notas
		//� o mesmo que declarar o tamanho do array
		String tamanhoArray = JOptionPane.showInputDialog("Quantas notas quer adicionar?");
		
		//lista � mais din�mica quanto a quantidade
		//a quantidade de posi�oes deve ser declaradas
		//double[] notas;
		double notas[] = new double[Integer.valueOf(tamanhoArray)];
		//?n�o sei qual a diferen�a entre valueof e parseint
		//posi��o = elmento - 1
		
		/*atribuindo valores a posi��o*/
		//entrada e leitura de forma din�mica
		for(int i=0;i<notas.length;i++) {
			String nota = JOptionPane.showInputDialog("Digite a nota "+(i+1));
			notas[i] = Integer.valueOf(nota);
		}
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}
	}
}
