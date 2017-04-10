package Aula_05;

import java.util.Random;

/**
 * Created by ramon on 27/03/17.
 *
 * 1 - Crie uma classe que simule a jogada de um dado de seis lados
 * (números de 1 a 6) por três vezes.
 * Ao  final some seus valores e apresente o
 * resultado das três jogadas.
 *
 */
public class Exer01 {
    public static void main(String[] args) {
        int sorteado;
        int total=0;

        for (int i=0;i<50;i++){
            //Random n= new Random(100);
            //n.nextInt();
            sorteado= 1+(int)(Math.random()*6);
            System.out.println("Valor sorteado: " + sorteado + "");
            total+=sorteado;
          //  total=total+sorteado;
        }
        System.out.println("Total das 3 jogadas "+total);

    }
}
