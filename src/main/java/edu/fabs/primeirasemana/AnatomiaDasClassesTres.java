package edu.fabs.primeirasemana;

public class AnatomiaDasClassesTres {

    public static void main(String[] args) {

            // DECLARACAO VARIAVEL

        // tipo + nome + valor/atribuicao
        String meuNome = "Lugano";

        int anoDeFabricacao = 2023;

        boolean simOuNao; // sem atribuicao
        boolean verdadeira = true;

        // MANIPULACAO
        anoDeFabricacao = 2018;

        // sobre metodos
        String primeiroNome = "Nero";
        String segundoNome = "Maria";

        // variavel nomeada como nomeCompleto onde o VALOR é a CHAMADA de 1 METODO
        // instrucao 1 é a variavel
        // instrucao 2 é o metodo
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

        // DECLARACAO METODO

    // metodo retornará String / texto, recebendo 2 parametros
    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
