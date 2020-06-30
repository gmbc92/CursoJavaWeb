package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {


		ContaBancaria bancaria = new ContaBancaria();
		
		bancaria.setDescricao("Conta bancaria do Alex");
		
		bancaria.depositarDinheiro(200);
		
		bancaria.diminui100reais();
		
		System.out.println(bancaria);

	}

}
