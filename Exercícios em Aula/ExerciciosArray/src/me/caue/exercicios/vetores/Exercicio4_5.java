package me.caue.exercicios.vetores;

import java.util.Scanner;

public class Exercicio4_5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String[] semana = {"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado", "domingo"};
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
			System.out.println(semana[i] + " ---------- " + String.format("%.2f",temperaturas[i]) + "º");
		}
		System.out.println("");
		System.out.println("Temperatura média ---------- " + String.format("%.2f", media) + "º");
		System.out.println("");
		System.out.println("Dias que a temperatura ficou acima da média:");
		for(int i = 0; i <= 6; i++) {
			if(temperaturas[i] > media) {
				System.out.println("  " + semana[i] + " ---------- " + String.format("%.2f",temperaturas[i]) + "º");
			}
		}
		System.out.println("");
		System.out.println("=================================");
		
		
	}

}
