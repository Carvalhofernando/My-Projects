package financeiro;

public class Pagamento {

	public static void main(String[] args) {

		Saldo ponteiro = new Saldo();
		double compras = 2000.00;

		if (ponteiro.saldo >= compras) {
			double saldoAtual = ponteiro.saldo-= compras;
			System.out.println("Compra realizada com sucesso, seu saldo atual é de R$ " + saldoAtual);

		}else
			System.out.println("Saldo insuficiente, operacao negada");

		{

		}

	}

}
