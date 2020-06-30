package javaExecutável;

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

		System.out.println(" Salario Aluno é " + aluno.salario());

		// com o Polimorfismo podemos tratar os objetos de maneira diferente,
		// aproveitando o codigo Na programação orientada a objetos, o polimorfismo
		// permite que referências de tipos de classes mais abstratas representem o
		// comportamento das classes concretas que as referenciam, dessa forma é
		// possível tratar vários tipos de maneira homogênea. A grosso modo,
		// polimorfismo é a capacidade que um objeto tem de se comportar de "várias
		// formas" através de uma mesma ação. Exemplo utilizando ação ANDAR: andar
		// rápido, andar devagar, andar quase parando, andar muito depressa, etc.

		Pessoa pessoa = new Aluno();

		pessoa = secretario;

		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste (Pessoa pessoa) {
		System.out.println(" Essa pessoa é demais = " + pessoa.getNome() + " e o salario é de : " + pessoa.salario());
	}

}
