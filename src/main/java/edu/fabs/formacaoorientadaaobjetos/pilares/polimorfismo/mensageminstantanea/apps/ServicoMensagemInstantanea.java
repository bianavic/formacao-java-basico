package edu.fabs.formacaoorientadaaobjetos.pilares.polimorfismo.mensageminstantanea.apps;

public abstract class ServicoMensagemInstantanea {

    // quem quiser ser servico de msg instantanea
    // precisara implementar 2 contratos

    /**
     * Com o modificador **private**somente a classe conhece a implementação, quanto que o modificador **public**todos
     * passarão a conhecer. Mas gostaríamos que, somente as classes filhas soubessem.
     * Bem, é ai que entra o modificador protected.j
     */

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();

    // PROTECTED somente filhos NO MESMO PACOTE conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado à internet");
    }


}
