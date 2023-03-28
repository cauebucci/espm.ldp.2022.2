package me.caue.exercicios.vetores;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean achei;
		Random gerador = new Random();
		int qnt;
		System.out.print("Digite quantos números deseja gerar --> ");
		qnt = teclado.nextInt();
		
		int[] numeros = new int[qnt];
		
		for(int i = 0; i < numeros.length;) {
			numeros[i] = gerador.nextInt(10);
			achei = false;
			for (int j = 0; j < i; j++) {
				if(numeros[i] == numeros[j]) {
					achei = true;
					break;
				}
			}
			if(achei == false) {
				i++;
			}
		}
		System.out.println("");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(i+1 + ". " + numeros[i]);
		}
	}
}
