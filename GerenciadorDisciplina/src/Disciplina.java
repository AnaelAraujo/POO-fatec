import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    public Avaliacao criarAvaliacao(int id, String nome) {
        Avaliacao a = new Avaliacao(id, nome);
        this.avaliacoes.add(a);
        return a;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina:" +
                "id = " + id +
                "nome = " + nome + '\n' +
                "professor = " + professor + '\n' +
                "\nalunos = " + Arrays.toString(alunos.toArray()) +
                "\navaliacoes = " + Arrays.toString(avaliacoes.toArray());
    }
}
