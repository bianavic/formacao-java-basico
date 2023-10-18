package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.condicionalsimples;

// escopo de metodo
// 2 variaveis locais
public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo1 = 25.0;
        double valorSolicitado1 = 17.0;

        // CONTROLE DE FLUXO SIMPLES

        // condicao precisa ser verdadeira para q a instrucao abaixo seja executada
        if (valorSolicitado1 < saldo1)
            saldo1 = saldo1 - valorSolicitado1;
        System.out.println(saldo1);

        double saldo2 = 25.0;
        double valorSolicitado2 = 26.0;

        // resultado mesmo al anterior = 25.0
        // controle de fluxo nao entrou nessa jornada
        if (valorSolicitado2 < saldo2)
            saldo2 = saldo2 - valorSolicitado2;
        System.out.println(saldo2);

    }

}
