package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.repeticao;

import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {

        System.out.println("Discando...");

        // eqto estiver ligando, ele aguarda o colega atender

        do {
            //excutando repetidas vezes até alguém atender,
            // qdo atender o DO, o controle de fluxo. é interropido
            System.out.println("Telefone tocando");

        }while(tocando());

        // e finalmente ele parte para a etapa de conversacao
        System.out.println("Alô !!!");
    }

    // enqto for false, continuara tocando
    // valor aleatorio entre 1 e 3, qdo ==1, ele atendeu
    // ou seja, enqto NAO for ==1 ele nao atendeu
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //NEGANDO o ato de continuar tocando
        return ! atendeu; // enqto NAO for ==1 ele nao atendeu
    }

}
