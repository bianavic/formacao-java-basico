package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.condicionais.condicionalcomposta;

// uma variavel
public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota1 = 6;
        int nota2 = 8;

        // CONTROLE DE FLUXO COMPOSTO

        // possui fluxo condicao verdadeira + fluxo condicao composta
        // se dentro do if-else existe mais de uma instrucao, precisa criar bloco com {}

        if (nota1 >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        if (nota2 >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        // EXERCIO ANTERIOR
        double saldo1 = 10.0;
        double valorSolicitado1 = 17.0;

        if (valorSolicitado1 < saldo1) {
            saldo1 = saldo1 - valorSolicitado1;
            System.out.println("Novo saldo " + saldo1);
        } else
            System.out.println("Saldo Insuficiente");
    }

}
