package edu.fabs.formacaoorientadaaobjetos.fundamentos.visibilidade.lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    //DEFAULT - método visível apenas a NIVEL de PACOTE
    // é o momento que permite ver a entrada e saidad os items
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    //DEFAULT - método visível apenas a NIVEL de PACOTE
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }

}
