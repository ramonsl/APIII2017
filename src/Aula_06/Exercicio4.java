package Aula_06;

import java.util.Scanner;

/**
 * Created by RAMON on 10/04/2017.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String frase;
        String contrario = "";

        int j = 0;

        System.out.println("Digite uma frase para conferir se ela e um palindromo: ");
        frase = tc.next();

        // contrario= new StringBuilder(frase).reverse().toString();

        for (int i = frase.length() - 1; i >= 0; i--) {
            contrario += frase.charAt(i);
            j++;
        }
        if (contrario.equals(frase))
            System.out.println("E um palindromo");
        else
            System.out.println("Nao e um palindromo");


    }
}
