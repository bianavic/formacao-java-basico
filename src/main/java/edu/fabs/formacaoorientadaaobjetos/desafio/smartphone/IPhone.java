package edu.fabs.formacaoorientadaaobjetos.desafio.smartphone;

import edu.fabs.formacaoorientadaaobjetos.desafio.browser.NavegadorInternet;
import edu.fabs.formacaoorientadaaobjetos.desafio.celular.AparelhoTelefonico;
import edu.fabs.formacaoorientadaaobjetos.desafio.mp3.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("LIGANDO VIA IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGACAO VIA IPHONE");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA INTERNET NO NAVEGADOR DO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR DO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA DO NAVEGADOR DO IPHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA NO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA NO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA NO IPHONE");
    }

}
