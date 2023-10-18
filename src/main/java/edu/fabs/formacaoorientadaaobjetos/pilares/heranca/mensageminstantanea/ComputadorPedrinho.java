package edu.fabs.formacaoorientadaaobjetos.pilares.heranca.mensageminstantanea;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        System.out.println("FACEBOOK");
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        System.out.println("TELEGRAM");
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }

}
