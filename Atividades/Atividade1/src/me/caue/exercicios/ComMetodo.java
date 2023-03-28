package me.caue.exercicios;

import java.util.Scanner;

public class ComMetodo {
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
		for (int i = 0; i < sala.length; i++) {
			System.out.print("Quantos alunos estudam na " + (i + 1) + "º sala? ");
			sala[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Tudo certo! Agora vamos começa...");
		System.out.println("");
		System.out.println("A seguir, digite a nota de cada aluno de cada sala.");
		for (int i = 0; i < sala.length; i++) {
			System.out.println(i + 1 + "º sala:");
			amedia = 0;
			int[] notas = new int[sala[i]];
			for (int x = 0; x < sala[i]; x++) {
				do {
					System.out.print(" " + (x + 1) + "º aluno: ");
					bmedia = teclado.nextInt();
					notas[x] = bmedia;
					if (ValidarNota(bmedia)) {
						System.out.println(" A nota do aluno deve ser entre 0 e 100");
					}
				} while (ValidarNota(bmedia));

				amedia = bmedia + amedia;
			}
			amedia = Media(amedia, sala[i]);

			media[i] = MediaDaSala(PegarAlunosAcimadaMedia(sala[i], notas, amedia), sala[i]);

		}

		System.out.println("");
		System.out.println("===========================");
		System.out.println("");
		System.out.println("Sala || Alunos || Média");
		System.out.println(Imprimir(sala, media));
		System.out.println("");
		System.out.println("===========================");

	}

	public static double MediaDaSala(int AlunosAcimaDaMedia, int AlunosTotalDaSala) {
		double m;
		m = 100 * Double.parseDouble(String.valueOf(AlunosAcimaDaMedia))
				/ Double.parseDouble(String.valueOf(AlunosTotalDaSala));
		return m;
	}

	public static double Media(double nota, int alunos) {
		double m;
		m = nota / alunos;
		return m;
	}

	public static int PegarAlunosAcimadaMedia(int qntAlunos, int[] notas, double MediaDaSala) {
		int alunos = 0;
		for (int j = 0; j < qntAlunos; j++) {
			if (notas[j] > MediaDaSala) {
				alunos++;
			}
		}
		return alunos;
	}

	public static boolean ValidarNota(int nota) {
		if (nota > 100 || nota < 0) {
			return true;
		} else {
			return false;
		}
	}

	public static String Imprimir(int[] sala, double[] media) {
		String impressao = "";
		for (int i = 0; i < sala.length; i++) {
			if (i < sala.length - 1) {
				impressao = impressao + (i + 1) + " || " + sala[i] + " || " + String.format("%.3f", media[i]) + "%\n";
			} else {
				impressao = impressao + (i + 1) + " || " + sala[i] + " || " + String.format("%.3f", media[i]) + "%";
			}
		}
		return impressao;
	}
}