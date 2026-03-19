import java.util.ArrayList;
import java.util.Arrays;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao() {
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        this.questoes.add(q);
    }

    @Override
    public String toString() {
        return "Avaliacao: " +
                "id=" + id +
                ", nome='" + nome +
                "\nquestoes=" + Arrays.toString(questoes.toArray());
    }
}
