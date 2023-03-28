package me.caue.aula;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double p1, p2, t1, t2, media;
		String situacao;
		
		System.out.print("Nota da prova 1 -> ");
		p1 = teclado.nextDouble();
		
		System.out.print("Nota da prova 2 -> ");
		p2 = teclado.nextDouble();
		
		System.out.print("Nota do trabalho 1 - > ");
		t1 = teclado.nextDouble();
		
		System.out.print("Nota do trabalho 2 - > ");
		t2 = teclado.nextDouble();
		
		media = (((p1+p2)/2)*0.7)+(((t1+t2)/2)*0.3);
		
		if(media >=7) {
			situacao = "Aprovado";
		}else{
			situacao = "Reprovado";
		}
		
		System.out.println("===================");
		System.out.println("");
		System.out.println("Prova 1 - " + String.format("%.2f", p1));
		System.out.println("Prova 2 - " + String.format("%.2f", p2));
		System.out.println("Trabalho 1 - " + String.format("%.2f", t1));
		System.out.println("Trabalho 2 - " + String.format("%.2f", t2));
		System.out.println("");
		System.out.println("Média - " + String.format("%.2f", media));
		System.out.println("");
		System.out.println("Situação: " + situacao);
		System.out.println("");
		System.out.println("===================");
	}
}
