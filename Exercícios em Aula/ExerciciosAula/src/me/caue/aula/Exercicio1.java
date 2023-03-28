package me.caue.aula;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		// Declaração de vavriáveis
		double nota1,nota2,nota3, media;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		// Entrada de dados
		System.out.print("Digite a 1a nota: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a 2a nota: ");
		nota2 = teclado.nextDouble();
		System.out.print("Digite a 3a nota: ");
		nota3 = teclado.nextDouble();
		
		// Processamento de dados
		media = (nota1 + nota2 + nota3) / 3;
		
		// Saída de dados

		System.out.println("");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("1a nota: " + nota1);
		System.out.println("2a nota: " + nota2);
		System.out.println("3a nota: " + nota3);
		System.out.println("");
		System.out.println("A média da nota é " + media);
		System.out.println("");
		System.out.println("===================================");
	}
}
