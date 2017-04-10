package Aula_04;

import java.util.Scanner;

/**
 * Created by ramon on 13/03/17.
 */
public class EntradaDeDadosScanner {

    public static void main(String[] args) {
        int i;
        float f;
        char c;
        String s= new String();

        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um int");
        i= tc.nextInt();

        System.out.println("Digite um float");
        f= tc.nextFloat();

        System.out.println("Digite um Char");
        c= tc.next().charAt(0);

        System.out.println("Digite uma String");
        s= tc.next();
    }


}
