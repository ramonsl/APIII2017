package Aula_05;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by ramon on 20/03/17.
 */
public class ExemplosMath {

    public static void main(String[] args) {

        System.out.println(Math.PI); // mostrara o valor de PI


        System.out.println("Arrendondando um valor  para o proximo inteiro");
        System.out.println(Math.ceil(2.9)); // Mostra o proximo numero inteiro
        System.out.println(Math.ceil(2.1)); // Mostra o proximo numero inteiro

        System.out.println("Arrendondando um valor  para o anteior inteiro");
        System.out.println(Math.floor(2.9)); // Mostra o proximo numero inteiro
        System.out.println(Math.floor(2.1)); // Mostra o proximo numero inteiro

        System.out.println("Arrendondando um valor  decimal");
        System.out.println(Math.round(2.9)); // Mostra o valor arrendodado decimal 3
        System.out.println(Math.round(2.1)); // MMostra o valor arrendodado decimal 2

        System.out.println("Mostrando o maior valor");
        int maior = Math.max(10,20);
        System.out.println(maior); // Mostra o maior valor entre os dois
        System.out.println(Math.max(10,20)); // // Mostra o maior valor entre os dois (sem usar var aux)


        System.out.println("Usando o Random");
        int sorteio = (int) (Math.random() *10);
        System.out.println(sorteio);
        sorteio = (int) (Math.random() *1000);
        System.out.println(sorteio);


        DecimalFormat n = new DecimalFormat();
        int a =1;
        int b = 10;
        int c =100;
        int d =1000;
        n.applyPattern("00");
        System.out.println(n.format(a)); // mostra 01
        System.out.println(n.format(b)); // mostra 10
        System.out.println(n.format(c)); // mostra 100
        System.out.println(n.format(d)); // mostra 1000


        DecimalFormat p = new DecimalFormat();
        double e =1.2;
        double f = 0.3;
        p.applyPattern("#.00");
        System.out.println(p.format(e)); // mostra 1,20
        System.out.println(p.format(f)); // mostra ,30


        DecimalFormat money = new DecimalFormat();
        double g =12000;
        double h = 300;
        money.applyPattern("R$ #,###.00");
        System.out.println(money.format(g)); // mostra R$ 12.000,00
        System.out.println(money.format(h)); // mostra R$ 300,00

        Locale local =  Locale.getDefault();
        double reais = 11200.35;

        if(local.getCountry().equals("BR")){
            System.out.println(local.getDisplayCountry());
            p.applyPattern("R$ #,###0.00");
        }else{
            System.out.println(local.getDisplayCountry());
            p.applyPattern("US$ ####0.00");
        }
        System.out.println(p.format(reais));


        String frase = "RAMON";
        int tam = frase.length();
        System.out.println(tam);

        System.out.println(frase.charAt(0));

        System.out.println(frase.toLowerCase()); //minuscula
        System.out.println(frase.toUpperCase()); // MAIUSCULA

        frase = "Terceira Terça";
        System.out.println(frase.substring(9)); // Terça
        System.out.println(frase.substring(0, 8));

    }




}
