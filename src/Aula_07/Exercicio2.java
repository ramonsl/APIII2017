package Aula_07;

/**
 Crie uma classe chamada Contagem que contenha quatro métodos com o nome
 “contar” utilizando o conceito da sobrecarga. A assinatura e função de
 cada método aparecem descritas na tabela a seguir. Faça também outra
 classe para testar o método.
 */
public class Exercicio2 {

    public static void contar() {

        for(int i=1;i<=10;i++) System.out.println(i + " ");
    }

    public static void contar(int fim) {

        for(int i=1;i<=fim;i++) System.out.println(i + " ");
    }

    public static void contar(int inicio, int fim) {

        for(int i=inicio;i<=fim;i++) System.out.println(i + " ");
    }

    public static void contar(int inicio, int fim, int pausa) {

        for(int i=inicio;i<=fim;i++) {
            System.out.println(i + " ");
            try {
                Thread.sleep(pausa*1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        contar();
        contar(3);
        contar(6, 20);
        contar(10, 15, 2);
    }
}
