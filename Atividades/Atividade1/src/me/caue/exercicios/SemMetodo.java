package me.caue.exercicios;

import java.util.Scanner;

public class SemMetodo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual a quantidade de salas de aula? ");
		int salas = teclado.nextInt();
		System.out.println("");
		int[] sala = new int[salas];
		double[] media = new double[salas];
		double amedia = 0;
		int bmedia = 0;
		int alunos = 0;
		for(int i = 0; i < sala.length; i++) {
			System.out.print("Quantos alunos estudam na " + (i+1) + "º sala? ");
			sala[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Tudo certo! Agora vamos começa...");
		System.out.println("");
		System.out.println("A seguir, digite a nota de cada aluno de cada sala.");
		for(int i = 0; i < sala.length; i++) {
			System.out.println(i+1 + "º sala:");
			amedia = 0;
			alunos = 0;
			int[] notas = new int[sala[i]];
			for(int x = 0; x < sala[i]; x++) {	
				do {
					System.out.print(" " + (x+1) + "º aluno: ");
					bmedia = teclado.nextInt();
					notas[x] = bmedia;
					if(bmedia > 100 || bmedia < 0) {
						System.out.println(" A nota do aluno deve ser entre 0 e 100");
					}
				}while(bmedia > 100 || bmedia < 0);
				
				amedia = bmedia + amedia;
			}
			amedia = amedia / sala[i];
			
			for(int j = 0; j < sala[i]; j++) {
				if(notas[j] > amedia) {
					alunos++;
				}
			}
			
			media[i] = 100 * Double.parseDouble(String.valueOf(alunos)) / Double.parseDouble(String.valueOf(sala[i]));
	
		}
		
		System.out.println("");
		System.out.println("===========================");
		System.out.println("");
		System.out.println("Sala || Alunos || Média");
		for(int i = 0; i < sala.length; i++) {
			System.out.println(i+1 + " || " + sala[i] + " || " + String.format("%.3f", media[i])+ "%");
		}
		System.out.println("");
		System.out.println("===========================");
		
	}
}
