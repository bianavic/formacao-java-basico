package edu.fabs.fundamentosdaplataformajava.exercicio;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        // volume 25
        smartTv.diminuirVolume(); // 24
        smartTv.diminuirVolume(); // 23
        smartTv.diminuirVolume(); // 22
        smartTv.aumentarVolume(); // 23

        System.out.println("Canal atual? " + smartTv.canal);
        smartTv.mudarDeCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.aumentarDeCanal();
        smartTv.aumentarDeCanal();
        System.out.println("Canal atual? " + smartTv.canal);


        System.out.println("Volume atual é: " + smartTv.volume);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        // metodo sem parametro
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);


    }

}
