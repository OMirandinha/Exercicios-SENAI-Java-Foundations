public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(" "," ", 0, 0);

        System.out.println("Digite o número da sua matrícula");
        aluno.setMatricula(aluno.matricula);

        System.out.println("Digite o seu nome");
        aluno.setNome(aluno.nome);

        System.out.println("Digite a 1° nota");
        aluno.setNota1(aluno.nota1);

        System.out.println("Digite a 2° nota");
        aluno.setNota2(aluno.nota2);

        aluno.exibirInfo();

    }
}
