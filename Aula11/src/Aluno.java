import java.util.Scanner;

public class Aluno {
    String matricula;
    String nome;
    double nota1;
    double nota2;

    Scanner Input = new Scanner(System.in);

    public Aluno(String matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        matricula = Input.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = Input.nextLine();
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        nota1 = Input.nextDouble();
        if(nota1 < 0 ||nota1 > 10)
            System.out.println("Nota inválida, digite um valor entre 0 e 10");
        else
            this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        nota2 = Input.nextDouble();
        if(nota2 < 0 || nota2 > 10)
            System.out.println("Nota inválida, digite um valor entre 0 e 10");
        else
            this.nota2 = nota2;
    }

    public double calcularMedia(double media){
        media = nota1 + nota2 / 2;
        return media;

    }

    public void exibirInfo(){
        System.out.println(this.matricula);
        System.out.println(this.nome);

    }
}
