package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		
		System.out.println("1º vetor:");
		coletar(vetor1);
		System.out.println("\n2º vetor:");
		coletar(vetor2);
		
		
		System.out.println("\nO número " + vetor1[0] + " se repete " + qntNumeros(vetor1, vetor2, 0) + " vezes.");
		
	}
	
	public static void coletar(int[] vetor) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			vetor[i] = teclado.nextInt();
		}
		
		
	}
	
	public static int qntNumeros(int[] vetor1, int[] vetor2, int posicao) {
		int qnt = 0;
		
		for (int i = 0; i < vetor2.length; i++) {
			if(vetor2[i] == vetor1[posicao]) {
				qnt++;
			}
		}
		return qnt;
	}

}
