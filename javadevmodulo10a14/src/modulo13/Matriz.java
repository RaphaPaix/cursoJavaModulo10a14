package modulo13;

public class Matriz {
	/*executar o codigo java*/
	public static void main(String[] args) {
		int notas[][] = new int[2][3];
		notas[0][0]=80;
		notas[0][1]=90;
		notas[0][2]=70;
		notas[1][0]=60;
		notas[1][1]=50;
		notas[1][2]=100;
		//varrendo a matriz
		System.out.println("Matriz: ");
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				System.out.printf(" %d",notas[i][j]);
			}
			System.out.println(" ");
		}
	}
}
