package me.caue.aula;

public class Exercicio25 {

	public static void main(String[] args) {
		double y = 0;
		double i = 1;

		while (i <= 3.0) {
			y = (1.0 / i) + y;
			i++;
		}
		
		
		System.out.println(y);

	}

}
