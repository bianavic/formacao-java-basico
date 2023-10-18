package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.repeticao;

public class ExemploForArray {

    public static void main(String[] args) {

        // ARRAYS / COLECAO -> conjunto de elemstos de um tipo correspondente

        // vinculado a um conjunto de elementos = arrays []
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // Forma ABREVIADA
        // elementos de 1 tipo string
        // a cada iteracao de alunos, ocorre a atualizacao da variavel aluno
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }


// exemplo FOR na interacao sobre arrays

        // OBS: em arrays o indice inicia em ZERO, por isso no bloco da DECLARACAO da variavel, x = 0

//        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
//
//        for (int x=0; x<alunos.length; x++) {
//            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
//        }

    }

}
