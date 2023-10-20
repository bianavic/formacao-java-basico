package edu.fabs.formacaoorientadaaobjetos.desafio.bancodigital;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vinde ao banco digital!");

        Cliente nero = new Cliente();
        nero.setNome("Nero");

        Cliente lugano = new Cliente();
        lugano.setNome("Lugano");

        Cliente gonzales = new Cliente();
        gonzales.setNome("Gonzales");

        Conta correnteNero = new ContaCorrente(nero);
        correnteNero.depositar(100);
        Conta poupancaNero = new ContaPoupanca(nero);
        correnteNero.transferir(100, poupancaNero);

        correnteNero.imprimirInfosComuns();
        poupancaNero.imprimirInfosComuns();

        Conta correnteLugano = new ContaCorrente(lugano);
        correnteLugano.depositar(100);
        correnteLugano.imprimirInfosComuns();

        Conta poupancaGonzales = new ContaPoupanca(gonzales);
        poupancaGonzales.depositar(100);
        correnteLugano.transferir(50, poupancaGonzales);
        poupancaGonzales.imprimirInfosComuns();

        // extrato Lugano apos transferencia
        correnteLugano.imprimirInfosComuns();
    }

}
