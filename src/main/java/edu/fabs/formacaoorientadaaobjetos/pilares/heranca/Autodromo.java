package edu.fabs.formacaoorientadaaobjetos.pilares.heranca;

public class Autodromo {

    public static void main(String[] args) {

        Carro jeep = new Carro();
        jeep.setChassi("83275");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("80799");
    }

}
