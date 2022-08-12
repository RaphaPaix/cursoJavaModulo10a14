package thread;

import javax.swing.JOptionPane;

//transformando Thread em objeto,
//para facilitar a manipula��o
public class AulaThread2 {
	public static void main(String[] args) {
		
		//processando e-mail em paralelo
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//---------DIVIS�O DAS THREADS--------
		
		//processando nota fiscal em paralelo
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		//c�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("FIM DO C�DIGO TESTE");
		//fluxo, do sistema: cadastro de venda, emissao de nota fiscal, etc
		JOptionPane.showMessageDialog(null, "Sistema do usu�rio continua operando");
	}
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			//c�digo da rotina
			//c�digo da rotina para processamento em paralelo
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//para um segundo a  cada itera��o
				//quero executar essa opera��o com um tempo de parada/tempo determinado
				System.out.println("Enviando e-mail");
			}
			//fim do c�digo paralelo
		}
	};
	
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			//c�digo da rotina
			//c�digo da rotina para processamento em paralelo
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//para um segundo a  cada itera��o
				//quero executar essa opera��o com um tempo de parada/tempo determinado
				System.out.println("Enviando nota fiscal");
			}
			//fim do c�digo paralelo
		}
	};
}
