package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Digite o numero da conta: ");
		int number = sc.nextInt();
		System.out.println("Digite o nome do titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Deseja fazer um deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println("Entre com o valor inicial a ser depositado: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
		   account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a new deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a whitdraw value: ");
		double whitdrawValue = sc.nextDouble();
		account.whitdraw(whitdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();

	}
}
