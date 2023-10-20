package edu.fabs.formacaoorientadaaobjetos.desafio.bancodigital;

public interface Transacao {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

}
