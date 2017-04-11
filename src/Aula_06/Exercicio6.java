package Aula_06;

/**
 * Created by RAMON on 10/04/2017.
 */

/*Crie uma classe que armazene os 12 meses do ano em um array.
A seguir, gere um valor randômico entre 0 e 11 e apresente o
mês correspondente ao valor sorteado. Considere que o valor 0
corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.*/

public class Exercicio6 {
    public static void main(String[] args) {

        String meses [] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        int i = (int) (Math.random()*12);

        System.out.println(meses[i]);
    }
}
