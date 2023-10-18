package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.condicionalencadeada;

public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota1 = 6;

        // CONTROLE DE FLUXO ENCADEADO

        if (nota1 >= 7)
            System.out.println("Aprovado");
        else if (nota1 >= 5 && nota1 < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

    }

}
