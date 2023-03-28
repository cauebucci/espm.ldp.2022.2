package me.caue.exercicios.vetores;

import java.util.Scanner;

public class ExercicioExtra3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] valores = new int[10];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			valores[i] = teclado.nextInt();
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.println(inverter(valores)[i]);
		}
		
	}
	
	public static int[] inverter(int[] valores) {
		for (int i = 0; i < valores.length; i++) {
			int aux = 0;
			for (int j = 0; j < valores.length; j++) {
				aux = valores[i];
				valores[i] = valores[i+1];
				valores[i+1] = aux;
			}
		}
		return valores;
	}
}
