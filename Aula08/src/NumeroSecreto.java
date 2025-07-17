import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente;

        System.out.println("--- Jogo: Adivinhe o Número Secreto ---");

        do {
            System.out.print("Qual o valor máximo para esta partida? ");
            int possibilidades = leitura.nextInt();
            int numeroSecreto = random.nextInt(possibilidades) + 1;

            int palpite = 0;
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("Tente adivinhar o número que eu escolhi entre 1 e " + possibilidades + ".");
            System.out.println("Você tem 10 tentativas");

            while (!acertou && tentativas <=10) {
                System.out.print("Digite seu palpite: ");
                palpite = leitura.nextInt();
                tentativas++;

                if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é MAIOR.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é MENOR.");
                } else {
                    acertou = true;
                    System.out.println("\nParabéns! Você acertou o número secreto!");
                    System.out.println("O número era: " + numeroSecreto);
                    System.out.println("Você precisou de " + tentativas + " tentativa(s).");
                }
            } System.out.println("Suas tentativas acabaram");

            System.out.print("Gostaria de jogar novamente? (s/n): ");
            String resposta = leitura.next();
            jogarNovamente = resposta.equalsIgnoreCase("s");

        } while (jogarNovamente);

        System.out.println("Obrigado por jogar!");
        leitura.close();
    }
}