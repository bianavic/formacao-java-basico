package edu.fabs.fundamentosdaplataformajava.exercicio;

public class SmartTv {

    // atributos a nivel de classe
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criar os metodos que manipulam esses estados
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        // volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        // volume = volume - 1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // pedindo q Usuario informe o numero do canal
    public void mudarDeCanal(int novoCanal) {
        // atributo a nivel de metodo
        canal = novoCanal;
    }

    public void aumentarDeCanal() {
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuirDeCanal() {
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }


}
