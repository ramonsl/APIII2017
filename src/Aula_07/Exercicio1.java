package Aula_07;

import java.util.Scanner;

/**
 * Created by RAMON on 10/04/2017.
 */
/*Faça uma classe chamada Mes que possua um método chamado getMesPorExtenso
que recebe um número inteiro, referente ao mês do ano, um código referente
ao idioma (1 para português e 2 para inglês) e retorne o mês por extenso.
A tabela a seguir ilustra alguns exemplos. Faça também outra classe para
testar o método.
 */

public class Exercicio1 {

    public static void main(String[] args) {

        int num;
        int idioma;

        Scanner tc = new Scanner(System.in);

        System.out.printf("informe o mes do ano: ");
        num = tc.nextInt();
        System.out.printf("Informe o idioma 1)Portugues 2)Ingles");
        idioma = tc.nextInt();

        System.out.println(getMesporextenso(num, idioma));
    }

    public static String getMesporextenso(int num,int idioma){
        String vetor1[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String vetor2[] ={"January","February","MArch","April","May","June", "July", "August","September","October", "NOvember"};

        num--;

        if (idioma == 1){

            return  vetor1[num];
        }else if (idioma == 2){

            return vetor2[num];
        }else {

            return "Idioma inválido!";
        }

    }
}
