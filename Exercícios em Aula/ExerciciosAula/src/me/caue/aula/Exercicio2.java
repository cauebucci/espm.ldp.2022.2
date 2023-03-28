/*
 * Programa de calcular a �rea e o per�metro de um ret�ngulo
 */

package me.caue.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		double altura, largura, areaResultado, perimetroResultado;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Altura do ret�ngulo: ");
		altura = teclado.nextDouble();
		System.out.print("Largura do ret�ngulo: ");
		largura = teclado.nextDouble();
			
		areaResultado = altura * largura;
		perimetroResultado = 2 * (altura + largura);
		
		System.out.println("");
		System.out.println("=================================================");
		System.out.println("");
		System.out.println("Dimens�o do ret�ngulo: " + String.format("%.2f", altura) + " X " + String.format("%.2f", largura));
		System.out.println("");
		System.out.println("�rea: " + String.format("%.2f", areaResultado));
		System.out.println("Per�metro: " + String.format("%.2f", perimetroResultado) );
		System.out.println("");
		System.out.println("=================================================");

	}

}
