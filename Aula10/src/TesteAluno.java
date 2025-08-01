public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", "20240001");
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.3);
        aluno.adicionarNota(6.75);
        
        System.out.println("Média: " + aluno.getMediaFormatada());
        System.out.println("Situação: " + aluno.verificarSituacao());
    }
}