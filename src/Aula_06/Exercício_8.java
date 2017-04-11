package Aula_06;

import java.util.Scanner;

/**
 * CUsando um array unidimensional de 10
 * elementos do tipo String, faça uma classe que simule
 * a ocupação de um estacionamento de veículos. Consid
 * ere que a posição do array corresponde ao número da vaga e
 * para cada vaga é armazenada a placa do veículo que está estacio
 * nado. Sua classe deve conter um laço de repetição simulando um menu
 * que controle a entrada e a saída dos veí- culos com as opções: 1-Entra
 * da, 2-Saída e 3-Listar situação atual e 4-Encerrar o programa. Se o usu
 * ário escolher 1, solicite o número da vaga e a placa do veículo; se es
 * colher 2, solicite o número da vaga que será liberada e armazene o v
 * alor branco na posição correspondente ao array; se escolher 3, liste
 * a situação atual apresentando em tela todos os elementos do array; qu
 * ando for 4, encerre o laço e o programa.


 */
public class Exercício_8 {
    public static void main(String[] args) {
        String estacionamento[] =  {"Liberada","Liberada","Liberada","Liberada","Liberada","Liberada","Liberada","Liberada","Liberada","Liberada",};
        int menu_opc = 0, vaga;
        String digitacao = "";

        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Estacionameto -------------");
            System.out.println("1 - Entrada");
            System.out.println("2 - Saída");
            System.out.println("3 - Listar situacao atual");
            System.out.println("4 - Sair");

            menu_opc = scan.nextInt();
            switch (menu_opc){
                case 1:{
                    System.out.println("Vaga do carro:");
                    vaga = scan.nextInt();
                    System.out.println("Placa do carro: ");
                    estacionamento[vaga-1] = scan.next();
                    System.out.println("Cadastrado com sucesso!!!");
                    break;
                }
                case 2:{
                    System.out.println("Vaga a ser liberada: ");
                    vaga = scan.nextInt();
                    estacionamento[vaga-1] = "Liberada";
                    break;
                }
                case 3:{
                    System.out.println("Lista de vagas: ");
                    for (int i=0;i<estacionamento.length;i++) {
                        System.out.println("Vaga " + (i+1) + ": " + estacionamento[i]);
                    }
                    break;
                }
                case 4:{
                    break;
                }
            }

        }while(menu_opc !=4);

    }
}
