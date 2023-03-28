/*
 * Programa de calcular a área e o perímetro de um retângulo
 */

package me.caue.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		double altura, largura, areaResultado, perimetroResultado;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Altura do retângulo: ");
		altura = teclado.nextDouble();
		System.out.print("Largura do retângulo: ");
		largura = teclado.nextDouble();
			
		areaResultado = altura * largura;
		perimetroResultado = 2 * (altura + largura);
		
		System.out.println("");
		System.out.println("=================================================");
		System.out.println("");
		System.out.println("Dimensão do retângulo: " + String.format("%.2f", altura) + " X " + String.format("%.2f", largura));
		System.out.println("");
		System.out.println("Área: " + String.format("%.2f", areaResultado));
		System.out.println("Perímetro: " + String.format("%.2f", perimetroResultado) );
		System.out.println("");
		System.out.println("=================================================");

	}

}
