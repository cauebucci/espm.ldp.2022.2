package me.caue.aula;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		double a,b,c,d;
		double x1,x2;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = teclado.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = teclado.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		c = teclado.nextDouble();
		
		d = (Math.pow(b, 2))-4*a*c;
		
		x1 = ( -b + Math.sqrt(d) ) / (2*a);
		x2 = ( -b - Math.sqrt(d) ) / (2*a);
		
		
		
		
		System.out.println("");
		System.out.println("==================================");
		System.out.println("");
		System.out.println("x1 = " + String.format("%.2f", x1));
		System.out.println("x2 = " + String.format("%.2f", x2));
		System.out.println("");
		System.out.println("==================================");
		System.out.println("");
	}

}
