package edu.fabs.fundamentosdaplataformajava.escopo;

public class Conta {

    // variavel da classe conta, variavel de escopo de classe
    double saldo = 10.0;

    public void sacar(Double valor) {
        // variavel local de metodo
        // tenho neste metodo 2 variaveis locais
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // disponivel em toda classe
        System.out.println(saldo);

        // System.out.println(novoSaldo); // somente o metodo sacar conhece a variavel novoSaldo
    }

    public double calcularDividaExponencial() {
        // variavel local de metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0; // comecando a variavel

        // variavel de escopo de bloco de funcao
        for (int x = 1; x <= 5; x++) { // variavel x -> de escopo de fluxo
            double valorCalculado = valorParcela * x;
            valorMontante = valorCalculado + valorCalculado;

            // escopo de fluxo
            // x e valorCalculado nunca estarao disponiveis fora do bloco
        }

        // unica variavel q consegue ser visualizada apos a execucao de um bloco de codigo
        return valorMontante;
    }

}
