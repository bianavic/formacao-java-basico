package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.repeticao;

public class ExemploFor {

    public static void main(String[] args) {

        // realizo o comando até q essa condicao seja verdadeira

        // bloco de declaracao da variavel: int carneirinhos = 1
        // bloco de validacao (): carneirinhos <=20
        // bloco de atualizacao

        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
        // finalizada a contagem
        System.out.println("Joaozinho dormiu");

        //o que importa é somente o BLOCO CONDICIONAL
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

    }

}
