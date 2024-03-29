package thread;

import javax.swing.JOptionPane;

//utilizadas para programa��o em paralelo/concorrente
public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		//as thread intercalam, e executam cada uma em seu tempo
		//o pr�prio sistema operacional gerencia as threads
		//as threas est�o sempre concorrendo por mem�ria
		
		//criando uma thread - processando em paralelo ENVIO DE EMAIL
		new Thread() {
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
			};
		}.start();//start liga/inica a thred que fica rodando por tr�s
		
		//---------------DIVISAO DAS THREADS--------------
		
		//criando uma thread - processando em paralelo ENVIO DE NOTA FISCAL
		new Thread() {
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
			};
		}.start();//start liga/inica a thred que fica rodando por tr�s

		
		
		//c�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("FIM DO C�DIGO TESTE");
		//fluxo, do sistema: cadastro de venda, emissao de nota fiscal, etc
		JOptionPane.showMessageDialog(null, "Sistema do usu�rio continua operando");
	}
}
