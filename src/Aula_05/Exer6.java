package Aula_05;

import java.util.Scanner;

/**
 * Created by ramon on 27/03/17.
 * 6 - Crie uma classe que exiba o substring de uma
 * string FRASE composto por todos os
 * caracteres de FRASE exceto o último caracter.
 */
public class Exer6 {
    public static void main(String[] args) {
        String frase= new String();
        Scanner tc= new Scanner(System.in);
        int tam;
        System.out.println("Digite a frase");
        frase= tc.nextLine();
        tam=frase.length();
        System.out.println(frase.substring(0,tam-1));

        for(int i=0; i<tam-1;i++){
            System.out.print(frase.charAt(i));
        }

    }
}
