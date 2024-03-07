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
}
