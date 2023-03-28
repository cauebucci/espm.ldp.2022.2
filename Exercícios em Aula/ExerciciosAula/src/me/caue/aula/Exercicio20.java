package me.caue.aula;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		String nome;
		double valor, imposto;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome do cliente -> ");
		nome = teclado.nextLine();
		System.out.print("Renda do cliente -> ");
		valor = teclado.nextDouble();
		
		if(valor <= 10000) {
			imposto = 0;
		}else if(valor <= 25000) {
			imposto = valor*10.35/100;
		}else if(valor <= 50000) {
			imposto = valor*25.42/100;
		}else {
			imposto = valor*29.75/100;
		}
		
		System.out.println("===========================");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("");
		System.out.println("Renda: R$" + String.format("%.2f", valor));
		if(imposto <= 0) {
			System.out.println("Imposto: Insento");
		}else {
			System.out.println("Imposto: R$" + String.format("%.2f", imposto));
		}
		System.out.println("");
		System.out.println("===========================");
	}

}
