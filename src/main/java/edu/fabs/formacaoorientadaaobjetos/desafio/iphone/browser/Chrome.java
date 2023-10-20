package edu.fabs.formacaoorientadaaobjetos.desafio.iphone.browser;

public class Chrome implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA INTERNET NO NAVEGADOR DO CHROME");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR DO CHROME");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA DO NAVEGADOR DO CHROME");
    }

}
