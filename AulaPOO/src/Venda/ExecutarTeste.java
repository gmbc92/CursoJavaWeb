package Venda;

import java.math.BigDecimal;

public class ExecutarTeste {

	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome(" Modulo Orientação A Objetos ");
		produto1.setValor(BigDecimal.valueOf(100.00));
		
		Produto produto2 = new Produto();
		produto2.setNome("Modulo Spring Boot");
		produto2.setValor(BigDecimal.valueOf( 50.00 ));
		produto2.setId( 2L );
		
		Produto produto3 = new Produto();
		produto3.setNome("Data Base");
		produto3.setValor(BigDecimal.valueOf( 55.00 ));
		produto3.setId( 5L );
		
		Produto produto4 = new Produto();
		produto4.setNome(" Angular 8");
		produto4.setValor(BigDecimal.valueOf( 50.00 ));
		produto4.setId( 7L );
		
		
		
		Venda venda = new Venda();
		
		venda.setDescricaoVenda(" Curso de Formação Java");
		venda.setEnderecoEntrega(" Entrega pelo Email ");
		venda.setId(10L);
		venda.setNomeCliente(" Guilherme MEndes");
		//venda.setValorTotal(BigDecimal.valueOf( 197.00 ));
		
		/*pega a lista e adiciona o produto1*/
		
		venda.getListaProdutos().add(produto1); /* não da pra fazer validações*/
		venda.getListaProdutos().add(produto2);
		venda.addProduto(produto3); /* usa o metodo que ja vem com o retorno do produto, da pra fazer validações antes de adicionar à lsita*/
		venda.addProduto(produto4);
		
		/*for (Produto produto : venda.getListaProdutos()) {
			
			System.out.println(" Descrição Produto " + produto );
			
		}*/
		
		System.out.println(" Descrição da venda " + venda.getDescricaoVenda() + " e o total: " + venda.totalVenda() ); //temos que chamar o metodo totalVenda antes para funcionar.
		
		System.out.println( " Valor da Variável Total: " + venda.getValorTotal()); // va dar nulo, temos que arrumar o metodo totalVenda
		
		
		//System.out.println( "Descrição Venda : " + venda.getDescricaoVenda() );
		//System.out.println( "Descrição Endereço de Entrega : " + venda.getEnderecoEntrega() );
		//System.out.println(" Descrição Venda : " + venda); 
		
	}
}
