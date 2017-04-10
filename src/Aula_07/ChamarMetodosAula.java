package Aula_07;

/**
 * Created by ramon on 03/04/17.
 */
public class ChamarMetodosAula {

    public static void main(String[] args) {
        int x=MetodosAula.somar(4,5,6);

        try {
            Thread.sleep(10000);
            MetodosAula.somar(4,x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
