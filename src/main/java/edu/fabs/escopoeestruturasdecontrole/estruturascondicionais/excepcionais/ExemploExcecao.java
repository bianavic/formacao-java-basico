package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.excepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    /**
     * linhas 3 e 5, apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar
     * uma exceção checada, logo, nós programadores que iremos usar este método, teremos que tratá-la explicitamente
     * com try \ catch.
     */

//    public static void main(String[] args) {
//
//        // erro [NumberFormatException] herda de RUNTIMEEXCEPTION
//
//        // nao nos preocupamos em pedir para ser tratada
//
//        // tenta converter valor "a1.75" para numero
//        // NumberFormatException: For input string: "a1.75"
//        Number valor = Double.valueOf("a1.75");
//        System.out.println(valor);
//    }

    public static void main(String[] args) {

        // o codigo sinaliza tratamento da excecao
        Number valor = null;

        try {

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
