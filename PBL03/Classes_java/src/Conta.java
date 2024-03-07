public class Conta {
    String nome_titular;
    int numero_conta;
    double saldo;

    void depositar(double valor){
        this.saldo = this.saldo+valor;

    }
    boolean sacar(double valor){
        if (this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }
        else{
            return false;
        }
    }
    //construtor de conta
    public  Conta(String nome_titular,int numero_conta,double saldo){
        this.nome_titular=nome_titular;
        this.numero_conta = numero_conta;
        this.saldo = saldo;

    }
    public void exibir_informações(){
        System.out.println("Nome: "+nome_titular);
        System.out.println("Conta: "+numero_conta);
        System.out.println("Saldo: "+saldo);

    }

}
