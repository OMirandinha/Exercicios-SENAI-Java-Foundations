public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int velocidadeAtual = 0;

    public Carro(String marca, String modelo, String cor, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeAtual = 0;

    }
    public void acelerar (int aumentoVelocidade){
        this.velocidadeAtual += aumentoVelocidade;
    }

    public void frear(int reducaoVelocidade){
        this.velocidadeAtual -= reducaoVelocidade;
            if (this.velocidadeAtual < 0);
                this.velocidadeAtual = 0;
    }

    public void exibirInformacoes(){
        System.out.println("Marca " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Ano " + ano);
        System.out.println("cor " + cor);
        System.out.println("Velocidade Atual " + velocidadeAtual);
    }


}
