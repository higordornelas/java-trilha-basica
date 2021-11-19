package Exercicio1;

import java.time.LocalDate;

public class RodaExercicio1 {

    public static void exercicio1() {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Fulano");
        pessoa.setNascimento(1994, 03, 18);
        pessoa.setAltura(1.70);

        pessoa.imprimeDados();

        System.out.println(LocalDate.now());
        System.out.println(pessoa.getNascimento());
        System.out.println(pessoa.calculaIdade());
    }
}
