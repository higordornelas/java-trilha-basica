package Principal;

import java.util.Scanner;
import Exercicio1.RodaExercicio1;
import Exercicio2.RodaExercicio2;
import Exercicio3.RodaExercicio3;
import Exercicio4.RodaExercicio4;
import Exercicio5.RodaExercicio5;

public class Principal {

	public static void main(String[] args) {
		int exercicioInserido;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o exercicio desejado, de 1 a 5:");
		exercicioInserido = sc.nextInt();
		System.out.println("-------------------------------");

		switch (exercicioInserido) {
			case(1):
				RodaExercicio1.exercicio1();
				break;
			case(2):
				RodaExercicio2.exercicio2();
				break;
			case(3):
				RodaExercicio3.exercicio3();
				break;
			case(4):
				RodaExercicio4.exercicio4();
				break;
			case(5):
				RodaExercicio5.exercicio5();
				break;

			default:
				throw new IllegalStateException("Insira um valor de 1 a 5! Voce inseriu: " + exercicioInserido);
		}
	}
}
