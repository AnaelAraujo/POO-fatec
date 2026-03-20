import java.util.Arrays;

public class TestaPainelJogoBasquete {
    public static void main(String[] args) {
        Placar jogo1 = new Placar("casa", "visitante");
        jogo1.registrarPonto("casa", 2);
        jogo1.registrarPonto("visitante", 3);
        jogo1.registrarPonto("visitante", 2);
        jogo1.registrarPonto("casa", 2);

        System.out.println();
        System.out.println("Fim do quarto!");
        System.out.println(jogo1.toString());

        jogo1.proximoQuarto();

        jogo1.registrarPonto("casa", 3);
        jogo1.registrarPonto("visitante", 2);
        jogo1.registrarPonto("visitante", 2);
        jogo1.registrarPonto("casa", 3);

        System.out.println();
        System.out.println("Fim do quarto!");
        System.out.println(jogo1.toString());

        jogo1.proximoQuarto();

        jogo1.registrarPonto("visitante", 3);
        jogo1.registrarPonto("visitante", 2);

        System.out.println();
        System.out.println("Fim do quarto!");
        System.out.println(jogo1.toString());

        jogo1.proximoQuarto();

        jogo1.registrarPonto("casa", 3);
        jogo1.registrarPonto("casa", 2);

        System.out.println();
        System.out.println("Fim do quarto!");
        System.out.println(jogo1.toString());

        jogo1.proximoQuarto();
    }
}