import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 123);
       // sem notas
        a1.calcularMedia();
        a1.verificarAprovacao();

        Professor prof = new Professor("Casimiro", "POO");
        prof.atribuirNota(a1, 8.0, 9.0);
     // com notas
        a1.calcularMedia();
        a1.verificarAprovacao();

        Turma cursoPOO = new Turma("ads", "Joao", "Maria");
        cursoPOO.listarAlunos();

        Escola escola = new Escola("Uninassau", "Boa viagem",
                "ads");

        escola.listarturmas();

        Disciplina poo = new Disciplina("POO", "classes", "casemiro",100);
        poo.mostrarConteudo();
    }
}