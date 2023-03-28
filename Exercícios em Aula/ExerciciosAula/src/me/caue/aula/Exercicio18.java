package me.caue.aula;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		int a, b, c, d;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor --> ");
		a = teclado.nextInt();
		
		System.out.print("Digite o segundo valor --> ");
		b = teclado.nextInt();
		
		System.out.print("Digite o terceiro valor --> ");
		c = teclado.nextInt();
		
		if(a > b) {
			d = a;
			a = b;
			b = d;
			
		}
		
		if(a > c) {
			d = a;
			a = c;
			c = d;
		}
		
		if(b > c) {
			d = b;
			b = c;
			c = d;
		}
		
		System.out.println("1: " + a + " 2: " + b + " 3: " + c);
		
	}
}
