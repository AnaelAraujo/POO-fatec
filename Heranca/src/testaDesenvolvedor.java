import java.util.ArrayList;

public class testaDesenvolvedor {
    public static void exibeDados(Desenvolvedor walterWhite) {
        walterWhite.codar();
        System.out.println(walterWhite.toString() + "\nBônus " + walterWhite.calcularBonus());
    }
    public static void main(String[] args) {
        Junior jr = new Junior("Fulano", "Ciclano", "Java", 4000);
        exibeDados(jr);

        Pleno pl = new Pleno(8, "Deltrano", "Phyton", 6000);
        exibeDados(pl);

        Senior sr = new Senior(30000, "Fabiano", "JavaScript", 9000);
        exibeDados(sr);

        //vetor de desenvolvedores
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        //adicionar desenvolvedores no vetor
        desenvolvedores.add(jr);
        desenvolvedores.add(pl);
        desenvolvedores.add(sr);

    }
}