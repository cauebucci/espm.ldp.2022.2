package me.caue.exercicios;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		do {
		int n;
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		if(n < 97) {
			n = (n-97)+123;
		}else {
			System.out.println(n);
		}
		System.out.println(n);
		}while(true);
	}
}
