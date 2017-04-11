package Aula_07;

/**
 * Created by RAMON on 10/04/2017.
 * Crie uma classe chamada Senha que contenha um método chamado
 * gerar que retorna uma senha contendo oito caracteres numéricos.
 * Faça também outra classe para testar o método.
 */
public class Exercicio4Senha {
    public static String gerar(){
        String a ="";
        for (int i=0; i<=7; i++){
            a = a+ ( String.valueOf( (int) Math.rint( Math.random() * 10) ) ) ;
        }

        return a;

    }

    public static  void main( String args[]){
        System.out.println("Senha gerada é: " + gerar());
    }
}
