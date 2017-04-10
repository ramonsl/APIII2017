package Aula_04;

import java.util.Scanner;

/**
 * Created by ramon on 3/20/17.
 * Usando a classe Scanner para entrada de dados,
 * crie uma classe que receba o valor de um produto
 * e a porcentagem de desconto, calcule e mostre o valor do desconto
 * e o valor do produto com o desconto. Observação:
 * o valor do desconto é calculado por meio da fórmula:
 * valor do desconto = valor do produto * percentual de desconto / 100.
 */
public class At01 {

    public static void main(String[] args) {
        double valor, valorDesc;
        double desc;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        valor= tc.nextDouble();
        System.out.println("Digite o valor do desconto:");
        desc= tc.nextDouble();
        valorDesc=valor*desc/100;
        System.out.println("Valor do produto:"+valor);
        System.out.println("% do desconto:"+desc);
        System.out.println("Valor descontado:"+valorDesc);
        System.out.println("Novo valor:"+(valor-valorDesc));


    }

}
