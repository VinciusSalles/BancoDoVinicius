package banco;

import cadastro.Pessoa;


public class Banco {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa("Vinicius", 36, 500144985, 5000);
		novaPessoa.setNome("Vinicius");
		Conta conta01 = new Conta(novaPessoa, 0, 0);
		System.out.println(conta01.getTitular().getNome());
	}

}
