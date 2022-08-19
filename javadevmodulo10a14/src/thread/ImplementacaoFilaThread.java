package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		synchronized (iteracao) { //bloqueia o acesso a lista por outros processos
			while(iteracao.hasNext()) {
				ObjetoFilaThread processar = (ObjetoFilaThread)iteracao.next();//pega o objeto atual
				
				//agora faremos o codigo, segue exemplos:
				//processar 10mil notas fiscais 
				//gerar uma lista enorme de PDF
				//gerar um envio em massa de email
				
				//impressao para teste:
				System.out.println("-----------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				
				
				iteracao.remove();//remover o objeto da lista
				
				try {
					Thread.sleep(100); //dar um tempo para a descarga de memória
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
		} 
		try {
			Thread.sleep(1000); //apos processar toda a lista, dá um tempo para a limpeza de memória
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
