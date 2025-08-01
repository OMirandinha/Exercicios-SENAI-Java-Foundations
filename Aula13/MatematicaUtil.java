package Aula13;

public final class MatematicaUtil {
    public static final double PI = 3.14159;

    private MatematicaUtil() {
        // Construtor privado para impedir instanciação
    }

    public static double calcularAreaCirculo(double raio) {
        return PI * raio * raio;
    }

    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}