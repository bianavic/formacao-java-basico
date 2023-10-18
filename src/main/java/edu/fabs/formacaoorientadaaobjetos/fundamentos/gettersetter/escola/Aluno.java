package edu.fabs.formacaoorientadaaobjetos.fundamentos.gettersetter.escola;

public class Aluno {

    // CLASSE aderente ao padrao JAVA BEANS -> protecao
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

}
