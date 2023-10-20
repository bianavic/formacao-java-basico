package edu.fabs.formacaoorientadaaobjetos.desafio.bancodigital;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public List<Conta> buscarContasPorNomeCliente(String nomeCliente) {
        List<Conta> contasEncontradas = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                contasEncontradas.add(conta);
            }
        }
        return contasEncontradas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

}
