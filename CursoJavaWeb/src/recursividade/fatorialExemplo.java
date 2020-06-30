package recursividade;

public class fatorialExemplo {

	public static void main(String[] args) {

		System.out.println(fatorial(8));
		
	}
	
	public static int fatorial (int a ) {
		
		if (a == 0 ) {
			return 1;
		}else {
			
			return a * fatorial (a - 1);
			
		}
	}
}
