package Exercicio2;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int setIdade(int idade) {
		this.idade = idade;
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
