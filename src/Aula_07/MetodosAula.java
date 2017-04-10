package Aula_07;

/**
 * Created by ramon on 03/04/17.
 */
public class MetodosAula {

    public static int somar(int a, int b, int c ){
        return a+b+c;

    }


    public static void main(String[] args) {
        int x,y,z;
        x=10;
        y=20;
        z=30;
        int retorno;
        somar(x,y);
        somar(3.4,4.7);
       retorno= somar(x,y,z);

//        System.out.println(retorno);

        System.out.println(somar(x, y, z));

    }

    public static void somar(int a, int b){
        System.out.println(a+b);
    }
    public static void somar(double a, double b){
        System.out.println(a+b);
    }
}
