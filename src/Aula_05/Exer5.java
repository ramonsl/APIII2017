package Aula_05;

import java.util.Scanner;

/**
 * Created by ramon on 27/03/17.
 */
public class Exer5 {

    public static void main(String[] args) {
        String frase;
        String sexo="sexo";
        String sexual= "sexual";
        Scanner tc= new Scanner(System.in);
        frase=tc.nextLine();
        if(frase.contains(sexo)||frase.contains(sexual)){
            System.out.println("Conteudo +18");
        }else{
            System.out.println("Conteudo livre");

        }

    }
}
