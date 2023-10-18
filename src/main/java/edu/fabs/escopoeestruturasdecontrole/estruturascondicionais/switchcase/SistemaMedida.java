package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.switchcase;

public class SistemaMedida {

    // MODO CONDICIONAL SWITCH / CASE

    public static void main(String[] args) {

        // NAO É O MELHOR CENARIO
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

    }

}
