package Aula12;

public class Retangulo {
    private double base;
    private double altura;

    // Construtor padrão (quadrado unitário)
    public Retangulo() {
        this.base = 1.0;
        this.altura = 1.0;
    }

    // Construtor para quadrado
    public Retangulo(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    // Construtor completo
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular área
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Método para verificar se é quadrado
    public boolean isQuadrado() {
        return base == altura;
    }

    // Método para exibir valores
    public void exibirValores() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}