package me.caue.aula;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		double x,y,z;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1º lado do triângulo: ");
		x = teclado.nextDouble();
		
		System.out.print("Digite o 2º lado do triângulo: ");
		y = teclado.nextDouble();
		
		System.out.print("Digite o 3º lado do triângulo: ");
		z = teclado.nextDouble();
		
		if(z<x+y && y<x+z && x<y+z) {
			System.out.println("Este triângulo existe.");
		}else {
			System.out.println("Este triângulo não existe.");
		}
	}
}
