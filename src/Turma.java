import java.util.ArrayList;
import java.util.List;
 // serie = curso
public class Turma {
    private String curso;
    private List<String> nomesAlunos;


    public Turma(String curso, String... nomes) {
        this.curso = curso;
        this.nomesAlunos = new ArrayList<>();
        for (String nome : nomes) {
            this.nomesAlunos.add(nome);
        }
    }

    public void listarAlunos() {
        if (nomesAlunos.isEmpty()) {
            System.out.println("nao ha alunos cadastrados no curso " + curso);
        } else {
            System.out.println("alunos de " + curso + ":");
            for (String nome : nomesAlunos) {
                System.out.println(nome);
            }
        }
    }



}
