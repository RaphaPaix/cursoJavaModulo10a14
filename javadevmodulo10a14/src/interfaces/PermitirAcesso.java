package interfaces;

//essa interface � o contrato de autentica��o
//permitir que apenas o secret�rio acesse esse m�todo
//� uma via de m�o dupla: acesso exclusivo por�m obrigat�rio
public interface PermitirAcesso {
	
	public boolean autenticar();//apenas declara��o do m�todo
	//a implementa��o deve ser feita no objeto destinado
	
	//m�todo mais robusto, contrato mais forte
	public boolean autenticar(String login, String senha); 
}
