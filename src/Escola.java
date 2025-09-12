import java.util.ArrayList;
import java.util.List;
// turma = curso
public class Escola {
    private String nome;
    private String endereco;
    private List<String> turmas;


    public Escola(String nome, String endereco, String... turmas) {
        this.nome = nome;
        this.endereco = endereco;
        this.turmas = new ArrayList<>();
        for (String turma : turmas) {
            this.turmas.add(turma);
        }
    }

    public void listarturmas() {
        if (turmas.isEmpty()) {
            System.out.println("não possui turmas");
        } else {
            System.out.println("turmas da " + nome + ":");
            for (String turma : turmas) {
                System.out.println(turma);
            }
        }
    }
    }
