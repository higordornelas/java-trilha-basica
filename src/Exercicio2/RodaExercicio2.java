package Exercicio2;

public class RodaExercicio2 {
    public static void exercicio2() {
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("Higor", 27, 1.70f);
        agenda.armazenaPessoa("Marcelo", 38, 1.82f);
        agenda.armazenaPessoa("Saymon", 10, 0.30f);
        agenda.removePessoa("Marcelo");
        agenda.buscaPessoa("Higor");
        agenda.imprimeAgenda();
        agenda.imprimePessoa(0);
    }
}
