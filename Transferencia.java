package financeiro;

public class Transferencia {

	public static void main(String[] args) {

		Saldo ponteiro = new Saldo();
		double pix = 1000.00;
		
		if (ponteiro.saldo>= pix) {
			double saldoAtual = ponteiro.saldo -= pix;

			System.out.println("Transferencia realizada com sucesso seu saldo atual é " + saldoAtual);

		} else
			System.out.println("Saldo insuficiente, operacao negada");

		{

		}


	}

}
