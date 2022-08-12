package thread;

import javax.swing.JOptionPane;

//utilizadas para programação em paralelo/concorrente
public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		//as thread intercalam, e executam cada uma em seu tempo
		//o próprio sistema operacional gerencia as threads
		//as threas estão sempre concorrendo por memória
		
		//criando uma thread - processando em paralelo ENVIO DE EMAIL
		new Thread() {
			public void run() {
				//código da rotina
				//código da rotina para processamento em paralelo
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//para um segundo a  cada iteração
					//quero executar essa operação com um tempo de parada/tempo determinado
					System.out.println("Enviando e-mail");
				}
				//fim do código paralelo
			};
		}.start();//start liga/inica a thred que fica rodando por trás
		
		//---------------DIVISAO DAS THREADS--------------
		
		//criando uma thread - processando em paralelo ENVIO DE NOTA FISCAL
		new Thread() {
			public void run() {
				//código da rotina
				//código da rotina para processamento em paralelo
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//para um segundo a  cada iteração
					//quero executar essa operação com um tempo de parada/tempo determinado
					System.out.println("Enviando nota fiscal");
				}
				//fim do código paralelo
			};
		}.start();//start liga/inica a thred que fica rodando por trás

		
		
		//código do sistema do usuário continua o fluxo de trabalho
		System.out.println("FIM DO CÓDIGO TESTE");
		//fluxo, do sistema: cadastro de venda, emissao de nota fiscal, etc
		JOptionPane.showMessageDialog(null, "Sistema do usuário continua operando");
	}
}
