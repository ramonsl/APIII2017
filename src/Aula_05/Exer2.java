package Aula_05;

import java.util.Scanner;

/**
 * Created by ramon on 27/03/17.
 * 2 - Uma farmácia precisa ajustar os preços de seus produtos
 * em 12%. Elabore uma classe que receba o valor do produto
 * e aplique o percentual de acréscimo.
 * O novo valor a ser calculado deve ser arredondado
 * para mais ou para menos usando o método round.
 * A classe deve também conter um laço de repetição que encerre o
 * programa quando o usuário fornecer o valor zero
 (0) para o valor do produto.
 Dessa forma, o usuário digita o valor do produto,
 a classe calcula e mostra o valor com acréscimo,
 a seguir solicita um novo valor.
 Esse processo continua enquanto o valor do produto for diferente
 de zero; caso contrário o programa será encerrado
 */
public class Exer2 {
    public static void main(String[] args) {
        int op=1;
        double produto;
        double newValor;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Digite o valor do produto");
            produto=tc.nextDouble();
            if(produto!=0) {
                newValor = produto * 1.12;
                System.out.println("O novo valor é R$" + Math.round(newValor));
            }else{
                System.out.println("tchau");
            }

        }while (produto!=0);

    }
}
