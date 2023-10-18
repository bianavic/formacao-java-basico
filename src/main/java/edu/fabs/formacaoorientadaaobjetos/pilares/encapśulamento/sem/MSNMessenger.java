package edu.fabs.formacaoorientadaaobjetos.pilares.encapśulamento.sem;

public class MSNMessenger {

    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }

//    public void enviarMensagem() {
//        //primeiro confirmar se esta conectado a internet
//        validarConectadoInternet();
//
//        System.out.println("Enviando mensagem");
//
//        //depois de enviada, salva o histórico da mensagem
//        salvarHistoricoMensagem();
//
//
//    }
//    public void receberMensagem() {
//        System.out.println("Recebendo mensagem");
//    }
//
//    //métodos privadas, visíveis somente na classe
//    private void validarConectadoInternet() {
//        System.out.println("Validando se está conectado a internet");
//    }
//    private void salvarHistoricoMensagem() {
//        System.out.println("Salvando o histórico da mensagem");
//    }

}
