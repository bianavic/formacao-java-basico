package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.exercicio;

import java.util.Random;

public class ProcessoSeletivo4 {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentado = true;
        boolean atendeu = false;

        do {
            // precisarao sofrer alteracoes para nao gerar loop
            atendeu = atender();
            continuarTentado = !atendeu;

            // se continuar tentando
            if (continuarTentado) {
                tentativasRealizadas++; // serao apenas 3 tentativas
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentado && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}
