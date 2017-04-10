package Aula_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ramon on 13/03/17.
 */
public class EstruturaControleExcecao {
    public static void main(String[] args) {

        int i;
        try {

            InputStreamReader tc = new InputStreamReader(System.in);
            System.out.println("Digite um int");
            i= tc.read();

        }catch ( Exception ex){
            System.out.println("errroo");
        }

    }
}
