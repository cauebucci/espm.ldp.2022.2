package me.caue.aula;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		int n;
		boolean c = true;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Digite o número que deseja a tabuada --> ");
			n = teclado.nextInt();
			int i = 0;
			System.out.println("");
			System.out.println("Tabuada do " + n + ":");
			while(i <= 10) {
				System.out.println(n + "x" + i + "= " + n * i);
				i++;
			}
			System.out.println("");
			teclado.nextLine();
			System.out.print("Deseja realizar outra operação? ");
			String resp = teclado.nextLine();
			while(!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("não")) {
				System.out.println("");
				System.out.println("ERRO| Digite apenas sim ou não!");
				System.out.print("Deseja realizar outra operação? ");
				resp = teclado.nextLine();
			}
		    if(resp.equalsIgnoreCase("não")) {
		    	c = false;
		    }
		    System.out.println("");
			
		}while(c);
		
	}
}
