package Aula13;

public class ConfigJogo {
    private static String dificuldade = "Normal";
    private static int volumePrincipal = 50;
    private String nomeJogador;
    private int pontuacao = 0;

    public ConfigJogo(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public static void setDificuldade(String novaDificuldade) {
        dificuldade = novaDificuldade;
    }

    public static void aumentarVolume() {
        volumePrincipal += 10;
    }

    public void aumentarPontuacao() {
        pontuacao += 100;
    }

    public void exibirConfiguracoes() {
        System.out.println("Jogador: " + nomeJogador);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Volume: " + volumePrincipal);
    }
}