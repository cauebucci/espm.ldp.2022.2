package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String data = "";
		String veri1 = "";
		String veri2 = "";
		String mes = "";
		
		do {
			System.out.print("Digite sua data de nascimento: (dd/mm/aaaa) ");
			data = teclado.nextLine();
			if (data.length() > 2) {
				veri1 = String.valueOf(data.charAt(2));
				veri2 = String.valueOf(data.charAt(5));
			}
			if (!(data.length() == 10 || veri1.equals("/") || veri2.equals("/"))) {
				System.out.println("\nFormato inválido. Utilize o formato 'dd/mm/aaaa'");
			}

		} while (!(data.length() == 10 || veri1.equals("/") || veri2.equals("/")));
		
		String[] date = data.split("/");
		
		if(date[1].equals("01")) {
			mes = "Janeiro";
		}else if(date[1].equals("02")) {
			mes = "Fevereiro";
		}else if(date[1].equals("03")) {
			mes = "Março";
		}else if(date[1].equals("04")) {
			mes = "Abril";
		}else if(date[1].equals("05")) {
			mes = "Maio";
		}else if(date[1].equals("06")) {
			mes = "Junho";
		}else if(date[1].equals("07")) {
			mes = "Julho";
		}else if(date[1].equals("08")) {
			mes = "Agosto";
		}else if(date[1].equals("09")) {
			mes = "Setembro";
		}else if(date[1].equals("10")) {
			mes = "Outubro";
		}else if(date[1].equals("11")) {
			mes = "Novembro";
		}else if(date[1].equals("12")) {
			mes = "Dezembro";
		}
		
		System.out.println("Você nasceu no dia " + date[0] + " de " + mes + " de " + date[2]);

	}
}
