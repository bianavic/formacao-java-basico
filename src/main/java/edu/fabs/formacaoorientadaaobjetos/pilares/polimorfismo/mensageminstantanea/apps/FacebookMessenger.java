package edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem do Facebook");
    }

}
