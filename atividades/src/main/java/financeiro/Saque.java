package financeiro;

public class Saque {

	public static void main(String[] args) {
		
		Saldo ponteiro = new Saldo();
		double caixaEletronico = 500.00;
		
		if (ponteiro.saldo>= caixaEletronico) {
			double saldoAtual = ponteiro.saldo -= caixaEletronico;

			System.out.println("Compra realizada com sucesso seu saldo atual é " + saldoAtual);

		} else
			System.out.println("Saldo insuficiente, operacao negada");

		{

		}

			
		
		
	} 
	
		
}
