public class Placar {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa = 0, pontosVisitante = 0, periodoQuarto = 1;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;

    }

    public void registrarPonto (String time, int ponto) {
        if(ponto == 1) {
            System.out.println("Lance Livre! (+" + ponto + " para o time " + time + ")");
        } if(ponto == 2) {
            System.out.println("Cesta normal! (+" + ponto + " para o time " + time + ")");
        } if(ponto == 3) {
            System.out.println("Cesta de três! (+" + ponto + " para o time " + time + ")");
        } else {
            System.out.println("Impossível pontuar!");
        }

        if(this.nomeTimeCasa == time) {
            pontosCasa += ponto;
        }else if(this.nomeTimeVisitante == time) {
            pontosVisitante += ponto;
        } else {
            System.out.println("Insira um nome válido!");
        }
    }

    public void proximoQuarto() {
        this.periodoQuarto++;
        if(this.periodoQuarto > 4) {
            System.out.println("O jogo terminou!");
        } else {
            System.out.println("Próximo quarto! (" + this.periodoQuarto + ")");
        }
    }

    public String toString() {
        return nomeTimeCasa + " " + pontosCasa + " x " + pontosVisitante + " " + nomeTimeVisitante
                + " / período: " + periodoQuarto;
    }
}
