package Aula_04;

/**
 * Created by ramon on 13/03/17.
 */
public class EstruturasDeRepeticao {

    public static void main(String[] args) {
        int i=0;
        for (i=0; i <=100;i++){
            System.out.println("valor de i:"+i);
        }

        while (i<200){
            i++;
            System.out.println("valor de i:"+i);
        }
        do{
            i++;
            System.out.println("valor de i:"+i);
        }while (i<300);

    }
}
