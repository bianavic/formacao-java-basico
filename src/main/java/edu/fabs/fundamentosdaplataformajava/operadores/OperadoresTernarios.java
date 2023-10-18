package edu.fabs.fundamentosdaplataformajava.operadores;

public class OperadoresTernarios {

    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        // String resultado = "";

        // ESTRUTURA IF/ELSE
//        if (a == b)
//            resultado = "verdadeiro";
//        else
//            resultado = "falso";
//
//        System.out.println(resultado);


        // TERNARIO
        String resultado = a==b ? "verdadeira" : "falso"; // a primeira expressao é sempre booleana
        System.out.println(resultado);
    }

}
