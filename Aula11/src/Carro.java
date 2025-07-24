public class Carro {

    // 1. Atributos (Variáveis de Instância)
    String marca;
    String modelo;
    int ano;
    String cor;
    int velocidadeAtual;

    // 2. Método Construtor
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0; // Velocidade inicial é sempre 0
    }

    // 3. Métodos
    /**
     * Aumenta a velocidade atual do carro.
     * @param aumentoVelocidade O valor a ser somado à velocidade atual.
     */
    public void acelerar(int aumentoVelocidade) {
        if (aumentoVelocidade > 0) {
            this.velocidadeAtual += aumentoVelocidade;
            System.out.println("Acelerando... Nova velocidade: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("O aumento de velocidade deve ser um valor positivo.");
        }
    }

    /**
     * Reduz a velocidade atual do carro.
     * A velocidade nunca será menor que 0.
     * @param reducaoVelocidade O valor a ser subtraído da velocidade atual.
     */
    public void frear(int reducaoVelocidade) {
        if (reducaoVelocidade > 0) {
            this.velocidadeAtual -= reducaoVelocidade;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
            System.out.println("Freando... Nova velocidade: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("A redução de velocidade deve ser um valor positivo.");
        }
    }

    /**
     * Imprime no console todas as informações do carro.
     */
    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Carro ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
        System.out.println("--------------------------\n");
    }
}