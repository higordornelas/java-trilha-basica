package Exercicio5;

import java.util.ArrayList;
import java.util.Comparator;

public class Seletor extends Controle {

    ArrayList<Caminhao> listaCaminhao = new ArrayList<Caminhao>();

    public void insereDados() {

        int i = 0, numP, capP;
        String tipo, tipoP;

        do  {
            System.out.println("Insira o tipo do caminhao ('Alfa', 'Beta' ou 'Fim' para encerrar):");
            tipo = Controle.leString();
            try {
                if(tipo.equals("Alfa") || tipo.equals("Beta")) {
                    listaCaminhao.add(new Caminhao());
                    listaCaminhao.get(i).setTipoCaminhao(tipo);

                    System.out.println("Numero de pluviometros a serem transportados:");
                    numP = Controle.leInteiro();
                    listaCaminhao.get(i).setNumeroPluviometros(numP);

                    try {
                        for (int j = 1; j <= numP; j++) {
                            System.out.println("Insira o tipo do pluviometro '" + j + "' ('Convencional', 'Semiautomatico' ou 'Automatico'):");
                            tipoP = Controle.leString();
                            if(tipoP.equals("Convencional") || tipoP.equals("Semiautomatico") || tipoP.equals("Automatico")) {
                                System.out.println("Insira a capacidade do pluviometro '" + j + "':");
                                capP = Controle.leInteiro();

                                listaCaminhao.get(i).criaPluviometro(tipoP, capP);
                                listaCaminhao.get(i).setCapacidadeTotal(listaCaminhao.get(i).calculaCapacidadeTotal());
                            } else break;
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("-------------------------------");
                    i++;
                }
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        } while (!tipo.equals("Fim"));
    }

    public static Comparator<Caminhao> ComparaCapacidade = new Comparator<Caminhao>() {
        public int compare(Caminhao o1, Caminhao o2) {

            int capacidade1 = o1.getCapacidadeTotal();
            int capacidade2 = o2.getCapacidadeTotal();

            return capacidade2-capacidade1;
        }
    };

    public void selecionaCaminhao() {

        try {
            listaCaminhao.sort(ComparaCapacidade);
            System.out.println("-------------------------------");
            System.out.println("| DADOS DO CAMINHAO ESCOLHIDO |");
            System.out.println("-------------------------------");
            System.out.println("Tipo do caminhao: " + listaCaminhao.get(0).getTipoCaminhao());
            System.out.println("Capacidade total do caminhao: " + listaCaminhao.get(0).getCapacidadeTotal());
            listaCaminhao.get(0).imprime();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}