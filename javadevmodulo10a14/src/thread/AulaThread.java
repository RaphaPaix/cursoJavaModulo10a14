package thread;

import javax.swing.JOptionPane;
import javax.xml.stream.events.StartDocument;

//utilizadas para programação em paralelo/concorrente
public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		//criando uma thread - processando em paralelo
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
		
		

		//código do sistema do usuário continua o fluxo de trabalho
		System.out.println("FIM DO CÓDIGO TESTE");
		//fluxo, do sistema: cadastro de venda, emissao de nota fiscal, etc
		JOptionPane.showMessageDialog(null, "Sistema do usuário continua operando");
	}
}
