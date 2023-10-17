package edu.fabs.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numero2? " + simNao);

        if (numero1 < numero2) {
            System.out.println("a nossa condicao é verdadeira");
        }

        // comparar textos, objetos -> quando entram as classes
        // no caso de objetos ou textos -> utilizamos EQUALS
        String nomeUm = "Nero";
        // String nomeDois = "Nero";
        String nomeDois = new String("Nero");
        System.out.println(nomeUm.equals(nomeDois)); // consegue comparar conteudos
        System.out.println(nomeUm == nomeDois); // false: sao 2 objetos em memoria, por isso nao compara o conteudo (stack? vs heap)
    }

}
