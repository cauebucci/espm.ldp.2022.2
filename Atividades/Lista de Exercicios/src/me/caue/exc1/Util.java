package me.caue.exc1;

import static javax.swing.JOptionPane.*;

import java.util.Random;

import static java.lang.Integer.*;

public class Util {
	private Passagem[] passagem = new Passagem[5];
	
	
	public void inserir() {
		Random gerador = new Random();
		for (int i = 0; i < passagem.length; i++) {
			passagem[i] = new Passagem();
			showMessageDialog(null, (i+1) + "º Passageiro");
			passagem[i].numero = gerador.nextInt(1000, 9999);
			passagem[i].nome = showInputDialog("Qual o nome do passageiro? ");
			passagem[i].idade = parseInt(showInputDialog("Qual a idade do passageiro? "));
			passagem[i].destino = showInputDialog("Qual o destino do passageiro? ");
			
		}
	}
	
	public void imprimirPassageiro() {
		double media = 0;
		String aux = "Passagens:\n\n";
		for (int i = 0; i < passagem.length; i++) {
			media += passagem[i].idade;
		}
		
		media /= passagem.length;
		
		for (int i = 0; i < passagem.length; i++) {
			if(passagem[i].idade > media) {
				aux += "  Nome: " + passagem[i].nome + "\n  Idade: " + passagem[i].idade + "\n  Destino: " + passagem[i].destino + "\n\n";
			}
		}
		
		
		showMessageDialog(null, aux);
	}
}
