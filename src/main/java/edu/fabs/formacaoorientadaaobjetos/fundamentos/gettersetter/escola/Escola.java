package edu.fabs.formacaoorientadaaobjetos.fundamentos.gettersetter.escola;

public class Escola {

    public static void main(String[] args) {

        // criado objeto
        Aluno felipe = new Aluno();

//        // definicao valores, atributos do objeto
//        felipe.nome = "Felipe";
//        felipe.idade = 8;

        // getters and setters
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        // obtencao das infos do objeto
//        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");

    }

}
