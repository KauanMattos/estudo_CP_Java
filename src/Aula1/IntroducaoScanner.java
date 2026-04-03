package Aula1;

import java.util.Scanner;

public class IntroducaoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Nome: ");
        nome = input.next();
        System.out.println("Olá " + nome);
    }
}
