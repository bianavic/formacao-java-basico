package edu.fabs.formacaoorientadaaobjetos.fundamentos.gettersetter;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //...
    //setters de nome e cpf ?

    // METODO CONSTRUTOR 1: para criar objetos com valores requeridos na momento da criação\instanciação (new)
    // É SEM RETORNO
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // METODO CONSTRUTOR 2: vazio
    public Pessoa() {}

    // METODO CONSTRUTOR 3: apenas 1 atributo
    public Pessoa(String nome) {
        this.nome = nome;
    }

}
