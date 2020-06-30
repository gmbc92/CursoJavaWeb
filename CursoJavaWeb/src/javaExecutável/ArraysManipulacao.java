package javaExecutável;

import javax.swing.JOptionPane;

import javaClasses.Aluno;
import javaClasses.Disciplina;

public class ArraysManipulacao {

	public static void main(String[] args) {
		
		/*String posicoes = JOptionPane.showInputDialog("Quantas casas o array deve ter?");

		double notas [] = new double [Integer.parseInt(posicoes)]; //tem que settar o tamanho do arry
		
		for (int i = 0; i < notas.length; i++) {
			
			String valor = JOptionPane.showInputDialog("Qual o valor da posicao " + (i + 1) );
			notas[i] = Integer.parseInt(valor);
			
		}
		
		
		for(int i = 0; i< notas.length;i++) {
			System.out.println("Nota " + (i + 1)  + " é = " + notas[i]);
		}*/
		
		double[] notasJava = {8.8 , 9.0 , 3.5 , 7.7};
		double[] notasJS = {9.0 , 7.0 , 6.9 , 9.8};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Guilherme");
		aluno.setNomeMae("Izabela");
		
		
		
		Disciplina disciplina = new Disciplina();		
		disciplina.setDisciplina("java");
		
		disciplina.setNota(notasJava);
		
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("JS");
		
		disciplina2.setNota(notasJS);
		aluno.getDisciplinas().add(disciplina2);
		
		//------------- xxxx --------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int i = 0; i < arrayAlunos.length; i++) {
			
			System.out.println("Nome do aluno é " + arrayAlunos[i].getNome());
			
			for (Disciplina d : arrayAlunos[i].getDisciplinas()) {
				
				System.out.println("Nome da Disciplina é : " + d.getDisciplina());
				
				for (int j = 0; j < d.getNota().length; j++) {
					
					System.out.println("A nota numero " + j + " é igual a " + d.getNota()[j]);
					
				}
				
			}
			
		}
		
		
		/*
		System.out.println(" Nome do Aluno = " + aluno.getNome() + " inscrito no curso de " + disciplina.getDisciplina());
		
		System.out.println("------Disciplina do Aluno------");
		
		for(Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println(" Disciplina : " + d.getDisciplina());
			
			System.out.println("AS notas são ");
			
			double notaMax = 0.0;
			
			for (int i = 0; i < d.getNota().length ; i++) {
				System.out.println("Nota " + i + " é igual = " + d.getNota()[i] );
				
				if(i == 0) {
					notaMax = d.getNota()[i];
				}else {
					if (d.getNota()[i] > notaMax) {
						notaMax = d.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota da disciplina " + d.getDisciplina() + " é de valor: " + notaMax  );
			
		}
		*/
		
	}
}
