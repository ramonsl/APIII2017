package Aula_04;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by ramon on 13/03/17.
 */
public class EntradaDeDadosJoption {
    public static void main(String[] args) {

        int i;
        float f;
        char c;
        String s= new String();
        String leitura;


            leitura= JOptionPane.showInputDialog("Digite um int");
            i= Integer.parseInt(leitura);

            leitura= JOptionPane.showInputDialog("Digite um Float");
            f= Float.parseFloat(leitura);

            leitura= JOptionPane.showInputDialog("Digite um char");
            c= leitura.charAt(0);
            leitura= JOptionPane.showInputDialog("Digite uma String");
            s= leitura;

            JOptionPane.showMessageDialog(null,s);

        System.out.println("FUNCIONOU");

    }

}
