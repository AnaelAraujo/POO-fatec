package Classeassossiacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int numVoo;
    private String origem, destino;
    private LocalDateTime data; // esse aqui é de gozar

    public Voo() {
    }

    public Voo(int numVoo, String origem, String destino, LocalDateTime data) {
        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");
        return "Voo: " +
                "\nnumVoo = " + numVoo +
                "\norigem = " + origem +
                "\ndestino = " + destino +
                "\ndata = " + data.format(formatoBR);
    }
}
