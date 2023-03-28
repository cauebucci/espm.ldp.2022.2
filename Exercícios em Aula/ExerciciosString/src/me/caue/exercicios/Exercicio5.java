package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String email = "";
		
		System.out.print("Digite o e-mail que deseje validar --> ");
		email = teclado.nextLine();
		
		if(email.contains("@") && !(email.charAt(0) == '@' || email.charAt(email.length()-1) == '@')){
			System.out.println("O e-mail " + email + " é válido.");
		}else {
			System.out.println("O e-mail " + email + " não é válido.");
		}
		
	}

}
