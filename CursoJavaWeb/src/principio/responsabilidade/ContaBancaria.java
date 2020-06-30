package principio.responsabilidade;

public class ContaBancaria {
	
	private String descricao;
	
	private double saldo =8000;
	
	
	public void soma100reais() {
		saldo += 100;
	}
	
	public void diminui100reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro (double saque) {
		saldo -= saque;
	}
	
	public void depositarDinheiro (double deposito) {
		saldo += deposito;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
