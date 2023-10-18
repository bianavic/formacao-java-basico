package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.condicaoternaria;

public class ResultadoEscolar {

    public static void main(String[] args) {

        // CONDICAO TERNARIA

        // possuo uma expressao ternaria que atribui para uma variavel,
        // e ela pode ser impressa, salva em arquivo, mandar uma msg sms etc

        // CENARIO 1
        int nota1 = 7;

        // variavel resultado + igual a se nota é >= 7
        String resultado1 = nota1 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado1);

        // CENARIO 2: + elaborado = com 2 condicoes | se sim ou nao (condicao 1) SENAO (condicao 2) faz outra condicao
        int nota2 = 6;
        String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }


}
