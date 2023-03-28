package me.caue.exc1;

public class Professor {
	String cpf;
	String nome;
	int aula;
	double valor;
	
	public String calcularSalario() {
		double sb, ha, dsr, salario;
		
		sb = aula * 4.5 * valor;
		ha = sb * 5 / 100;
		dsr = (sb + ha) / 6;
		salario = sb + ha + dsr;
		
		return "R$ " + String.format("%.2f", salario);
	}
	
	public String getDados() {
		String aux = "";
		
		aux += "CPF: " + cpf;
		aux += "\nNome: " + nome;
		aux += "\nSalário: " + calcularSalario() + "\n";
		
		return aux;
	}
}
