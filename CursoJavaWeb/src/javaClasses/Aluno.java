package javaClasses;

import java.util.ArrayList;
import java.util.List;

import CursoJavaWeb.constantes.StatusAluno;

public class Aluno extends Pessoa{
	

	private String dataMatricula, nomeEscola, serieMatriculado;  
	
	
	
	/*chama o objeto disciplina relacionando os objetos*/
	
	//private Disciplina disciplina = new Disciplina();
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	//set/get da disciplina set ctrl+espaço
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
		

	public double getMediaNota() { // metodo que retorna média do aluno, nao passa parametros.
		
		double somaNotas = 0.0;
				
		for (Disciplina disciplina : disciplinas) {   //( classe variavel : array da propria classe )
			
			somaNotas += disciplina.getMediaNotas();
			
		}
		return  somaNotas / disciplinas.size();//sabe a quantidade de objetos
		
		
       //(disciplina.getNota1()+ disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4() ) / 4;
	}

	 
	  public String getAlunoAprovado2() {
		  double media = this.getMediaNota();
		  
		  if(media >=50) {
			  
			  if(media >=70) {
				  
				  return StatusAluno.APROVADO;
				  
			  }else {
				  
				  return StatusAluno.RECUPERACAO;
				  
			  }
			  
		  } else {
			  
			  return StatusAluno.REPROVADO;
			  
		  }
		  
	  }


	/*public boolean getAlunoAprovado() { // mais utilizado na prática

		double media = this.getMediaNota();

		if (media >= 70) {
			return true;
		} else {
			return false ;
		}

	}

	public void setNome(String nome) { // metodo ser nao precisa de retorno = void, publico para usar em outras
										// classes. Iguala-se o parametro passado String Variavel à variável de escopo
										// local usando this.
		this.nome = nome;
	}

	public String getNome() { // metodo retorna a variável para fora, entao sem void e com o tipo de retorno,
								// usando this ou não para retornar a variavel local para outra classe.
		return this.nome;
	} */

	

	// gerando automaticamente o ToString
	
	  
	  @Override
		public String toString() {
			return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
					+ serieMatriculado + ", disciplinas=" + disciplinas + ", nome=" + nome + ", dataDeNascimento="
					+ dataDeNascimento + ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae="
					+ nomeMae + ", nomePai=" + nomePai + ", idade=" + idade + "]";
		}
		
	
	
	//gerando hashcode do atributo nome e cpf para comparar 2 objetos com equals, Source Hashcode and equals, isso sobrescreve o metodo equals para comparar
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
			result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
			result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
			result = prime * result + ((serieMatriculado == null) ? 0 : serieMatriculado.hashCode());
			return result;
		}

		

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (dataMatricula == null) {
				if (other.dataMatricula != null)
					return false;
			} else if (!dataMatricula.equals(other.dataMatricula))
				return false;
			if (disciplinas == null) {
				if (other.disciplinas != null)
					return false;
			} else if (!disciplinas.equals(other.disciplinas))
				return false;
			if (nomeEscola == null) {
				if (other.nomeEscola != null)
					return false;
			} else if (!nomeEscola.equals(other.nomeEscola))
				return false;
			if (serieMatriculado == null) {
				if (other.serieMatriculado != null)
					return false;
			} else if (!serieMatriculado.equals(other.serieMatriculado))
				return false;
			return true;
		}

		//Identifica que esta sobrescrevendo um metodo
		@Override
		public boolean pessoaMaiorIdade() {
			// TODO Auto-generated method stub
			return super.pessoaMaiorIdade();
		}
	  
	  public String msgMaiorIdade () {
		  return this.pessoaMaiorIdade() ? "Aluno é maior de idade" : "aluno é menor de idade"; //if (this.pessoaMaiorIdade()) {"aluno é maior de idade"} else {"aluno é menor de idade};
	  }

	  
	  // metodo implementado obrigatoriamente da classe pai via abstract
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
