import java.util.Scanner;
import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Cria os vetores de 5x5
        String[] player = new String[5];
        Integer[] fase = new Integer[5];
        double[] score = new double[5];
        double[] coins= new double[5];
        Scanner ler = new Scanner(System.in);

        // Cria os jogadores e seta os scores e coins como 0
        for (int x=0; x<4;x++){
            System.out.printf("Digite o nome do jogador "+(x+1)+":");
            String nome = ler.next();
            player[x] = nome;
            fase[x] = 0;
            score[x] = 0;
            coins[x] = 0;

        }
        //menu de Inicio do jogo
        int p = 0;
        while (p==0) {
            System.out.printf("Os jogadores tem como Start score e coins como 0.\nDigite o que você deseja fazer:\n[1] - Setar score\n[2]- Setar coins\n[3] - Setar fase\n[4]- Trocar Player\n[5] - Maior pontuaçãoR\n[0] - Sair do jogo:");
            int resultado = ler.nextInt();
            switch (resultado) {
                case 1:
                    // perguntar qual player vai mudar o score
                    System.out.println("Digite o o numero do player que você deseja alterar o score:");
                    for (int i = 0; i < 4; i++) {
                        System.out.printf(" " + player[i] + "Score = " + score[i]+"\n");
                    }
                    int opcao_nome = ler.nextInt();
                    if (opcao_nome - 1 < 4) {
                        // ajustar o score do player
                        System.out.printf("A pontuação atual do jogador " + player[(opcao_nome - 1)] + " é de : " + score[(opcao_nome - 1)] + "\nDeseja alterar ?\n 1- sim\n2-nao : ");
                        int alterar = ler.nextInt();
                        if (alterar == 1) {
                            System.out.printf("Qual valor deseja inserir?\nR: ");
                            double new_score = ler.nextDouble();
                            score[(opcao_nome - 1)] = new_score;
                            System.out.printf("Score alterado com sucesso para : " + new_score);


                        } else if (alterar == 2) {
                            //Encerrar a ação e voltar para o menu principal
                            break;

                        }
                    }
                    break;
                case 2:
                    System.out.printf("Digite o o numero do player que você deseja alterar os coins:");
                    for (int i = 0; i < 4; i++) {
                        System.out.printf((i++) + " " + player[i] + "coins = " + coins[i]+"\n");

                    }
                    opcao_nome = ler.nextInt();
                    if ((opcao_nome - 1) < 4) {
                        // ajustar os coins do player
                        System.out.printf("A pontuação atual do jogador " + player[(opcao_nome - 1)] + " é de : " + coins[(opcao_nome - 1)] + "\nDeseja alterar ?\n 1- sim\n2-nao : ");
                        int alterar = ler.nextInt();
                        if (alterar == 1) {
                            System.out.printf("Qual valor deseja inserir?\nR: ");
                            double new_coins = ler.nextDouble();
                            score[(opcao_nome - 1)] = new_coins;
                            System.out.printf("Coins alterado com sucesso para : " + new_coins);
                            break;

                        } else if (alterar == 2) {
                            break;

                        }
                    }
                    break;
                case 3:
                    System.out.printf("Digite o jogador que quer adicionar na fase:");
                    for (int i = 0; i < 4; i++) {
                        System.out.printf((i++) + " " + player[i]+ "fase atual = "+fase[i]+"\n");
                    }
                    opcao_nome = ler.nextInt();
                    if ((opcao_nome - 1) <4) {
                        // ajustar para setar a fase do player
                        System.out.printf("o jogador que escolheu é " + player[(opcao_nome - 1)] + "\nDeseja atribuir a uma fase?\n 1-sim\n2-nao : ");
                        int alterar = ler.nextInt();
                        if (alterar == 1) {
                            int h=0;
                            while(h==0){
                                System.out.printf("Qual fase deseja atribuir a esse jogador?\n fase 1 [1] fase 2 [2] fase 3 [3] fase 4 [4]/n: ");
                                int new_fase = ler.nextInt();
                                if (new_fase < 1 || new_fase >4) {
                                    System.out.printf("impossivel inserir essa fase");
                                }
                                else {
                                fase[(opcao_nome - 1)] = new_fase;
                                System.out.printf("jogador atribuido com sucesso para a fase : " + new_fase);
                                break;
                                }
                            }
                        }
                        else{break;}
                    }
                    break;

                case 4:
                    System.out.printf("Digite o jogador que você quer trocar\nSeus pontos serão resetados e sua fase tambem :");
                    for (int i = 0; i <4; i++) {
                        System.out.printf((i++) + " " + player[i]);
                    }
                    opcao_nome = ler.nextInt();
                    if ((opcao_nome - 1) < 4){
                        System.out.printf("Digite o nome do novo jogador : ");
                        String alterar_player = ler.next();
                        player[(opcao_nome-1)] = alterar_player;
                        fase[(opcao_nome-1)] = 0;
                        score[(opcao_nome-1)] = 0;
                        coins[(opcao_nome-1)] = 0;
                        System.out.printf("Jogador alterado com sucesso");
                    }else {
                        System.out.print("Impossivel identificar o jogador");
                    }
                    break;
                case 5:
                    for (int i = 0; i < score.length; i++) {
                        if (score[i] < score[i++]) {
                            double maior_score = score[i++];
                            score[i] = maior_score;
                            player[i] = player[i++];
                            System.out.printf((i++)+" "+ player[i]+" "+score[i]);
                        }

                    }
                    break;
                case 0:
                    System.exit(0);





                   // for (int x = 0; x <= 4; x++) {
                     //   System.out.printf("Qual a pontuação do jogador " + (x + 1) + ":");
                       // String nome = ler.next();
                        //player[x] = nome;
                    //}
                    //  for (int i = 0;i<=3;i++){
                    // System.out.println(player[i]);
                    // }

            }
        }
    }
}