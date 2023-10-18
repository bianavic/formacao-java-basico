package edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea;


import edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea.apps.FacebookMessenger;
import edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea.apps.MSNMessenger;
import edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea.apps.ServicoMensagemInstantanea;
import edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea.apps.Telegram;

public class ComputadorPedrinho {

    public static void main(String[] args) {


        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
        smi.salvarHistoricoMensagem();

    }

}
