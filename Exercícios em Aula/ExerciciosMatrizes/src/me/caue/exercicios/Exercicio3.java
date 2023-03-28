package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int alunos;
		System.out.print("Qual a quantidade de alunos na sala? ");
		alunos = teclado.nextInt();

		double[][] notas = new double[alunos][3];
		String[] NomeAlunos = new String[alunos];
		for (int i = 0; i < notas.length; i++) {
			System.out.println((i + 1) + "º Aluno:");
			System.out.print("  Nome: ");
			teclado.nextLine();
			NomeAlunos[i] = teclado.nextLine();
			for (int j = 0; j < notas[i].length; j++) {
				if (j <= 1) {
					System.out.print("  " + (j+1) + "º Prova: ");
					notas[i][j] = teclado.nextDouble();
				}else {
					System.out.print("  1º Trabalho: ");
					notas[i][j] = teclado.nextDouble();
				}
			}
		}
		System.out.println("\n");
		System.out.println("Aluno\t1º Prova\t2º Prova\t1º Trabalho\tMédia\tSituação");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(NomeAlunos[i] + "\t");
			double media = 0;
			double aux = 0;
			for (int j = 0; j < notas[i].length; j++) {
				aux = notas[i][j] + aux;
				System.out.print(String.format("%.2f", notas[i][j]) + "	   \t");
			}
			media = aux/3;
			System.out.print(String.format("%.2f", media) + "\t");
			if(media >= 7) {
				System.out.print("Aprovado 	   \t");
			}else {
				System.out.print("Reprovado 	   \t");
			}
			System.out.println();
		}
		
	
	}
}
