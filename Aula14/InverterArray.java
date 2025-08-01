package Aula14;

public class InverterArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        
        System.out.println("Array invertido:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
