public class Carro {
    // atributos / propriedades (variáveis)
    public String marca, modelo, placa;
    public boolean motor = false; // true (ligado) ou false (desligado)
    public float velAtual = 0;
    // método construtor - tem o mesmo nome da classe
    public Carro(){

    }
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("Carro foi ligado");
        }
    }
    // desligar o carro
    public void desligar(){
        if (this.motor){
            this.motor = false;
            this.velAtual = 0;
            System.out.println("Carro foi desligado");
        }
    }
    //Alteradores de velocidade do carro
    public void acelerar(float acelerador) {
        if(this.motor) {
            this.velAtual += acelerador;
            System.out.println("A velocidade do carro foi aumentada: " + this.velAtual + "km/h");
        } else {
            System.out.println("O carro deve estar ligado!");
        }
    }
    public void frear(float freador) {
        if(this.motor) {
            if (this.velAtual < freador) {
                System.out.println("Impossível frear pro negativo!");
            } else {
                this.velAtual -= freador;
                System.out.println("A velocidade do carro foi diminuída: " + this.velAtual + "km/h");
            }
        } else {
            System.out.println("O Motor deve estar ligado!");

        }
    }

    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa objeto que chama o método
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Placa: " + this.placa +
                " Vel Atual: " + this.velAtual +
                " Motor: " + (this.motor ? "ligado": "desligado");
    }
}