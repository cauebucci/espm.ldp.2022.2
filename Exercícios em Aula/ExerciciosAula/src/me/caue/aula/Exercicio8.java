package me.caue.aula;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		double r, h, area, latas, valor;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o raio do cilíndro: ");
		r = teclado.nextDouble();
		
		System.out.print("Digite a altura do cilíndro: ");
		h = teclado.nextDouble();
		
		area = 2*Math.PI*r*(h+r);
		
		latas = ((area/3)/5);
		valor = latas*220;
		System.out.println("Será preciso de " + String.format("%.2f", latas) + " latas de tinta. E o valor gasto nelas será R$ " + String.format("%.2f", valor) + "."); 
	}
}
