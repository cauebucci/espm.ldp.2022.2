package me.caue.aula;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double aX, aY, bX, bY, distanciaA, distanciaB;
		
		System.out.print("1� coordenada X -> ");
		aX = teclado.nextDouble();
		
		System.out.print("1� coordenada Y -> ");
		aY = teclado.nextDouble();
		
		System.out.print("2� coordenada X -> ");
		bX = teclado.nextDouble();
		
		System.out.print("2� coordenada Y -> ");
		bY = teclado.nextDouble();
		
		distanciaA = Math.sqrt(aX*aX + aY*aY);
		
		distanciaB = Math.sqrt(bX*bX + bY*bY);
		
		if(distanciaA<distanciaB) {
			System.out.println("O ponto A � mais perto.");
		}else {
			System.out.println("O ponto B � mais perto.");
		}
	}
}
