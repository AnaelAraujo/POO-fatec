public class Conta {
    public String nomeCliente;
    public int numeroConta, agencia;
    public float saldo = 0;
    public boolean status = true;

    //criar conta bancária
    public Conta(String nomeCliente, int numeroConta, int agencia) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    //atualizações de conta
    public void encerrarConta() {
        if(this.saldo > 0) {
            System.out.println("Sua conta ainda possui saldo! Por favor, retire-o antes de fechar sua conta.");
        } else {
            this.status = false;
            System.out.println("A conta bancária de " + this.nomeCliente + " foi encerrada.");
        }
    }

    //depósitos e saques
    public void depositar(float valor) {
        if(this.status) {
            this.saldo += valor;
            System.out.println("O saldo foi atualizado: " + this.saldo + " (+" + valor + ")" );
        }
    }

    public void sacar(float valor) {
        if(this.status) {
            if(this.saldo < valor) {
                System.out.println("Saldo Insuficiente!");
            } else {
                this.saldo -= valor;
                System.out.println("O saldo foi atualizado: " + this.saldo + " (-" + valor + ")" );
            }
        }
    }

    public String toString(){ // converte objeto para String
        // this representa objeto que chama o método
        return "Número: " + this.numeroConta +
                " Agência: " + this.agencia +
                " Cliente: " + this.nomeCliente +
                " / Saldo atual: R$" + this.saldo +
                " status: " + (this.status ? "ativa": "encerrada");
    }
}