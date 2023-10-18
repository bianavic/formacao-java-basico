package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.switchcase;

public class SistemaMedida {

    // MODO CONDICIONAL SWITCH / CASE

//    public static void main(String[] args) {
//
//        // NAO É O MELHOR CENARIO
//        String sigla = "M";
//
//        switch (sigla) {
//            case "P":{
//                System.out.println("PEQUENO");
//                break;
//            }
//            case "M":{
//                System.out.println("MÉDIO");
//                break;
//            }
//            case "G":{
//                System.out.println("GRANDE");
//                break;
//            }
//            default:
//                System.out.println("INDEFINIDO");
//        }
//
//    }

    public static void main(String[] args) throws Exception {
        int idade = 14;
        if(idade >= 16)
            System.out.println("Vá para a piscina de adultos");
        else
            System.out.println("Vá para a piscina de de crianças");
    }

}
