package me.caue.aula;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int binario, n1, n2, n3, n4;
		double resultado;
		
		System.out.print("Digite o valor em binário com 4 dígitos: ");
		binario = teclado.nextInt();
		
		n1 = binario/1000;
		n2 = (binario%1000)/100;
		n3 = ((binario%1000)%100)/10;
		n4 = binario%10;
		
		resultado = (Math.pow(2, 3)*n1) + (Math.pow(2, 2)*n2) + (Math.pow(2, 1)*n3) + (Math.pow(2, 0)*n4);
		System.out.println(n1 + "" + n2 + "" + n3 + "" + n4);
		System.out.println("O número decimal vai ser: " +  resultado);
	}

}
