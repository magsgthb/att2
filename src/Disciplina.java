public class Disciplina {
    private String nome;
    private String conteudo;
    private String professor;
    private int cargaHoraria;

    public Disciplina(String nome, String conteudo, String professor, int cargaHoraria) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;

    }

    public void mostrarConteudo() {
        System.out.println("conteúdo da disciplina: " + conteudo);

    }
    }