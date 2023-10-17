package edu.fabs.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // 2 variaveis que representam 2 estados de condicoes
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("as duas condicoes sao verdadeiras");
        }
//        System.out.println("fim");

        if (condicao1 || condicao2) {
            System.out.println("uma das condicoes é verdadeira");
        }

        if (condicao1 && (7 > 4)) { // uso de uma expressao relacional
            System.out.println("as duas condicoes sao verdadeiras");
        }

        System.out.println("fim");

    }

}
