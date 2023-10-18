package edu.fabs.formacaoorientadaaobjetos.pilares.encapśulamento;

public class Carro {

    // ENCAPSULAR -> esconder acoes
    // alteracao de publico para privado


    // ao ligar ja confere cambio e combustivel
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO");
    }

}
