package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;

		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Haverá um depósito inicial (s/n)? ");
		char resposta = sc.nextLine().charAt(0);
		if (resposta == 's') {
			System.out.print("Entre com o valor inicial: ");
			double valorInicial = sc.nextDouble();
			acc = new Account(numero, nome, valorInicial);
			System.out.println(acc);
		} else {
			acc = new Account(numero, nome);
			System.out.println(acc);
		}
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double deposito = sc.nextDouble();
		acc.deposito(deposito);
		
		System.out.println();
		System.out.print("Conta atualizada: " + acc);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		acc.saque(saque);
		
		System.out.println();
		System.out.print("Conta atualizada: " + acc);

		sc.close();

	}

}
