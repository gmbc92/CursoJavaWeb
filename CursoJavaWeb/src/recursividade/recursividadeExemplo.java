package recursividade;

public class recursividadeExemplo {

	public static void main(String[] args) {

		int valor = Recursividade(5,7);
		System.out.println(valor);
		
		
	}
	public static int Recursividade (int a, int b) {
		
		if (a == 0 || b ==0) {
			return 0;
		}
		else if (b ==1 ) {
			return a;
		}
		else {
			return (a + Recursividade(a, b - 1));
		}
		
	}

}
