package me.caue.exercicios.vetores;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int[] ns = new int[20];
		String nse = "";
		
		for(int i = 0; i < ns.length; i++) {
			ns[i] = gerador.nextInt(20);
			
		}
		
		int y = 0;
		for(int i = 0; i < ns.length; i++) {
			y=0;
			for(int x = 2; x < ns[i]; x++) {
				if(ns[i] % x == 0 ) {
					y++;
					break;
				}	
			}
			if(y == 0) {
				nse = nse + " " + ns[i];
			}
		}
		System.out.println("\nN�meros primos: " + nse);
	}
}
