package Aula14;

public class MaiorValorArray {
    public static void main(String[] args) {
        int[] numeros = {34, 12, 89, 54, 23, 76, 45};
        int maior = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println("O maior valor no array é: " + maior);
    }
}
