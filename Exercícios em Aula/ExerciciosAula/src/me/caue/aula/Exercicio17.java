package me.caue.aula;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		int a, b , c, d;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor --> ");
		a = teclado.nextInt();
		
		System.out.print("Digite o segundo valor --> ");
		b = teclado.nextInt();
		
		System.out.print("Digite o terceiro valor --> ");
		c = teclado.nextInt();
		
		if(a == b || a == c || b == c) {
			System.out.println("Os números precisam ser diferentes!");
		}else {
			if(a < b && a < c) {
				d = a;
			}else if(b < c) {
				d = b;
			}else {
				d = c;
			}
			System.out.println("O menor número entre esses valores é " + d);
		}
		
		
		
	}
}
