package edu.fabs.formacaoorientadaaobjetos.fundamentos.gettersetter;

public class SistemaCadastro {

    public static void main(String[] args) {


        // CRIAMOS uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos", "123");

        // 3 metodos construtores, outras formas para criar Pessoa
//        Pessoa marcos2 = new Pessoa();
//        Pessoa marcos3 = new Pessoa("Marcos 2");

        //DEFINIMOS o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos ?

        //imprimindo o marcos sem o nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }

}
