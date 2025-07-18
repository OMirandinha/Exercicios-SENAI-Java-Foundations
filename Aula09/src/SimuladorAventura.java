import java.util.Random;

public class SimuladorAventura {
    public static void main(String[] args) {
        int saude = 100;
        int ouro = 10;
        Random random = new Random();

        for (int dia = 1; dia <= 7; dia++) {
            int evento = random.nextInt(4) + 1; // Gera número de 1 a 4
            System.out.println("\n--- Dia " + dia + " ---");

            switch (evento) {
                case 1:
                    // Evento 1: Ganha 10 de ouro
                    ouro += 10;
                    System.out.println("Encontrou uma bolsa de ouro! +10 ouro.");
                    break;

                case 2:
                    // Evento 2: Perde 15 de saúde
                    saude -= 15;
                    System.out.println("Foi atacado por um monstro fraco! -15 saúde.");
                    if (saude <= 0) {
                        System.out.println("O aventureiro morreu!");
                        System.out.println("Fim da jornada no dia " + dia + ".");
                        return; // Encerra a simulação
                    }
                    break;

                case 3:
                    // Evento 3: Ganha 20 de saúde, máximo 100
                    int cura = 20;
                    if (saude + cura > 100) {
                        cura = 100 - saude;
                    }
                    saude += cura;
                    System.out.println("Encontrou uma fonte mágica! +" + cura + " saúde.");
                    break;

                case 4:
                    // Evento 4: Perde todo o ouro
                    ouro = 0;
                    System.out.println("Foi assaltado em uma cidade. Perdeu todo o ouro.");
                    break;
            }

            // Exibe o status atual
            System.out.println("Status atual: Saúde = " + saude + ", Ouro = " + ouro);
        }

        // Mensagem final
        System.out.println("\n--- Fim da Jornada ---");
        System.out.println("Status final: Saúde = " + saude + ", Ouro = " + ouro);
    }
}