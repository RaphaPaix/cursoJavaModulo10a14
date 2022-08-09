package AulaPOO;

import java.math.BigDecimal;

public class ExecutarTeste {
	public static void main(String[] args) {
		
		//instanciando e setando a venda 
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda curso JDEV");
		venda.setEnderecoCliente("Entrega via e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Rapha");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		//instanciando e setando o produto
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientaçao Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		//adicionando produto a lista de produtos do objeto venda
		venda.getListaProdutos().add(produto1); //nessa linha dificulta-se a utilizaçao de validaçoes
		//adicionando com o método
		venda.addProduto(produto2); //pode-se fazer validaçoes no método antes de utilizar a lista
		
		/*
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descriçao do produto: "+produto);
			System.out.println("----------------------------");
		}
		System.out.println(venda);
		*/
		System.out.println("Valor total da venda: R$"+venda.getValorTotal());
		
	}
}
