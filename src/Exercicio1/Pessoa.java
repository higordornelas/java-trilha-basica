package Exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private LocalDate nascimento;
	private double altura;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return this.nascimento;
	}
	
	public LocalDate setNascimento(int year, int month, int day) {
		this.nascimento = LocalDate.of(year, month, day);
		return this.nascimento;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimeDados() {
		System.out.println(this.nome);
		System.out.println(this.nascimento);
		System.out.println(this.altura);
	}
	
	public int calculaIdade() {
		Period idade = Period.between(this.nascimento, LocalDate.now());
		return idade.getYears();
	}
	
}
