package javaClasses;

import java.util.Arrays;

public class Disciplina {
	
	private double[] nota = new double [4] ;

	private String disciplina;
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for (int i = 0; i < nota.length; i++) {
			
			somaTotal += nota[i];
			
		}
		
		return somaTotal / 4;
		
	}
	
	
	

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
		
	


	
	
	
	
	
	
	 private double nota1 , nota2 , nota3 , nota4;

	private String disciplina1, disciplina2 , disciplina3, disciplina4;
	
	//getters and setter gerados automáticos

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public String getDisciplina4() {
		return disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	
	//HashCode and Equals gerados automaticamente

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + ((disciplina1 == null) ? 0 : disciplina1.hashCode());
		result = prime * result + ((disciplina2 == null) ? 0 : disciplina2.hashCode());
		result = prime * result + ((disciplina3 == null) ? 0 : disciplina3.hashCode());
		result = prime * result + ((disciplina4 == null) ? 0 : disciplina4.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (disciplina1 == null) {
			if (other.disciplina1 != null)
				return false;
		} else if (!disciplina1.equals(other.disciplina1))
			return false;
		if (disciplina2 == null) {
			if (other.disciplina2 != null)
				return false;
		} else if (!disciplina2.equals(other.disciplina2))
			return false;
		if (disciplina3 == null) {
			if (other.disciplina3 != null)
				return false;
		} else if (!disciplina3.equals(other.disciplina3))
			return false;
		if (disciplina4 == null) {
			if (other.disciplina4 != null)
				return false;
		} else if (!disciplina4.equals(other.disciplina4))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		if (Double.doubleToLongBits(nota4) != Double.doubleToLongBits(other.nota4))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Disciplina [nota=" + Arrays.toString(nota) + ", disciplina=" + disciplina + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", disciplina1=" + disciplina1
				+ ", disciplina2=" + disciplina2 + ", disciplina3=" + disciplina3 + ", disciplina4=" + disciplina4
				+ "]";
	}



}
