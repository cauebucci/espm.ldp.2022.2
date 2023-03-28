package me.caue.aluno;

public class Aluno {
	
	int ra;
	String nome;
	double nota1;
	double nota2;
	
	
	public double media() {
		double media = (nota1+nota2)/2;
		return media;
	}
	public String situacao() {
		return (media() > 7 ? "Aprovado" : "Reprovado");
	}
}
