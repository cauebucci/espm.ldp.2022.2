package me.caue.aula;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		double x,y,z;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1� lado do tri�ngulo: ");
		x = teclado.nextDouble();
		
		System.out.print("Digite o 2� lado do tri�ngulo: ");
		y = teclado.nextDouble();
		
		System.out.print("Digite o 3� lado do tri�ngulo: ");
		z = teclado.nextDouble();
		
		if(z<x+y && y<x+z && x<y+z) {
			System.out.println("Este tri�ngulo existe.");
		}else {
			System.out.println("Este tri�ngulo n�o existe.");
		}
	}
}
