package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.exercicio;

public class ProcessoSeletivo3 {

    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de iteracao for/each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

}
