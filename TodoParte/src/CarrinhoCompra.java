import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itensCarrinho;
    float total = 0;
    // cu


    public CarrinhoCompra() {
        this.itensCarrinho = new ArrayList<>();
    }

    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensCarrinho = new ArrayList<>();
    }
    //adicionar itens do carrinho no carrinho
    public void adcionaItemCarrinho(int id, float qtde, Produto produto) {
        ItemCarrinho aux = new ItemCarrinho(id, qtde, produto);
        this.itensCarrinho.add(aux);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    //é agregação = Cliente é Independente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void calculaTotalCompra() {
        float valorTotal = 0;
        for(ItemCarrinho aux: this.itensCarrinho){
            valorTotal += aux.getQtde() * aux.getProduto().getPreco();
        }
        System.out.println("Valor total da compra: R$" + valorTotal);
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", cliente= \n" + cliente +
                ", Itens do carrinho= \n" + itensCarrinho +
                '}';
    }
}
