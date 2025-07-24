public class Garagem {

    public static void main(String[] args) {
        // --- Exemplo de Uso da Classe Carro ---

        // 1. Criando um objeto (instância) da classe Carro
        // Isso chama o método construtor da classe Carro
        Carro meuFusca = new Carro("Volkswagen", "Fusca", 1975, "Azul");

        // 2. Exibindo as informações iniciais do carro
        meuFusca.exibirInformacoes();

        // 3. Acelerando o carro
        meuFusca.acelerar(40);
        meuFusca.acelerar(25);

        // 4. Exibindo as informações após acelerar
        meuFusca.exibirInformacoes();

        // 5. Freando o carro
        meuFusca.frear(30);

        // 6. Tentando frear mais do que a velocidade atual para testar a lógica
        meuFusca.frear(100);

        // 7. Exibindo as informações finais
        meuFusca.exibirInformacoes();

        // Criando outro carro para demonstrar a independência dos objetos
        Carro minhaFerrari = new Carro("Ferrari", "488 GTB", 2024, "Vermelho");
        minhaFerrari.exibirInformacoes();
        minhaFerrari.acelerar(200);
        minhaFerrari.exibirInformacoes();

        //Teste utilizando um 2° objeto
        Carro meuUno = new Carro ("Fiat", "Uno", 1984, "Vermelho");

        meuUno.exibirInformacoes();

        meuUno.acelerar(60);
        meuUno.frear(20);

        // 3° objeto

        Carro meuCamaro = new Carro ("Chevrolet", "Camaro", 2011,"Amarelo");

        meuCamaro.exibirInformacoes();

        meuCamaro.acelerar(144);
        meuCamaro.acelerar(256);
        meuCamaro.frear(120);

        meuCamaro.exibirInformacoes();
    }
}