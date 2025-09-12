public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void atribuirNota(Aluno aluno, double nota1, double nota2) {
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        System.out.println("Professor " + nome + " atribuiu notas a " + aluno.getNome());
    }
}