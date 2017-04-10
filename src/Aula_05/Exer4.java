package Aula_05;

import java.util.Scanner;

/**
 * Created by ramon on 27/03/17.
 */
public class Exer4 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);


        String a= tc.nextLine();
        a=a.replace(" ","");

        for (int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }

    }
}
