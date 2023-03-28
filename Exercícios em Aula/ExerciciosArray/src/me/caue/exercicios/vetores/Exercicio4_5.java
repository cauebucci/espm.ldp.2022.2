package me.caue.exercicios.vetores;

import java.util.Scanner;

public class Exercicio4_5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String[] semana = {"segunda-feira", "ter�a-feira", "quarta-feira", "quinta-feira", "sexta-feira", "s�bado", "domingo"};
		double[] temperaturas = new double[7];
		
		double media = 0;
		
		for(int i = 0; i <= 6; i++) {
			if(i > 4) {
				System.out.print("Que temperatura fez no " + semana[i] + "? ");
			}else {
				System.out.print("Que temperatura fez na " + semana[i] + "? ");
			}
			
			temperaturas[i] = teclado.nextDouble();
			media = temperaturas[i] + media;
		}
			media = media/7;
			System.out.println("");
			System.out.println("=================================");
			System.out.println("");
		for(int i = 0; i <= 6; i++) {
			System.out.println(semana[i] + " ---------- " + String.format("%.2f",temperaturas[i]) + "�");
		}
		System.out.println("");
		System.out.println("Temperatura m�dia ---------- " + String.format("%.2f", media) + "�");
		System.out.println("");
		System.out.println("Dias que a temperatura ficou acima da m�dia:");
		for(int i = 0; i <= 6; i++) {
			if(temperaturas[i] > media) {
				System.out.println("  " + semana[i] + " ---------- " + String.format("%.2f",temperaturas[i]) + "�");
			}
		}
		System.out.println("");
		System.out.println("=================================");
		
		
	}

}
