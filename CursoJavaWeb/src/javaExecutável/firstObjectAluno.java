package javaExecutável;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import CursoJavaWeb.constantes.StatusAluno;
import excecao.ExcecaoNota;
import javaClasses.Aluno;
import javaClasses.Disciplina;
import javaClasses.Secretario;
import javaInterfaces.PermitirAcesso;

public class firstObjectAluno {

	public static void main(String[] args) {

		try {

			/*try {

				File fil = new File("c://lines.txt");
				Scanner scanner = new Scanner(fil);
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				throw new ExcecaoNota(e.getMessage());

			}*/
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			// PermitirAcesso secretario = new Secretario();

			// pode-se auinda fazer um new Secretario dentro do if pra diminuir o código

			PermitirAcesso permitirAcesso = new Secretario(login, senha);

			if (permitirAcesso.autenticar()) {

				// if (new Secretario().autenticar(login, senha)) { // retornar true acessa o
				// sistema, se nao nao entra

				List<Aluno> alunos = new ArrayList<Aluno>();

				// uma lista que dentro dela temos uma chave que identifica uma sequencia de
				// valores

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				// List<Aluno> alunosAprovados = new ArrayList<Aluno>();

				// List<Aluno> alunosReprovados = new ArrayList<Aluno>();

				// List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

				for (int qtd = 1; qtd <= 5; qtd++) { // esse for pega tudo que é manipulável

					Aluno aluno1 = new Aluno();

					aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + " ?"));

					System.out.println(" O Nome settado pelo usuário é: " + aluno1.getNome());
					// System.out.println(" O RG settado pelo usuário é: " + aluno1.getRG());

					for (int i = 1; i <= 2; i++) {

						String nomeDisciplina = JOptionPane.showInputDialog(" Nome da Disciplina " + i + " ? ");
						String notaDisciplina = JOptionPane.showInputDialog(" Nota da Disciplina " + i + " ? ");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						//disciplina.setNota(Double.parseDouble(notaDisciplina)); mudou ao usar array, n precisa mais settar por aqui

						aluno1.getDisciplinas().add(disciplina);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?"); // sobrepor
																												// algumatela
																												// ,
																												// yes =
																												// 0,
																												// no =
																												// 1;
																												// entrando
																												// no
																												// metodo
																												//
					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) { // deixa 0 a condição do yes e entra novamente no loop, quando
														// for
														// nao
														// sera 1 e sairá

							String disciplinaRemover = JOptionPane
									.showInputDialog("Qual a disciplina que deseja tirar? 1,2,3 ou 4?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;

							continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a remover?  ");

						}

					}

					alunos.add(aluno1);

				}

				// inicializar valores padrao

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {

						maps.get(StatusAluno.APROVADO).add(aluno); // alunosAprovados.add(aluno);

					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {

						maps.get(StatusAluno.RECUPERACAO).add(aluno); // alunosRecuperacao.add(aluno);

					} else {

						maps.get(StatusAluno.REPROVADO).add(aluno); // alunosReprovados.add(aluno);

					}

				}

				System.out.println("-------------lista dos aprovados--------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com media de: " + aluno.getMediaNota());
				}

				System.out.println("-------------lista dos reprovados--------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com media de: " + aluno.getMediaNota());
				}

				System.out.println("-------------lista dos recuperacao--------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com media de: " + aluno.getMediaNota());
				}

				/*
				 * for(int i =0; i < alunos.size(); i++) { //size retorna o tamanho, por isso
				 * tem que ser <
				 * 
				 * Aluno aluno = alunos.get(i); //trocando um objeto por outro!!!
				 * 
				 * if(aluno.getNome().equalsIgnoreCase("alex")) {
				 * 
				 * Aluno trocar = new Aluno(); trocar.setNome("Aluno foi trocado");
				 * //disciplinas esta em aluno, instancia uma nova lista tb
				 * 
				 * Disciplina disciplina = new Disciplina();
				 * disciplina.setDisciplina("Matematica"); disciplina.setNota(50);
				 * 
				 * trocar.getDisciplinas().add(disciplina);
				 * 
				 * 
				 * alunos.set(i, trocar); aluno = alunos.get(i);
				 * 
				 * 
				 * }
				 * 
				 * System.out.println("aluno = " + aluno.getNome());
				 * System.out.println("Media do aluno " + aluno.getMediaNota());
				 * System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				 * System.out.println("-----------------------------------------------------");
				 * 
				 * /* for (Disciplina disc : aluno.getDisciplinas()) {
				 * System.out.println(" materia = " + disc.getDisciplina() + " Nota = " +
				 * disc.getNota()); }
				 * 
				 * 
				 * for ( int pos= 0; pos < aluno.getDisciplinas().size(); pos++) {
				 * 
				 * Disciplina disc = aluno.getDisciplinas().get(pos);
				 * System.out.println("Materia= " + disc + " Nota = " + disc.getNota());
				 * 
				 * } }
				 */

				/*
				 * for (Aluno aluno : alunos) {
				 * 
				 * if (aluno.getNome().equalsIgnoreCase("Alex")) { // se quiser achar um nome
				 * especifico de aluno
				 * 
				 * alunos.remove(aluno); break;
				 * 
				 * } else {
				 * 
				 * System.out.println(" A média do aluno " + aluno + " é: " +
				 * aluno.getMediaNota());
				 * 
				 * System.out.println(" Resultado vai ser igual a : " +
				 * aluno.getAlunoAprovado()); // ctrl+click pra entrar // no metodo. Ele está //
				 * na classe Aluno e // aproveita o resultado // do getAlunoAprovado
				 * 
				 * System.out.println("Resultado = " + aluno.getAlunoAprovado());
				 * 
				 * System.out.println(
				 * "--------------------------------------------------------------------"); }
				 * 
				 * }
				 * 
				 * for (Aluno aluno : alunos) {
				 * System.out.println("Alunos que sobraram na lista");
				 * System.out.println(aluno.getNome());
				 * System.out.println("Suas materias são:");
				 * 
				 * for (Disciplina disciplina : aluno.getDisciplinas()) {
				 * System.out.println(disciplina.getDisciplina());
				 * 
				 * }
				 * 
				 * }
				 * 
				 */

				/*
				 * Aluno aluno2 = new Aluno();
				 * 
				 * aluno1.setCPF("101.785.224-30");
				 * 
				 * aluno1.setRG("8456748");
				 * 
				 * aluno1.setNome("João");
				 * 
				 * aluno1.setRG(JOptionPane.showInputDialog("Qual o RG do Aluno"));
				 * 
				 * 
				 * aluno1.setIdade(Integer.parseInt(JOptionPane.
				 * showInputDialog("Qual a idade do aluno? ")));
				 * 
				 * System.out.println(" A idade do aluno digitada é: " + aluno1.getIdade());
				 * 
				 * //aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite a primeira note")));
				 * 
				 * System.out.println("nota 1 dititada é: ");
				 * 
				 * System.out.println(" O CPF do aluno é " + aluno1.getNome() + " e o CPF é: " +
				 * aluno1.getCPF());
				 */
				/*
				 * aluno1.getDisciplina().setDisciplina1(JOptionPane.
				 * showInputDialog("Digita a Disciplina1 "));
				 * aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite a nota1")));
				 * 
				 * aluno1.getDisciplina().setDisciplina1(JOptionPane.
				 * showInputDialog("Digita a Disciplina2 "));
				 * aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite a nota2")));
				 * 
				 * aluno1.getDisciplina().setDisciplina1(JOptionPane.
				 * showInputDialog("Digita a Disciplina3 "));
				 * aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite a nota3")));
				 * 
				 * aluno1.getDisciplina().setDisciplina1(JOptionPane.
				 * showInputDialog("Digita a Disciplina4 "));
				 * aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite a nota4")));
				 */

				/*
				 * Disciplina disciplina1 = new Disciplina();
				 * disciplina1.setDisciplina(" banco de dados"); disciplina1.setNota(90);
				 * 
				 * aluno1.getDisciplinas().add(disciplina1);
				 * 
				 * Disciplina disciplina2 = new Disciplina();
				 * disciplina2.setDisciplina(" Matematica"); disciplina2.setNota(80);
				 * 
				 * aluno1.getDisciplinas().add(disciplina2);
				 * 
				 * Disciplina disciplina3 = new Disciplina();
				 * disciplina3.setDisciplina("Banco de Dados"); disciplina3.setNota(70);
				 * 
				 * aluno1.getDisciplinas().add(disciplina3);
				 * 
				 * Disciplina disciplina4 = new Disciplina();
				 * disciplina4.setDisciplina4("Java Web"); disciplina4.setNota(90);
				 * 
				 * aluno1.getDisciplinas().add(disciplina4);
				 * 
				 */

				// aluno1.setNota1(90);

				// operador
				// ternário
				/*
				 * System.out.println( " Resultado = "); if(aluno1.getAlunoAprovado() == true) {
				 * System.out.println("Aprovado"); } else {System.out.println("Reprovado");};
				 */

				// System.out.println(aluno1.toString()); /* la do Aluno, SOurce to string */

				/* comparar 2 objetos no java, equals e Hashcode */

				Aluno aluno5 = new Aluno();
				aluno5.setNome("x");
				Aluno aluno6 = new Aluno();
				aluno6.setNome("x");

				if (aluno5.equals(aluno6)) {
					System.out.println("iguais");
				} else {
					System.out.println("diferentes");
				}
			} else {
				JOptionPane.showMessageDialog(null, "acesso nao permitido");
			}

			// aqui

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); // imprime erro no console java

			System.out.println("Mensagem: " + e.getMessage()); // catar a mensagem de erro

			for (int i = 0; i < e.getStackTrace().length; i++) {

				saida.append("/n Classe de erro : " + e.getStackTrace()[i].getClassName());
				saida.append("/n Metodo de erro : " + e.getStackTrace()[i].getMethodName());
				saida.append("/n Linha de erro : " + e.getStackTrace()[i].getLineNumber());
				saida.append("/n CLass de erro : " + e.getClass().getName());

				JOptionPane.showMessageDialog(null, "erro de conversao de numero" + saida.toString());

			}

		} catch (NullPointerException e) {

			JOptionPane.showMessageDialog(null,
					"erro de null pointer exception, variável startada vazia:" + e.getClass());

		} finally {
			// sempre é executado com erros ou nao
			JOptionPane.showInputDialog(
					"Essa mensagem é a do finally e sempre aparecerá, fechar transação em banco de dados por exemplo");
		}
	}
	
	public void lerArquivo() throws ExcecaoNota { //lançando exceções pra cima! 
		try {
			File fil = new File("c://lines");
			Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExcecaoNota(e.getMessage());
		}
	}
}
