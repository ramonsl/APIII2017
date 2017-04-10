package Aula_05;

/**
 * Created by ramon on 27/03/17.
 *
 *

 3 - Crie uma classe que gera um número aleatoriamente
 (entre 5 e 10) por Math.random.
 Em seguida, faça com que apareça em tela uma
 senha numérica contendo a mesma quantidade de dígitos
 correspondentes ao valor aleatório gerado.
 Apresente em tela o número sorteado e a senha.

 */
public class Exer3 {
    public static void main(String[] args) {
        int n, tam;
        String senha = new String();
        System.out.println("Vamos ver o tamanho da senha");
        tam=5+(int)(Math.random()*5);
        int v;
        for(int i=0;i<tam;i++){
            v=1+(int)(Math.random()*9);
            senha=senha.concat(String.valueOf(v));
        }
        System.out.println("Sua senha é" + senha);
    }
}
