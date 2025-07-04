//Exemplo com ENTRADA DE DADOS (Scanner)

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Declaração da variável
        int numero;

        //Entrada de dados
        System.out.print("Digite um número inteiro: ");
        numero = ler.nextInt();

        //Saída de dados
        System.out.print("O valor da variável digitada é " + numero + ".");
    }
}
