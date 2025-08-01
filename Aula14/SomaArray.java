package Aula14;

public class SomaArray {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int soma = 0;
        
        for (int numero : numeros) {
            soma += numero;
        }
        
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}