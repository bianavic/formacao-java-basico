package edu.fabs.formacaoorientadaaobjetos.desafio.bancodigital;

import java.util.List;

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

        String clienteNero = "Nero";
        Banco banco = new Banco(clienteNero);

        banco.adicionarConta(correnteNero);
        banco.adicionarConta(poupancaNero);
        banco.adicionarConta(correnteLugano);
        banco.adicionarConta(poupancaGonzales);

        List<Conta> contasEncontradas = banco.buscarContasPorNomeCliente(clienteNero);
        if (contasEncontradas.isEmpty()) {
            System.out.println("Nenhuma conta encontrada para o cliente: " + clienteNero);
        } else {
            System.out.println("Contas encontradas para o cliente " + clienteNero + ":");
            for (Conta conta : contasEncontradas) {
                System.out.println("Agência: " + conta.getAgencia());
                System.out.println("Número: " + conta.getNumero());
                System.out.println("Saldo: " + conta.getSaldo());
            }
        }
    }

}
