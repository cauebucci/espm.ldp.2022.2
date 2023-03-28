package me.caue.aula;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int resultado, x;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número entre 60 e 0: ");
		x = teclado.nextInt();
		
		resultado = (x+1)%61;
		System.out.println(resultado);
	}

}
