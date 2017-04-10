package Aula_04;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by ramon on 13/03/17.
 */
public class EntradaDeDadosDIS {

    public static void main(String[] args) {
        int i;
        float f;
        char c;
        String s= new String();

        try {

            DataInputStream tc = new DataInputStream(System.in);
            System.out.println("Digite um int");
            i= tc.readInt();

            System.out.println("Digite um float");
            f= tc.readFloat();

            System.out.println("Digite um Char");
            c= tc.readChar();

            System.out.println("Digite uma String");
            s= tc.readLine();

        }catch ( Exception ex){
            System.out.println("errroo");
        }




    }
}
