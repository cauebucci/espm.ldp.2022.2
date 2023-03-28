package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Que numero você deseja pegar os divisores? ");
			n = teclado.nextInt();
			if(n <= 0) {
				System.out.println("\nO valor precisa ser positivo.");
			}
		}while(n <= 0);
		
		
		System.out.println("Os divisores do número " + n + " são: " + divisores(n));
	}
	
	public static String divisores(int numero) {
		String retorno = "";
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				retorno = retorno + i + " ";
			}
		}
		return retorno;
	}

}
