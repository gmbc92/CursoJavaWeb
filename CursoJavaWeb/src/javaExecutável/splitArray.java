package javaExecutável;

import java.util.Arrays;
import java.util.List;

public class splitArray {

	public static void main(String[] args) {

		String texto = "alex , Curso Java , 80, 90, 70";
		
		String valoresArray[] = texto.split(",");
		
		System.out.println("Nome : " + valoresArray[0]);
		System.out.println("Curso : " + valoresArray[1]);
		System.out.println("Nota1 : " + valoresArray[2]);
		System.out.println("Nota2 : " + valoresArray[3]);
		System.out.println("Nota3 : " + valoresArray[4]);
		
		//array para lista!
		
		List<String> lista = Arrays.asList(valoresArray); //importa Arrays java.util
		
		for (String valorString : lista) {
			
			System.out.println(valorString);
			
		}
		
		//lista para array
		
		String[] conversaoArray = lista.toArray(new String[5]);
		
		for (int i = 0; i < conversaoArray.length; i++) {
			
			System.out.println(conversaoArray[i]);
			
		}
		
	}

}
