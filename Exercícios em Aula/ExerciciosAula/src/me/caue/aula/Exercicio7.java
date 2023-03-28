package me.caue.aula;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int qnt, n100, n50, n20, n10, n5, n1;
		
		System.out.print("Digite o valor que deseja sacar: ");
		qnt = teclado.nextInt();
		
		n100 = qnt/100;
		n50 = (qnt%100)/50;
		n20 = ((qnt%100)%50)/20;
		n10 = (((qnt%100)%50)%20)/10;
		n5 = ((((qnt%100)%50)%20)%10)/5;
		n1 = (((((qnt%100)%50)%20)%10)%5)/1;
		
		
		System.out.println("R$100: " + n100);
		System.out.println("R$50: " + n50);
		System.out.println("R$20: " + n20);
		System.out.println("R$10: " + n10);
		System.out.println("R$5: " + n5);
		System.out.println("R$1: " + n1);
	}

}
