package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	//criando um painel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());
	//componentes
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	//criando botoes start e stop
	JButton jButton = new JButton("Gerar Lote");
	JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	
	public TelaTimeThread() { //construtor
		//configura�oes iniciais:
		// titulo da tela
		setTitle("Minha tela de time com Thread");
		//dimensao da tela
		setSize(new Dimension(240,240));
		//centralizar a tela
		setLocationRelativeTo(null);
		//para nao deixar alterar as dimensoes
		setResizable(false);
		
		//montagem da tela da aula 14.7
		//controlador de botoes da tela/controlador de posicionamento dos componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		//colocando os botoes alinhados
		gridBagConstraints.gridwidth =1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		//configurando o bot�o de start
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //executa o clique no bot�o
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for(int qtd=0;qtd<100;qtd++){ //simulando 100 envios em massa
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText()+" - "+qtd);
				
				fila.add(filaThread);
				}
			}
		});
		
		//configurando o bot�o de stop
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});
		

		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		
		//sempre ser� o ultimo comando
		setVisible(true); //torna a tela visivel para o usuario
	}
	
}
