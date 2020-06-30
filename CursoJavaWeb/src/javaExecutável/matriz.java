package javaExecutável;

public class matriz {

	public static void main(String[] args) {


		int notas[][] = new int[2][3]; //colunas e linhas
		
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 90;
		
		notas[1][0] = 50;
		notas[1][1] = 40;
		notas[1][2] = 60;
		
		//percorrer linhas
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("------------------------------");
			
			//percorre colunas
			for (int j = 0; j < notas[i].length; j++) {
				
				System.out.println("valor da matriz: " +notas[i][j]);
				
			}
			
		}
		

	}

}
