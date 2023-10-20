package edu.fabs.formacaoorientadaaobjetos.desafio.iphone.mp3;

public class IPod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCANDO NO IPOD");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO IPOD");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA NO IPOD");
    }

}
