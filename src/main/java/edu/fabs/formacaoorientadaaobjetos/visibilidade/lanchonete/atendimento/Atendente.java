package edu.fabs.formacaoorientadaaobjetos.visibilidade.lanchonete.atendimento;

public class Atendente {

    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA");
    }
    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }
    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }
    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }


    //DEFAULT - método visível apenas a NIVEL de PACOTE
    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO O GÁS");
    }

}
