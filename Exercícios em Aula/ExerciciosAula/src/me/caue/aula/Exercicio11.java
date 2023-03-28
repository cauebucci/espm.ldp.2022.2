package me.caue.aula;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double aX, aY, bX, bY, distanciaA, distanciaB;
		
		System.out.print("1º coordenada X -> ");
		aX = teclado.nextDouble();
		
		System.out.print("1º coordenada Y -> ");
		aY = teclado.nextDouble();
		
		System.out.print("2º coordenada X -> ");
		bX = teclado.nextDouble();
		
		System.out.print("2º coordenada Y -> ");
		bY = teclado.nextDouble();
		
		distanciaA = Math.sqrt(aX*aX + aY*aY);
		
		distanciaB = Math.sqrt(bX*bX + bY*bY);
		
		if(distanciaA<distanciaB) {
			System.out.println("O ponto A é mais perto.");
		}else {
			System.out.println("O ponto B é mais perto.");
		}
	}
}
