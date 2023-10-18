package edu.fabs.formacaoorientadaaobjetos.fundamentos.enums;

public enum EstadoBrasileiro {

    CEARA ("CE", "Ceará", 11),
    MARANHAO ("MA","Maranhão", 12),
    PIAUI ("PI", "Piauí", 13),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 14),
    SAO_PAULO ("SP","São Paulo", 15);

    private String nome;
    private String sigla;
    private int ibge;

    // Modifier 'private' is redundant for enum constructors
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }

}