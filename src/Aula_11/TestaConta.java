package Aula_11;

/**
 * Created by ramon on 08/05/17.
 */
public class TestaConta {
    public static void main(String[] args) {
        ContaConrrente c1= new ContaConrrente();

        ///Metodos de leitura
        c1.saldo=100;
        c1.nConta=1;
        c1.senha="123";
        c1.titular= new Cliente();
        c1.titular.nome= "ramon";
        c1.titular.cpf="8767866";
        c1.titular.idade=32;

        Cliente a= new Cliente();
        a.nome="ranib";
        a.idade=32;
        a.cpf="23123";

        ContaConrrente c2= new ContaConrrente();
        c2.titular=a;
        c2.saldo= 0;
        c2.nConta=123;
        c2.senha="321";
        c1.mostrarSaldo();
        c1.depositar(100);
        c1.sacar(1000);
        c1.mostrarSaldo();
        c2.mostrarSaldo();
        c1.transferir(c2,500);
        c2.mostrarSaldo();
        c1.mostrarSaldo();
        c1.saldo= 100000;
        c1.mostrarSaldo();
    }
}
