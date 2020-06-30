package excecao;

public class ExcecaoNota extends Exception {
	
	public ExcecaoNota(String erro) {

	super("Erro no processamento do arquivo" + erro);
	
	}

}
