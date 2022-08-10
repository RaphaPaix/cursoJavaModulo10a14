package classesauxiliares;

import interfaces.PermitirAcesso;

//funçao de somente receber o objeto que tem contrato 100% legitimo com a interface de PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
