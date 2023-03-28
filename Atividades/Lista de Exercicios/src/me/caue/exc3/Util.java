package me.caue.exc3;
import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;
public class Util {
	Veiculo[] veiculo = new Veiculo[5];
	
	public void inserir() {
		for (int i = 0; i < veiculo.length; i++) {
			String combustivel = "";
			veiculo[i] = new Veiculo();
			showMessageDialog(null, (i+1) + "º veículo");
			veiculo[i].proprietario = showInputDialog("Qual o nome do proprietário do veículo?");
			veiculo[i].placa = showInputDialog("Qual a placa do veículo?");
			veiculo[i].ano = parseInt(showInputDialog("Qual o ano do veículo? "));
			do {
				combustivel = showInputDialog("Qual o tipo de combustível do veículo? ");
				if(!(combustivel.equalsIgnoreCase("álcool") || combustivel.equalsIgnoreCase("diesel") || combustivel.equalsIgnoreCase("gasolina")) ) {
					showMessageDialog(null, "Tipo de combustível inálido!\nTipos disponívéis: álcool, diesel e gasolina");
				}
			}while(!(combustivel.equalsIgnoreCase("álcool") || combustivel.equalsIgnoreCase("diesel") || combustivel.equalsIgnoreCase("gasolina")));
			
			
		}
	}
	
	public void imprimirVeiculos() {
		String aux = "Véiculos com final 9:\n";
		for (int i = 0; i < veiculo.length; i++) {
			String ultima = String.valueOf(veiculo[i].placa.charAt(veiculo[i].placa.length() - 1));
			
			if(ultima.equals("9")) {
				aux += "  Placa: " + veiculo[i].placa + "  \nProprietário: " + veiculo[i].proprietario + "\n\n";
			}
		}
		showMessageDialog(null, aux);
	}
	
	
}
