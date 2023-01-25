package main;

import java.util.Scanner;

import entidades.Conta;
import exceptions.SaldoException;

public class ContaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os dados da conta: ");
		System.out.print("Numero: ");
		Integer numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String nome = sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		Double saldo = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		Double limSaque = sc.nextDouble();
		
		Conta conta = new Conta(numConta, nome, saldo, limSaque);
		
		System.out.print("Digite quantia para o saque: ");
		Double quantSaque = sc.nextDouble();
		
		try {
			conta.saque(quantSaque);
			System.out.printf("Saldo apos saque: $ %.2f \n");
		}catch(SaldoException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
