package me.caue.aula;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		String situacao;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = teclado.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		if(media >= 7) {
			situacao = "Aprovado";
		}else {
			situacao = "Reprovado";
		}
		
		System.out.println("==========================");
		System.out.println("Nota 1 - " + nota1);
		System.out.println("Nota 2 - " + nota2);
		System.out.println("Nota 3 - " + nota3);
		System.out.println("");
		System.out.println("Média - " + String.format("%.2f", media));
		System.out.println("");
		System.out.println("Situação: " + situacao);
		System.out.println("==========================");
	}
}
