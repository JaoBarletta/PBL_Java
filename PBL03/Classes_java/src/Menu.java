import java.util.*;
import java.util.random.RandomGenerator;

public class Menu {
    Scanner ler = new Scanner(System.in);
    Conta c;

    int p = 0;
    public boolean inicial(){

        while (p==0) {
            System.out.println("Seja bem vindo ao bando Conta&Divida\nInforme o que gostaria de fazer\n[1]-Login\n[2]-Cadastro\n[3]-Encerrar");
            int interação = ler.nextInt();
            if (interação == 1) {
                login();
            }
            else if (interação == 2) {
                cadastro();
            }
        }
    }
    public boolean login(){
        System.out.printf("Por favor informe o nome do titular: ");
        String acesso_nome = ler.next();
        System.out.printf("Por favor informe o numero da conta: ");
        int acesso_numero = ler.nextInt();
        if (acesso_nome == c.nome_titular && acesso_numero == c.numero_conta){
            System.out.printf("Acesso concedido");
            p=1;
            return true;

        }
        else {
            System.out.printf("Impossivel identificar a conta!");
            return false;
        }

    }
    public boolean cadastro(){
        System.out.printf("Por favor inserir o seu nome completo: ");
        String novo_usuário = ler.next();
        c.nome_titular = novo_usuário;
        c.numero_conta = RandomGenerator.getDefault().nextInt();
        c.saldo = 0;
        System.out.printf("Conta Criada com Sucesso!\nNome Titular: "+c.nome_titular+"\nNumero da conta: "+c.numero_conta+"\nSaldo: "+c.saldo);

        return true;
    }
    public double acao(){
        System.out.printf("Bem-vindo "+c.nome_titular+".\n\nO que deseja fazer hoje: \n[1]=Sacar\n[2]-Depositar\n[3]- Sair da conta");
        int opcao = ler.nextInt();
        if (opcao == 1){
            System.out.printf("Saldo atual: "+c.saldo+"\nDigite o valor que você deseja sacar: ");
            double valor = ler.nextDouble();
            c.sacar(valor);
            // inserir true or false para a resposta
        }
    }
}
