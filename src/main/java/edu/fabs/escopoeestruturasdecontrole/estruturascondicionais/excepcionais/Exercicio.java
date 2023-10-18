package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.excepcionais;

import java.util.Scanner;

public class Exercicio {

//    public static void main(String[] args) {
//
//        Scanner leitor = new Scanner(System.in);
//        int N = leitor.nextInt();
//        String jogador1, jogador2;
//        String semGanhador = "Sem ganhador";
//// TODO: complete os espaços em branco com sua solução para o problema
//        for (int i = 0; i < N; i++) {
//            jogador1 = leitor.next();
//            jogador2 = leitor.next();
//            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
//                System.out.println("Aniquilacao mutua");
//            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
//                System.out.println("Ambos venceram");
//            else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
//            else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
//            else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
//            else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
//            else System.out.println(semGanhador);
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//// TODO: complete os espaços em branco com sua solução para o problema
//        String[] nomes = new String[10];
//        // String[] nomes = {"USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"};
//
//        for(int i=0 ; i<10 ; i++)
//            nomes[  i  ] = sc.nextLine();
//
//        System.out.println(nomes[2]);
//        System.out.println(nomes[6]);
//        System.out.println(nomes[8]);
//    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int N;

// TODO: complete os espaços em branco com sua solução para o problema

        for (int i = 0; i < C; i++) {
            nome = leitor.next();
            N = leitor.nextInt();
            if (nome.equals("Thor")) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
