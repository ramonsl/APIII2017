package Aula_04;

/**
 * Created by ramon on 13/03/17.
 */
public class EstruturaDeControle {

    public static void main(String[] args) {
        int a=0;

        if( a > 0){
            System.out.println("a é maior que zero");
        }else if( a< 0){
            System.out.println("a é menor que zero");

        }else{
            System.out.println("a é igual a zero");
        }
        int c=1;
        switch (c){
            case 1:{
                System.out.println("c é 1");
                break;
            }
            case 2: {
                System.out.println("c é 2");
                break;
            }
            default:{
                System.out.println("c possui um valor que nao é 1 ou 2");
                break;
            }

        }

    }
}
