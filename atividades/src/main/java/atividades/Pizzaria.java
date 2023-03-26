package atividades;

public class Pizzaria {

	public static void main(String[] args) {

		// Escolha aqui o seu pedido
		String pizzaEscolhida = "Calabresa";
		int quantidade = 2;
		
		double mussarela = 39.90;
		double calabresa = 49.90;
		double meioAMeio = 59.90;

		switch (pizzaEscolhida) {
		case "Mussarela":
			mussarela *= quantidade;
			System.out.println("Pizza de " + pizzaEscolhida + " no valor de " + mussarela + " vendida com sucesso");
			break;
		}

		switch (pizzaEscolhida) {
		case "Calabresa":
			calabresa *= quantidade;
			System.out.println("Pizza de " + pizzaEscolhida + " no valor de " + calabresa + " vendida com sucesso");
			break;
		}
		switch (pizzaEscolhida) {
		case "Meio a Meio":
			meioAMeio *= quantidade;
			System.out.println("Pizza de " + pizzaEscolhida + " no valor de " + meioAMeio + " vendida com sucesso");
			break;
		default:

		}

	}

}
