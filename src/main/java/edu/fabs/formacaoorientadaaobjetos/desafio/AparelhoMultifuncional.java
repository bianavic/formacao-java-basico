package edu.fabs.formacaoorientadaaobjetos.desafio;

import edu.fabs.formacaoorientadaaobjetos.desafio.browser.NavegadorInternet;
import edu.fabs.formacaoorientadaaobjetos.desafio.browser.Chrome;
import edu.fabs.formacaoorientadaaobjetos.desafio.celular.AparelhoTelefonico;
import edu.fabs.formacaoorientadaaobjetos.desafio.celular.CelularBasico;
import edu.fabs.formacaoorientadaaobjetos.desafio.mp3.IPod;
import edu.fabs.formacaoorientadaaobjetos.desafio.mp3.ReprodutorMusical;
import edu.fabs.formacaoorientadaaobjetos.desafio.smartphone.IPhone;

public class AparelhoMultifuncional {

    public static void main(String[] args) {

        System.out.println("### reprodutor musical ###");
        ReprodutorMusical reprodutorMusical = new IPod();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        System.out.println("---------------------------");
        System.out.println("### aparelho telefonico ###");
        AparelhoTelefonico aparelhoTelefonico = new CelularBasico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioDeVoz();
        aparelhoTelefonico.atender();
        System.out.println("---------------------------");
        System.out.println("### navegador internet ###");
        NavegadorInternet navegadorInternet = new Chrome();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        System.out.println("---------------------------");
        System.out.println("### aparelho multifuncional ###");
        IPhone iPhone = new IPhone();
        ReprodutorMusical musica = iPhone;
        AparelhoTelefonico telefone = iPhone;
        NavegadorInternet internet = iPhone;
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

        internet.exibirPagina();
        internet.atualizarPagina();
        internet.adicionarNovaAba();
    }

}
