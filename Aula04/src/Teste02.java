/*
EXEMPLO DESVIO CONDICIONAL COMPOSTO
 */

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa");
        int idade = ler.nextInt();

        //Desvio condicional composto
        if(idade >= 18)
            System.out.println("A pessoa é maior de idade");

         else
            System.out.println("A pessoa é menor de idade");

    }
}
