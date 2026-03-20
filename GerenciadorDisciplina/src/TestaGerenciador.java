import java.util.ArrayList;
import java.util.Arrays;

public class TestaGerenciador {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Anael", "1090482513028", "ADS");
        Aluno a2 = new Aluno(2, "Biffe", "1090482614067", "ADS");

        Disciplina d1 = new Disciplina(1, "Programação Orientada a Objeto", "Daniel Facciolo");
        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        Avaliacao av = d1.criarAvaliacao(1, "Prova semestral");

        av.adicionarQuestao(1, "O que é encapsulamento em POO?", 3);
        av.adicionarQuestao(2, "Explique o que é Agregação.", 3);
        av.adicionarQuestao(3, "Explique o que é Composição.", 4);

        System.out.println(d1.toString());
    }
}
