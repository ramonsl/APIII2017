package Aula_11;

/**
 * Created by ramon on 08/05/17.
 */
public class ContaConrrente {
    public double saldo;
    public  int nConta;
    public  String senha;
    public Cliente titular;
    public static double limite=300;


    public boolean sacar(double v){
        if (saldo+limite>=v){
            saldo -= v;
    //        System.out.println("Retire o dinheiro na maquina");
            return true;
        }else{
            System.out.println("Sem saldo");
            return false;
        }
    }

    public boolean depositar(double v){
        saldo+=v;
        System.out.println("Seu saldo foi atualizado:"+saldo);
        return true;
    }

    public boolean transferir(ContaConrrente d,double v ){
        if( sacar(v)){
            return d.depositar(v);

        }else{
            System.out.println("Impossivel transferir");
            return false;
        }
    }

    public void mostrarSaldo(){
        System.out.println("Dono da conta:"+titular.nome);
        System.out.println("Saldo em:"+saldo);
    }
}
