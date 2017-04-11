package Aula_06;

import java.util.Scanner;

/**

 Já que todos os strings são objetos de tipo String,
 mostre como chamar os métodos length( ) e charAt( ) neste literal de string:
 “I like Java”

 */
public class exercicio2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String valor = "I like Java";
        int posicao;
        System.out.println("Infome a posição: ");
        posicao = tc.nextInt();
        System.out.println("Tamanho da string: "+valor.length());
        System.out.println("Posição informada: "+valor.charAt(posicao));
    }
}

