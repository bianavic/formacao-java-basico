package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.exercicio;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {

        // poderia usar o for, mas dependeria de verificacoes
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0; // por eqto nao tenho nenhum candidato selecionado
        int candidatoAtual = 0; // o indice do array que iremos incrementar
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual]; // o candidato atual é zero, o FELIPE
            double salarioPretendido = valorPretendido(); // me de o salario pretendido

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++; // ja foi selecionado 1 candidato
            }
            candidatoAtual++; // verificar os demais candidatos
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
