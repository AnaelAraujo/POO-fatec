import java.util.Arrays;

public class TestaBanco {
    public static void main(String[] args) {
        Conta c1 = new Conta("João Silva", 1, 1);
        System.out.println(c1.toString());
        System.out.println();
        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.toString());

        Conta c2 = new Conta("Maria Souza", 2, 6767);
        System.out.println(c2.toString());
        System.out.println();
        c2.sacar(50);
        System.out.println(c2.toString());
        System.out.println();

        c1.sacar(300);
        c1.encerrarConta();
    }
}