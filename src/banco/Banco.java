package banco;

import java.util.Locale;
import java.util.Scanner;

import Conta.contaPessoal;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		contaPessoal contaPessoal;
		
		System.out.println("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Existe alguem deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println("Entre com o valor do deposito: ");
			double depositoInicial = sc.nextDouble();
			contaPessoal = new contaPessoal(numero, titular, depositoInicial);
		}
		else {
			contaPessoal = new contaPessoal(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(contaPessoal);
		
		System.out.println();
		System.out.println("Entre com um novo deposito: ");
		double valorDeposito = sc.nextDouble();
		contaPessoal.deposito(valorDeposito);
		System.out.println("Dados atuais da conta: ");
		System.out.println(contaPessoal);
		
		System.out.println();
		System.out.println("Entre com um valor a sacar: ");
		double valorSaque = sc.nextDouble();
		contaPessoal.saque(valorSaque);
		System.out.println("Dados atuais da conta: ");
		System.out.println(contaPessoal);
		
		
		sc.close();

	}
}
