package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.repeticao;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        //Qual a saída no console ?
        // resultado: 1, 2
        // OBS: ele nao considera numero 3, pq no momento q é ==3 ele encerra

        // BREAK
//        for(int numero = 1; numero <=5; numero ++){
//            if(numero==3)
//                break;
//            System.out.println(numero);
//        }

        // CONTINUE - altera o fluxo
        // mesmo o numero nao sendo + ==3, ele continua imprimindo, apenas EXCLUI o numero 3
        for(int numero = 1; numero <=5; numero ++){

            if(numero==3)
                continue;

            System.out.println(numero);
        }

    }

}
