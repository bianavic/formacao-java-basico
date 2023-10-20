package edu.fabs.formacaoorientadaaobjetos.desafio.celular;

public class CelularBasico implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("LIGANDO VIA CELULAR MODELO BASICO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO VIA CELULAR MODELO BASICO");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA CELULAR MODELO BASICO");
    }

}
