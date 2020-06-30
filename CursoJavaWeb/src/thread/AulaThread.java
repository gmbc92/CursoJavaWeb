package thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// PRIMEIRA THREAD

		Thread threadEmail = new Thread(thread1);
		
		threadEmail.start();
		
		// SEGUNDA THREAD
		
		Thread threadNF = new Thread(thread2);
		
		threadNF.start();
		
		/*{

			public void run() {
				// codigo da rotina a ser executada paralelamente ENVIO EMAIL

				for (int i = 0; i < 10; i++) {

					// executar a rotina com delay
					System.out.println("Executando alguma rotina de envio de email");

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // metodo demanda tratamento com exceção, ctrl click para acessar, ou try catch
						// implementado junto
				}
			};
		}.start();// liga a Thread para processamento paralelo ENVIO NOTA FISCAL

		// *************************************
		// SEGUNDA THREAD

		new Thread() {

			public void run() {
				// codigo da rotina a ser executada paralelamente

				for (int i = 0; i < 10; i++) {

					// executar a rotina com delay
					System.out.println("Executando alguma rotina de envio de Nota Fiscal");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // metodo demanda tratamento com exceção, ctrl click para acessar, ou try catch
						// implementado junto
				}
			};
		}.start();// liga a Thread para processamento paralelo*/

		// fim do fluxo paralelo
		// fluxo do sistema
		System.out.println("Fim da Thread");

		JOptionPane.showMessageDialog(null, "Sisema continua executando para o usuario");

	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			// codigo da rotina a ser executada paralelamente ENVIO EMAIL

			for (int i = 0; i < 10; i++) {

				// executar a rotina com delay
				System.out.println("Executando alguma rotina de envio de email");

				try {
					Thread.sleep(2000); //exige encapsulamento de try/catch
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // metodo demanda tratamento com exceção, ctrl click para acessar, ou try catch
					// implementado junto

			}
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			// codigo da rotina a ser executada paralelamente

			for (int i = 0; i < 10; i++) {

				// executar a rotina com delay
				System.out.println("Executando alguma rotina de envio de Nota Fiscal");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // metodo demanda tratamento com exceção, ctrl click para acessar, ou try catch
					// implementado junto
			}
		}
	};
}
