package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
    double mesada = 50.0;

        while(mesada>0) {

            // a variavel condicionalq esteja condicional precisa ser tratada para que se torne falsa.
            // exemplo deste caso, sem o tratamento retorna valor negativo
        Double valorDoce = valorAleatorio();

            // se valor doce for igual a mesada, torna o valor do doce == mesada
            // para nao precisar fazer outra verificacao,
            // se elimina [valorDoce = mesada] gera resultado negativo: Mesada:-3.4495188024332277
            // se elimina toda a validacao [if(valorDoce > mesada) valorDoce = mesada;], gera resultado: Mesada:-4.401318887732861
        if(valorDoce > mesada)
            valorDoce = mesada;

        // enqto o valor dos doces nao igualar R$50,00 adiciona itens ao carrinho
        System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
        mesada = mesada - valorDoce;

    }
        // gastou toda a mesada
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

}

    // cria doces com valores aleatorios

    // STATIC -> pode ser chamado sem criar uma instancia da classe
    // beneficios: eficiência de memória, acesso global, independência de objeto, desempenho e organização de código
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
