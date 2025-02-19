import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int PEDRA = 1;
    private static final int PAPEL = 2;
    private static final int TESOURA = 3;
    private static final int LAGARTO = 4;
    private static final int SPOCK = 5;


    public static void main(String[] args) {
        exibirMenu();

        while (true) {
            int opcaoJogador = lerEntrada();
            imprimirEscolha(opcaoJogador, "Jogador");
            int opcaoCpu = opcaoAleatoria();
            imprimirEscolha(opcaoCpu, "CPU");
            exibirVencedor(opcaoJogador, opcaoCpu);

            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("Digite o número correspondente à sua escolha:");
            System.out.println("*************************");
        }
    }

    private static void exibirMenu() {
        System.out.println("*************************");
        System.out.println("******** JOKENPO ********");
        System.out.println("*************************");
        System.out.println("Selecione uma opção para jogar:");
        System.out.println("1. Pedra");
        System.out.println("2. Papel ");
        System.out.println("3. Tesoura");
        System.out.println("4. Lagarto");
        System.out.println("5. Spock");
        System.out.println("-------------------------");
        System.out.println("Digite o número correspondente à sua escolha:");
        System.out.println("*************************");
    }

    private static int lerEntrada() {
        Scanner scanner = new Scanner(System.in);

        do {
            int opcao = scanner.nextInt();
            if (opcao < PEDRA || opcao > SPOCK) {
                System.out.print("Selecione uma opção valida..");
            } else {
                return opcao;
            }
        } while (true);
    }

    private static int opcaoAleatoria() {
        Random rnd = new Random();
        int opcao = rnd.nextInt(SPOCK) + 1;
        return opcao;
    }

    private static void imprimirEscolha(int opcao, String quem) {
        String escolha = "";
        switch (opcao) {
            case PEDRA:
                escolha = "Pedra";
                break;
            case PAPEL:
                escolha = "Papel";
                break;
            case TESOURA:
                escolha = "Tesoura";
                break;
            case LAGARTO:
                escolha = "Lagarto";
                break;
            case SPOCK:
                escolha = "Spock";
                break;
            default:
                escolha = "Opção inválida";
                break;
        }

        System.out.println(quem + " escolheu: " + escolha);
    }

    private static void exibirVencedor(int opcaoJogador, int opcaoCpu) {
        switch (opcaoJogador) {
            case PEDRA:
                switch (opcaoCpu) {
                    case PAPEL:
                        System.out.println("CPU venceu! Papel cobre Pedra.");
                        break;
                    case TESOURA:
                        System.out.println("Jogador venceu! Pedra amassa Tesoura.");
                        break;
                    case LAGARTO:
                        System.out.println("Jogador venceu! Pedra esmaga Lagarto.");
                        break;
                    case SPOCK:
                        System.out.println("CPU venceu! Spock vaporiza Pedra.");
                        break;
                    case PEDRA:
                        System.out.println("Empate! Ambos escolheram Pedra.");
                        break;
                }
                break;

            case PAPEL:
                switch (opcaoCpu) {
                    case TESOURA:
                        System.out.println("CPU venceu! Tesoura corta Papel.");
                        break;
                    case PEDRA:
                        System.out.println("Jogador venceu! Papel cobre Pedra.");
                        break;
                    case LAGARTO:
                        System.out.println("CPU venceu! Lagarto come Papel.");
                        break;
                    case SPOCK:
                        System.out.println("Jogador venceu! Papel refuta Spock.");
                        break;
                    case PAPEL:
                        System.out.println("Empate! Ambos escolheram Papel.");
                        break;
                }
                break;

            case TESOURA:
                switch (opcaoCpu) {
                    case PEDRA:
                        System.out.println("CPU venceu! Pedra amassa Tesoura.");
                        break;
                    case PAPEL:
                        System.out.println("Jogador venceu! Tesoura corta Papel.");
                        break;
                    case LAGARTO:
                        System.out.println("Jogador venceu! Tesoura decapita Lagarto.");
                        break;
                    case SPOCK:
                        System.out.println("CPU venceu! Spock esmaga Tesoura.");
                        break;
                    case TESOURA:
                        System.out.println("Empate! Ambos escolheram Tesoura.");
                        break;
                }
                break;

            case LAGARTO:
                switch (opcaoCpu) {
                    case PEDRA:
                        System.out.println("CPU venceu! Pedra esmaga Lagarto.");
                        break;
                    case PAPEL:
                        System.out.println("Jogador venceu! Papel cobre Lagarto.");
                        break;
                    case TESOURA:
                        System.out.println("CPU venceu! Tesoura decapita Lagarto.");
                        break;
                    case SPOCK:
                        System.out.println("Jogador venceu! Lagarto envenena Spock.");
                        break;
                    case LAGARTO:
                        System.out.println("Empate! Ambos escolheram Lagarto.");
                        break;
                }
                break;

            case SPOCK:
                switch (opcaoCpu) {
                    case PEDRA:
                        System.out.println("Jogador venceu! Spock vaporiza Pedra.");
                        break;
                    case PAPEL:
                        System.out.println("CPU venceu! Papel refuta Spock.");
                        break;
                    case TESOURA:
                        System.out.println("Jogador venceu! Spock esmaga Tesoura.");
                        break;
                    case LAGARTO:
                        System.out.println("CPU venceu! Lagarto envenena Spock.");
                        break;
                    case SPOCK:
                        System.out.println("Empate! Ambos escolheram Spock.");
                        break;
                }
                break;
        }
    }

}