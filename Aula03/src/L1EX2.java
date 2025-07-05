/*
Exercício 2
Desenvolva a solução de um programa que leia um numero inteiro
e imprima seu dobro
 */

import java.util.Scanner;

public class L1EX2 {
    public static void main(String[] args) {
        //Instância do Scanner
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite um número ");

        //Lê o número e efetue o calculo para encontrar seu dobro
        int num = leitura.nextInt();
        int dobro = num * 2;

        //Mostra o resultado
        System.out.println("o dobro de " + num + " é " + dobro);
    }
}
