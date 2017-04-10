package Aula_04;

/**
 * Created by ramon on 13/03/17.
 */
public class Conversao {
    public static void main(String[] args) {
        int a=10;
        short b=20;
        long c = 30;
        double d = 40;
        String e = "50";
        float f=60.0f;
        System.out.println(a + " "+b + " "+ c+ " "+d + " "+e + " "+f  );

        b =(short) a; //short é menor que um int por isso o cast
        a = b; // int maior que um short.. conversao automatica
        a = (int) c; // long > que um int
        d = (double) a; // double numero com ,
        a = (int)d;// converte o numero , para um inteiro
        f = (float) a;


        ///Usando classes wrapers
        f = Float.parseFloat(e);
        e = String.valueOf(d);
        a = Integer.parseInt("123");
        System.out.println(a + " "+b + " "+ c+ " "+d + " "+e + " "+f  );

    }
}
