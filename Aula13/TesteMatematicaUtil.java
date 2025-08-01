package Aula13;

public class TesteMatematicaUtil {
    public static void main(String[] args) {
        // Tentativa de instanciação (deve gerar erro de compilação)
        // MatematicaUtil math = new MatematicaUtil();

        // Teste dos métodos estáticos
        System.out.println("Área do círculo (raio=5): " + MatematicaUtil.calcularAreaCirculo(5));
        System.out.println("2 elevado a 5: " + MatematicaUtil.calcularPotencia(2, 5));
        System.out.println("4 é par? " + MatematicaUtil.ehPar(4));
        System.out.println("7 é par? " + MatematicaUtil.ehPar(7));
    }
}