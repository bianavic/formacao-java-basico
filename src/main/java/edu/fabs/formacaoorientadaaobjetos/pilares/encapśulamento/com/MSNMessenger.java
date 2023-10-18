package edu.fabs.formacaoorientadaaobjetos.pilares.encapśulamento.com;

public class MSNMessenger {

    // ao disparar os metodos publicos, os metodos privados serao executados

    public void enviarMensagem() {

        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");

        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    //métodos privadas, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    //métodos privadas, visíveis somente na classe
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }


//    public void receberMensagem() {
//        System.out.println("Recebendo mensagem");
//    }
//


}
