package Aula13;

public class TesteConfig {
    public static void main(String[] args) {
        ConfigJogo jogador1 = new ConfigJogo("Ana");
        ConfigJogo jogador2 = new ConfigJogo("Carlos");

        // Exibir configurações iniciais
        System.out.println("Configurações iniciais:");
        jogador1.exibirConfiguracoes();
        jogador2.exibirConfiguracoes();

        // Alterar configurações globais
        ConfigJogo.setDificuldade("Difícil");
        ConfigJogo.aumentarVolume();

        // Alterar pontuações individuais
        jogador1.aumentarPontuacao();
        jogador1.aumentarPontuacao();
        jogador2.aumentarPontuacao();

        // Exibir configurações finais
        System.out.println("\nConfigurações finais:");
        jogador1.exibirConfiguracoes();
        jogador2.exibirConfiguracoes();
    }
}