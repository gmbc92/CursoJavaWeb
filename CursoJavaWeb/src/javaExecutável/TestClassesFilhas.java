package javaExecut�vel;

import javaClasses.Aluno;
import javaClasses.Diretor;
import javaClasses.Pessoa;
import javaClasses.Secretario;

public class TestClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// herda da super classe

		Aluno aluno = new Aluno();
		aluno.setNome("Guilherme");
		aluno.setIdade(18);

		Diretor diretor = new Diretor();
		diretor.setNome("Guero");
		diretor.setIdade(30);

		Secretario secretario = new Secretario();
		secretario.setNome("Felino");
		secretario.setIdade(60);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());

		System.out.println(" Salario Aluno � " + aluno.salario());

		// com o Polimorfismo podemos tratar os objetos de maneira diferente,
		// aproveitando o codigo Na programa��o orientada a objetos, o polimorfismo
		// permite que refer�ncias de tipos de classes mais abstratas representem o
		// comportamento das classes concretas que as referenciam, dessa forma �
		// poss�vel tratar v�rios tipos de maneira homog�nea. A grosso modo,
		// polimorfismo � a capacidade que um objeto tem de se comportar de "v�rias
		// formas" atrav�s de uma mesma a��o. Exemplo utilizando a��o ANDAR: andar
		// r�pido, andar devagar, andar quase parando, andar muito depressa, etc.

		Pessoa pessoa = new Aluno();

		pessoa = secretario;

		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste (Pessoa pessoa) {
		System.out.println(" Essa pessoa � demais = " + pessoa.getNome() + " e o salario � de : " + pessoa.salario());
	}

}
