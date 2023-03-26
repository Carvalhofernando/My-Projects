package metodos.retorno;

public class MetodosComRetorno {

	public boolean cadastrar(String nome, int idade) {
		boolean cadastro = true;
		if (idade >= 18) {
			System.out.println(nome + " Voce tem " + idade + " anos e esta cadastrado com sucesso");

		} else {
			System.out.println("Não é possível seguir com seu cadastro");

		}

		return cadastro;

	}

}
