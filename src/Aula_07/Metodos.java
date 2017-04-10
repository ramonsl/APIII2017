package Aula_07;

/**
 * Created by ramon on 03/04/17.
 */
public class Metodos {



    public static void mostrarBomDia(){
        System.out.println("Bom Dia");
    }


    public static void main(String[] args) {
        mostrarBomDia();
        int m= multiplicar(5,10);
        System.out.println(m);/// ouuuu
        System.out.println(multiplicar(3,4));
        System.out.println(multiplicar(3,4,5));
        System.out.println(multiplicar(3,4.2));
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }

    public static int multiplicar(int a, int b,int c){
        return a*b*c;
    }
    public  static double multiplicar(int a, double b){
        return a*b;
    }

    public static void soma(int a, int b){
        System.out.println(a+b);
    }


}
