import java.util.Scanner;

public class TabuadaPersonalizada {
    public static void main(String[] args) {
        int valor, inicio, fim = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número a ser multiplicado");
        valor =  ler.nextInt();
        System.out.println("Onde a tabuada deve começar?");
        inicio = ler.nextInt();
        System.out.println("Qual será o últmo multiplicador?");
        fim = ler.nextInt();

        for (int i = inicio; i <=fim; i++){
            System.out.println(valor + " X " + i + " = " + valor * i);

        }
    }
}
