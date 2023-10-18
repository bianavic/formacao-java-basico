package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {


    /**
     * Possíveis exceções:
     *
     * Não informar o nome e sobrenome;
     * O valor da idade ter um caractere NÃO numérico;
     * O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano);
     */

    public static void main(String[] args) {

        try {

            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            // InputMismatchException: se digitar quinze ao inves de 15
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            // InputMismatchException: se digitar 1,65 ao inves de 1.65
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();

            // captura e diz qual excecao retornar, no caso elas foram: InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos"); // PRINTA MSG EM BRANCO
            // opcao
            System.err.println("Os campos idade e altura precisam ser numéricos"); // PRINTA MSG EM VERMELHO
        }
    }


}
