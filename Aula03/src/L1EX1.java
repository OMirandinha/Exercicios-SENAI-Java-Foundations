/*
Lista de exercícios 1 - Java Foundations
Data 04/07/2025

Exercício 1
Desenvolva a solução de um programa que leia duas notas e mprima a sua média aritmética.
Obs: Utilizar tipos de dados Double
 */

import java.text.DecimalFormat;
import java.util.Scanner;


public class L1EX1 {
    public static void main(String[] args) {

        //Instância do Scanner
        Scanner analise = new Scanner(System.in);

        //Instância do DecimalFormat
        DecimalFormat df = new DecimalFormat();

        System.out.println("Digite sua nota:");

        //Variáveis
        double nota1 = analise.nextDouble();
        double nota2 = analise.nextDouble();
        double media = (nota1 + nota2) / 2;

        //Mostra a nota
        System.out.println("Sua média na matéria é: " + df.format(media));
    }
}
