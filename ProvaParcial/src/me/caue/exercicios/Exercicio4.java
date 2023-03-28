package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int qntModelos;
		
		System.out.print("Quantos modelos serão produzidos? ");
		qntModelos = teclado.nextInt();
		
		int[][] modelo = new int[qntModelos][2];
		
		for (int i = 0; i < modelo.length; i++) {
			System.out.println("Modelo " + (i+1) + ":");
			for (int j = 0; j < modelo[i].length; j++) {
				if(j == 0) {
					System.out.print("  Válvulas: ");
					modelo[i][j] = teclado.nextInt();
				}else {
					System.out.print("  Alto falantes: ");
					modelo[i][j] = teclado.nextInt();
				}		
			}
		}
		
		int qntMeses;
		System.out.print("\nAgora digite a quantidade de meses que serão utilizados para a estimativa: ");
		qntMeses = teclado.nextInt();
		
		int[][] meses = new int[qntMeses][qntModelos];
		
		int[][] total = new int[qntMeses][2];
		System.out.println("\nAgora digite a quantidade de modelos que serão fabricados em cada mês:");
		for (int i = 0; i < meses.length; i++) {
			System.out.println((i+1) + "º mês:");
			int valvulas = 0;
			int altofalantes = 0;
			for (int j = 0; j < meses[i].length; j++) {
				System.out.print("  Modelo " + (j+1) + ": ");
				meses[i][j] = teclado.nextInt();
				valvulas = valvulas +  (meses[i][j] * modelo[j][0]);
				altofalantes = altofalantes +  (meses[i][j] * modelo[j][1]);
			}
			for (int j = 0; j < total.length; j++) {
				if(j == 0) {
					total[i][j] = valvulas;
				}else {
					total[i][j] = altofalantes;
				}
				
			}
		}
		
		for (int i = 0; i < total.length; i++) {
			System.out.println("\nMês " + (i+1) + ": ");
			for (int j = 0; j < total.length; j++) {
				if(j == 0) {
					System.out.println("  Válvulas: " + total[i][j]);
				}else {
					System.out.println("  Alto falantes: " + total[i][j]);
				}
			}
		}
		
	}
	

}
