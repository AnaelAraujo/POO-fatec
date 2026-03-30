import java.util.ArrayList;
import java.util.Arrays;

public class testaDesenvolvedor {
    public static void exibeDados(Desenvolvedor walterWhite) {
        walterWhite.codar();
        System.out.println(walterWhite.toString() + "\nBônus " + walterWhite.calcularBonus());
    }
    public static void main(String[] args) {

        Desenvolvedor d1 = new Desenvolvedor("<Entidade>", "???", 99999.9f);

        Junior jr = new Junior("Fulano", "Ciclano", "Java", 4000);
        exibeDados(jr);

        Pleno pl = new Pleno(8, "Deltrano", "Phyton", 6000);
        exibeDados(pl);

        Senior sr = new Senior(30000, "Fabiano", "JavaScript", 9000);
        exibeDados(sr);

        System.out.println();
        //vetor de desenvolvedores
        Desenvolvedor[] devs = new Desenvolvedor[4];
        //adicionar desenvolvedores no vetor
        devs[0] = jr;
        devs[1] = pl;
        devs[2] = sr;
        devs[3] = d1;

        System.out.println("CHAMADO POR VETOR\n");

        for(Desenvolvedor d : devs) {
            d.codar();
            System.out.println();

            d.calcularBonus();
            System.out.println();

            System.out.println(d.toString());;
            System.out.println();
        }

    }
}