package edu.fabs.fundamentosdaplataformajava.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int numero = 5;
        //System.out.println(- numero); // sem passar numa variavel, o negativo nao ira alterar a variavel

        //System.out.println(numero);

        numero = - numero; // desta forma garante que o numero seja negativo
        //System.out.println(numero);

        numero = + numero; // reconhece como operador matematico e nao como operador logico positivo
        //System.out.println(numero);

        numero = numero * -1; // a forma correta para realizar a conversao
        //System.out.println(numero);

        // REPETICAO

        // numero = numero + 1;
        //System.out.println(numero);

        //System.out.println(numero++); // nao incrementa, é lido como quero imprimir o valor e DEPOIS quero incrementar o valor

        //System.out.println(numero); // apos a impressao anterior, daí a variavel passa a ter novo valor

        //System.out.println(++ numero); // antes de imprimir a variavel, realiza o incremento, por isso consegue imprimir o novo valor

        // NEGAR VALORES BOOLEANOS
        boolean variavel = true;
        //System.out.println(!true); // variavel em memoria, só considera a negacao se imprimir + 1 vez

        variavel = !variavel; // reatribuir a variavel para conseguir ser falso
        System.out.println(variavel);

    }

}
