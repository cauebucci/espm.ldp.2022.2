package me.caue.exercicios.vetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int[] ns = new int[6];
		int pares = 0;
		int impares = 0;
		
		String paresx = "";
		String imparesx = "";
		for(int i = 1; i < ns.length; i++) {
			System.out.print("Digite o " + i + "º número: ");
			ns[i] = teclado.nextInt();
			
			if(ns[i] % 2 == 0) {
				pares++;
				if(i == ns.length - 1) {
					paresx = paresx + ns[i];
				}else {
					paresx = paresx + ns[i] + ", ";
				}
			}else {
				impares++;
				if(i == ns.length - 1) {
					imparesx = imparesx + ns[i];
				}else {
					imparesx = imparesx + ns[i] + ", ";
				}
			}
		}
		System.out.println("");
		System.out.println("==================");
		System.out.println("");
		System.out.println("Pares: " + pares + " (" + paresx + ")");
		System.out.println("Impares: " + impares + " (" + imparesx + ")");
		System.out.println("");
		System.out.println("==================");
		System.out.println("");
	}
}
