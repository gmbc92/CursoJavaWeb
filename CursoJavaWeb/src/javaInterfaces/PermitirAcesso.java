package javaInterfaces;


//essa interface � o contrato d autentica��o

public interface PermitirAcesso {
	
  //apenas declara��o do metodo na interface
	
	public boolean autenticar(String login, String senha );
	
	public boolean autenticar();

}
