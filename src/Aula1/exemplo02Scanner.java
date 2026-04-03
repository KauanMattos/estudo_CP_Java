package Aula1;

import java.util.Scanner;

/**
 * @author Kauan
 */

public class exemplo02Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valorA, valorB, valorC;
        double media;

        System.out.println("Valor A:");
        valorA = input.nextInt();
        System.out.println("Valor B: ");
        valorB = input.nextInt();
        System.out.println("Valor C: ");
        valorC = input.nextInt();

        media = (valorA + valorB + valorC) / 3;

        System.out.println("Média " + media);

    }
}
