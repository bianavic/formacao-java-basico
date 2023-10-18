package edu.fabs.formacaoorientadaaobjetos.pilares.abstracao;

public class Autodromo {

    public static void main(String[] args) {

        Carro jeep = new Carro();
        jeep.setChassi("83275");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("80799");
        z400.ligar();

        // abstracao e polimorfismo
        // a classe + especializada tem a acao mas nao sabe como se dara o comportamento, se é moto ou carro
        Veiculo coringa = jeep;
        coringa.ligar();
    }

}
