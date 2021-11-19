package Exercicio5;

import java.util.ArrayList;

public class Caminhao {

    private String tipoCaminhao;
    private int numeroPluviometros;
    private int capacidadeTotal;

    private ArrayList<Pluviometro> listaPluviometro = new ArrayList<Pluviometro>();

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public int getNumeroPluviometros() {
        return numeroPluviometros;
    }

    public void setNumeroPluviometros(int numeroPluviometros) {
        this.numeroPluviometros = numeroPluviometros;
    }

    public int getCapacidadeTotal() { return capacidadeTotal;    }

    public void setCapacidadeTotal(int capacidadeTotal) { this.capacidadeTotal = capacidadeTotal;    }

    public void criaPluviometro(String tipo, int capacidade) {
        Pluviometro pluvi = new Pluviometro(tipo, capacidade);
        listaPluviometro.add(pluvi);
    }

    public int calculaCapacidadeTotal() {
        int capTotal = listaPluviometro.stream().mapToInt(Pluviometro::getCapacidade).sum();
        return capTotal;
    }

    public void imprime() {
        listaPluviometro.forEach((Pluviometro) -> {
            System.out.println("Tipo do Pluviometro: " + Pluviometro.getTipo());
            System.out.println("Capacidade do Pluviometro: " + Pluviometro.getCapacidade());
            System.out.println();
        });
    }
}
