import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    // Adiciona uma nota
    public void adicionarNota(double nota) {
        if (nota >= 0) {
            notas.add(nota);
        }
    }

    // Calcula a média (sem formatação)
    public double calcularMedia() {
        if (notas.isEmpty()) return 0.0;
        
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    // Retorna a média formatada com 2 casas decimais
    public String getMediaFormatada() {
        return String.format("%.2f", calcularMedia());
    }

    // Verifica situação
    public String verificarSituacao() {
        return calcularMedia() >= 7.0 ? "Aprovado" : "Reprovado";
    }

    // Getters básicos
    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public ArrayList<Double> getNotas() { return new ArrayList<>(notas); }
}