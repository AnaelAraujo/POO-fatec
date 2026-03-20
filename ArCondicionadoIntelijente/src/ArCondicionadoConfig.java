public class ArCondicionadoConfig {
    private String marca = "<Unknown>", modelo;
    private int temperatura;
    private boolean status;

    public ArCondicionadoConfig() {
    }

    public ArCondicionadoConfig(String marca, String modelo, int temperatura, boolean status) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.status = status;
    }

    //para ativar o modo turbo, o compressor deve dar true
    public void ativarModoTurbo() {
        if(this.status) {
            if (verificarCompressor()) {
                setTemperatura(16);
                System.out.println("Modo turbo ativado! (temperatura definida para 16)");
            } else {
                System.out.println("Falha no compressor; Não foi possível ativar o modo turbo.");
            }
        } else {
            System.out.println("o Ar condicionado deve estar ligado.");
        }
    }
    //chance de falhar
    private boolean verificarCompressor() {
        int numero = (int)(Math.random() * 5); // gera 0,1,2,3 ou 4

        if (numero > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String getMarca() {
       return this.marca;
    }

    public void setMarca(String marca) {
        if(this.marca.length() < 3) {
            System.out.println("A marca deve ter no mínimo 3 caracteres.");
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(int temperatura) {
        if(this.status) {
            if (temperatura >= 16 && temperatura <= 30) {
                this.temperatura = temperatura;
                System.out.println("A temperatura foi atualizada para " + this.temperatura);
            } else {
                System.out.println("temperatura fora da faixa.");
            }
        } else {
            System.out.println("o Ar condicionado deve estar ligado.");
        }
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        System.out.println("Os status do ar conicionado foi atualizado: " + (status ? "ligado" : "desligado"));
    }

    @Override
    public String toString() {
        return "Configs do ar condicionado: " +
                "\nmarca = " + this.marca +
                "\nmodelo = " + this.modelo +
                "\ntemperatura = " + this.temperatura +
                "\nstatus = " + (this.status ? "ligado" : "desligado");
    }
}
