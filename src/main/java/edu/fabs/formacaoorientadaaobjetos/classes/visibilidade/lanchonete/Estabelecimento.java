package edu.fabs.formacaoorientadaaobjetos.classes.visibilidade.lanchonete;

import edu.fabs.formacaoorientadaaobjetos.classes.visibilidade.lanchonete.area.cliente.Cliente;
import edu.fabs.formacaoorientadaaobjetos.classes.visibilidade.lanchonete.atendimento.Atendente;
import edu.fabs.formacaoorientadaaobjetos.classes.visibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que estabelecimento PRECISA ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }

}
