package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais;

public class Exercicio {

    public static void main(String[] args) {

        // loop infinito
        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        }
        while (count <=3);
    }

}
