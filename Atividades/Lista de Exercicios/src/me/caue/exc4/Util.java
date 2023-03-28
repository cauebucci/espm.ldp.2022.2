package me.caue.exc4;

import static javax.swing.JOptionPane.*;

import java.util.Random;

import static java.lang.Double.*;

public class Util {
	
	
	Produto[] produto = new Produto[5];
	
	public void inserir() {
		Random gerador = new Random();
		for (int i = 0; i < produto.length; i++) {
			produto[i] = new Produto();
			showMessageDialog(null, (i+1) + "º Produto");

			produto[i].codigo = gerador.nextInt(1000, 9999);
			produto[i].nome = showInputDialog("Qual o nome do produto? ");
			produto[i].preco = parseDouble(showInputDialog("Qual o preço do produto? "));
			for (int j = 0; j < produto[i].baixa.length; j++) {
				for (int j2 = 0; j2 < produto[i].baixa[j].length; j2++) {
					produto[i].baixa[j][j2] = gerador.nextInt(0, 100);
				}
			}
			
		}
	}
	
	public void imprimirProduto() {
		int maiorID = 0;
		int aux = 0;
		for (int i = 0; i < produto.length; i++) {
			int totalAux = 0;
			for (int j = 0; j < produto[i].baixa.length; j++) {
				for (int k = 0; k < produto[i].baixa[j].length; k++) {
					totalAux += produto[i].baixa[j][k];
				};
			}
			if(totalAux > aux) {
				maiorID = i;
				aux = totalAux;
			}
			
		}
		
		showMessageDialog(null, "Produto mais vendido: \n\n" + "  Código: " + produto[maiorID].codigo + "\n  Produto: " + produto[maiorID].nome + "\n  Preço: " + produto[maiorID].preco + "\n  Baixa: " + aux );
	}
	
}
