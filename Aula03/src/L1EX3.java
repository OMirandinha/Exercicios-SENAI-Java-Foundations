/*
Exercício 3
Desenvolva a solução de um programa que leia um número
inteiro e imprima o seu antecessor e sucessor
 */

import java.util.Scanner;

public class L1EX3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = ler.nextInt();

        //Identifica o antecessor e sucessor através de um calculo simples
        int antecessor = num - 1;
        int sucessor = num + 1;

        //saída dos valores no console
        System.out.println("você digitou " + num);
        System.out.println("Que tem antecessor " + antecessor + " e sucessor " + sucessor);
    }
}
