package javaInterfaces;


//essa interface é o contrato d autenticação

public interface PermitirAcesso {
	
  //apenas declaração do metodo na interface
	
	public boolean autenticar(String login, String senha );
	
	public boolean autenticar();

}
