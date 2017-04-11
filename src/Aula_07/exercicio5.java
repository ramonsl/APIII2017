package Aula_07;

/**
 Elabore uma classe chamada “MeusArrays” contendo dois métodos que realizam
 operações com arrays, conforme a descrição a seguir. Faça também outra
 classe para testar os métodos:
 a. um método que recebe dois arrays de inteiros e um número inteiro.
 Pesquise se esse número inteiro existe nos dois arrays e de um retorno
 conforme a descrição seguinte: se o número não for encontrado em nenhum
 dos arrays, retorne 0; caso encontre em um dos arrays, retorne 1; e caso
 seja localizado nos dois arrays, retorne 2.
 b. um método que recebe um valor inteiro (n) e retorna um array contendo
 n elementos inteiros gerados randomicamente. Os valores gerados devem estar
 entre 0 e 1000.

 */
class  MeusArrays{
    public static int contemNum(int array1[],int array2[],int num){
        int a1=0;
        int a2=0;

        for (int i=0;i<array1.length;i++) {
            if(array1[i]==num) a1 = 1;
        }

        for (int i=0;i<array2.length;i++) {
            if(array2[i]==num) a2 = 1;
        }

        if(a1==1 && a2==1) return 2;
        else if(a1==0 && a2==0) return 0;
        else return  1;
    }

    public static int[] randon(int num){
        int vetor[]=new int[num];
        for (int i=0;i<num;i++){
            vetor[i]=(int) (Math.random()*1001);
        }
        return vetor;
    }
}
public class exercicio5 {
    public static void main(String[] args) {
        int[] array = MeusArrays.randon(5);
        int[] array2 = MeusArrays.randon(5);
        int c = MeusArrays.contemNum(array, array2, 3);

        System.out.println(c + " ");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
            System.out.print(array2[i] + " ");
        }
    }
}
