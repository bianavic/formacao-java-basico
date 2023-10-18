package edu.fabs.formacaoorientadaaobjetos.pilares.encapśulamento.com;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();

        // ao disparar os metodos publicos, os metodos privados serao executados
        msn.enviarMensagem();
        msn.receberMensagem();
    }

}
