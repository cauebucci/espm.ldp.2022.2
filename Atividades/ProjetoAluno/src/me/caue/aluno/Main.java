package me.caue.aluno;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno[] aluno = new Aluno[3];

		for (int i = 0; i < aluno.length; i++) {
			aluno[i] = new Aluno();
			System.out.println(i+1 + " Aluno:");
			System.out.print("  RA: ");
			aluno[i].ra = teclado.nextInt();
			teclado.nextLine();
			System.out.print("  Nome: ");
			aluno[i].nome = teclado.nextLine();
			System.out.print("  1º Nota: ");
			aluno[i].nota1 = teclado.nextDouble();
			System.out.print("  2º Nota: ");
			aluno[i].nota2 = teclado.nextDouble();
		}
		System.out.println("RA   \tAluno      \tNota 1   \tNota 2   \tMédia   ");
		for (int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i].ra + "   \t" + aluno[i].nome + "      \t" + aluno[i].nota1 + "   \t" + aluno[i].nota2 + "   \t" + String.format("%.2f", aluno[i].media()) );
			
		}
	}
}
