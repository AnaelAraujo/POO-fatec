import java.util.Arrays;
import java.util.Date;

public class TestaECommerce {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("6969697967", "Fulano", "Lá na Peida");
        CarrinhoCompra cc1 = new CarrinhoCompra(1, new Date(), cli1);
        System.out.println();
        Produto prod1 = new Produto(10, "Memória RAM", "16GB", 699);
        cc1.adcionaItemCarrinho(100, 3, prod1);
        Produto prod2 = new Produto(67, "Bandeclay", "Magenta", 1000);
        cc1.adcionaItemCarrinho(101, 5, prod2);


        System.out.println();
        System.out.println(cc1.toString());
        cc1.calculaTotalCompra();
    }
}