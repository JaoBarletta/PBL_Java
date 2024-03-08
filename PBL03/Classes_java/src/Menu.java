import java.util.*;
import java.util.random.RandomGenerator;

public class Menu {
    Scanner ler = new Scanner(System.in);
    Conta c;
    

    public boolean inicial(){

        while (true) {
            System.out.println("Seja bem vindo ao bando Conta&Divida\nInforme o que gostaria de fazer\n[1]-Login\n[2]-Cadastro\n[3]-Encerrar");
            Integer interação = ler.nextInt();
            if (interação == 1) {
                login();
            }
            else if (interação == 2) {
                cadastro();
            }
            else if (interação == 3) {
                System.exit(0);
                
            }
            else{
                System.out.printf("Não consegui entender sua resposta");
            }
        }
    }
    public boolean login(){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Por favor informe o nome do titular: ");
        String acesso_nome = ler.next();
        System.out.printf("Por favor informe o numero da conta: ");
        int acesso_numero = ler.nextInt();
        if (acesso_nome == c.nome_titular && acesso_numero == c.numero_conta){
            System.out.printf("Acesso concedido");
            return true;

        }
        else {
            System.out.printf("Impossivel identificar a conta!");
            return false;
        }

    }
    public boolean cadastro(){
        Scanner ler = new Scanner(System.in);
        while (true) {;
        
            System.out.printf("Por favor inserir o seu nome completo: ");
            String novo_usuario = ler.next();
            int numero_conta = RandomGenerator.getDefault().nextInt(100000);
            double saldo = 0.0;
            @SuppressWarnings("unused")
            Conta nova_conta = new Conta(novo_usuario,numero_conta, saldo);
            System.out.printf("Conta Criada com Sucesso!\nNome Titular: "+novo_usuario+"\nNumero da conta: "+numero_conta+"\nSaldo: "+saldo);

            return true;
        }
    }   
    public void acao(){
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.printf("Bem-vindo "+c.nome_titular+".\n\nO que deseja fazer hoje: \n[1]=Sacar\n[2]-Depositar\n[3]- Sair da conta");
            int opcao = ler.nextInt();
            if (opcao == 1){
                System.out.printf("Saldo atual: "+c.saldo+"\nDigite o valor que você deseja sacar: ");
                double valor = ler.nextDouble();
                c.sacar(valor);
                // inserir true or false para a resposta
                if(c.sacar(valor) == true){
                    System.out.printf("Saque realizado com sucesso\nSaldo atual da conta: "+c.saldo);
            
                    
                }
                else if (c.sacar(valor) == false) {
                    System.out.printf("Impossivel realizar a ação, por favor tente novamente! ");
                    
                }
            }
        }
    }
}
