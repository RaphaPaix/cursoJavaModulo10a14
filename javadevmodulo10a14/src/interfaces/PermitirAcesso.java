package interfaces;

//essa interface é o contrato de autenticação
//permitir que apenas o secretário acesse esse método
//é uma via de mão dupla: acesso exclusivo porém obrigatório
public interface PermitirAcesso {
	
	public boolean autenticar();//apenas declaração do método
	//a implementação deve ser feita no objeto destinado
	
	//método mais robusto, contrato mais forte
	public boolean autenticar(String login, String senha); 
}
