package Aula1;

/**
 * @author Kauan
 */

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        // objeto responsável pela leitura de dados do teclado
        Scanner inserir = new Scanner(System.in);

        //variáveis
        String nomeAluno;
        int n1, n2, n3, n4;
        double media;

        //processamento
        System.out.println("Insira seu nome: ");
        nomeAluno = inserir.nextLine();

        System.out.println("Insira n1: ");
        n1 = inserir.nextInt();

        System.out.println("Insira n2: ");
        n2 = inserir.nextInt();

        System.out.println("Insira n3: ");
        n3 = inserir.nextInt();

        System.out.println("Insira n4: ");
        n4 = inserir.nextInt();

        media = (n1 + n2 + n3 + n4) / 4.0;

        //imprimir
        System.out.println(nomeAluno + ", sua média final é: " + media);
    }
}
