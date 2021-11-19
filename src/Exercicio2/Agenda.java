package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Pessoa> agenda = new ArrayList<Pessoa>();
	
	public void armazenaPessoa(String nome, int idade, float altura) {
		try {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nome);
			pessoa.setIdade(idade);
			pessoa.setAltura(altura);
			
			agenda.add(pessoa);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void removePessoa(String nome) {
			try {
				for (int i = 0; i < agenda.size(); i++) {
					if(agenda.get(i).getNome() == nome) {
						agenda.remove(i);
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public int buscaPessoa(String nome) {
		try {
			for (int i = 0; i < agenda.size(); i++) {
				if(agenda.get(i).getNome() == nome) {
					return i;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return 0;
	}
	
	public void imprimeAgenda() {
		try {
			for (int i = 0; i < agenda.size(); i++) {
				System.out.println("Nome: " + agenda.get(i).getNome());
				System.out.println("Idade: " + agenda.get(i).getIdade());
				System.out.println("Altura: " + agenda.get(i).getAltura());
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void imprimePessoa(int index) {
		try {
			for (int i = 0; i < agenda.size(); i++) {
				if(i == index) {
					System.out.println("Nome: " + agenda.get(i).getNome());
					System.out.println("Idade: " + agenda.get(i).getIdade());
					System.out.println("Altura: " + agenda.get(i).getAltura());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
