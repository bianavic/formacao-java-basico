package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.condicaoternaria;

public class PlanoOperadora {

    // MELHOR CENARIO

    public static void main(String[] args) {

        String plano = "T"; // M / T

        /**
         * SEM BREAK: resultado = imprime tudo
         * 5Gb Youtube
         * WhatsApp e Instagram grátis
         * 100 minutos de ligação
         *
         * COM BREAK: resultado = impreme apenas a condicao evrdadeira
         * 5Gb Youtube
         */

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }

    }

    // MODO CONVENCIONAL
    // repeticao de algumas partes: 100 minutos de ligação
//    public static void main(String[] args) {
//        String plano = "M"; //M / T
//
//        if(plano == "B") {
//            System.out.println("100 minutos de ligação");
//        }else if(plano == "M") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("WhatsApp e Instagram grátis");
//        }else if(plano == "T") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("WhatsApp e Instagram grátis");
//            System.out.println("5Gb Youtube");
//        }
//
//    }

}
