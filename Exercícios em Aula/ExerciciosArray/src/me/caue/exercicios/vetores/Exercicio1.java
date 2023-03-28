package me.caue.exercicios.vetores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int[] ns = new int[11];
		
		for(int i = 1; i < ns.length; i++) {
			System.out.print("Digite o " + i + "º número: ");
			ns[i] = teclado.nextInt();
			
		}
		
		int maior = 0;
		int menor = 0;
		for(int i = 0; i < ns.length; i++) {
			if(ns[i] < menor || i == 1) {
				menor = ns[i];
			}
			if(ns[i] > maior || i == 1) {
				maior = ns[i];
			}
		}
		
		String nse = "";
		for(int i = 1; i < ns.length; i++) {
			if(i == ns.length - 1) {
				nse = nse + ns[i];
			}else {
				nse = nse + ns[i] + ", ";
			}
		}
		
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Números: " + nse);
		System.out.println("");
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("");
		System.out.println("==========================");
		
		
	}
}
