import java.util.Arrays;

public class testaArCondicionado {
    public static void main(String[] args) {
        ArCondicionadoConfig ac1 = new ArCondicionadoConfig("sansung", "Ar condicionado", 23, true);
        System.out.println(ac1.toString());

        ac1.ativarModoTurbo();
        ac1.setStatus(false);
        System.out.println();
        ac1.setTemperatura(33);
        ac1.setTemperatura(18);
    }
}
