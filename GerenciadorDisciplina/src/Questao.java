public class Questao {
    private int numero;
    private float valor;
    private String enunciado;

    //Construtores -------------------------------------------------------------------------
    public Questao() {
    }

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "numero=" + numero +
                ", valor=" + valor +
                ", enunciado='" + enunciado + '\'' +
                '}';
    }
}
