public class Aluno {
    private String nome;
    private int matricula;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = null;
        this.nota2 = null;
    }

    public void calcularMedia() {
        if (nota1 == null || nota2 == null) {
            System.out.println("sem notas");
        } else {
            double media = (nota1 + nota2) / 2;
            System.out.println("sua media e " + media);
        }
    }

    public void verificarAprovacao() {
        if (nota1 == null || nota2 == null) {
            System.out.println("sem notas");
        } else {
            double media = (nota1 + nota2) / 2;
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}