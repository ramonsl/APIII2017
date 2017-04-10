package Aula_04;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ramon on 13/03/17.
 */
public class EntradaDeDadosBR {

    public static void main(String[] args) {
        int i;
        float f;
        char c;
        String s= new String();

        try {

            BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite um int");
            i= Integer.valueOf(tc.readLine());

            System.out.println("Digite um float");
            f= Float.parseFloat(tc.readLine());

            System.out.println("Digite um Char");
            c=  tc.readLine().charAt(0);

            System.out.println("Digite uma String");
            s= tc.readLine();

        }catch ( Exception ex){
            System.out.println("errroo");
        }
    }
}
