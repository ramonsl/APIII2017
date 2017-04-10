package Aula_04;

import javax.swing.*;
import java.util.DoubleSummaryStatistics;

/**
 * Created by ramon on 3/20/17.
 *
 * Usando a classe JOptionPane para entrada de dados,
 * elabore uma classe que receba a nota de duas provas e de um trabalho.
 * Calcule e mostre a média e o resultado final (aprovado ou reprovado).
 * Para calcular a média utilize a fórmula seguinte:
 * média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3.
 * Considere que a média mínima para aprovação é 6.
 */
public class At03 {

    public static void main(String[] args) {
        double n1,n2,t1, media;
        n1= Double.parseDouble(JOptionPane.showInputDialog("Nota de n1"));
        n2= Double.parseDouble(JOptionPane.showInputDialog("Nota de n2"));
        t1= Double.parseDouble(JOptionPane.showInputDialog("Nota de T1"));
        media = (n1+n2+t1)/3;
        if(media>6){
            System.out.println("Uhuuuuuuu aprovado");
        }else{
            System.out.println("errou");
        }




    }
}
