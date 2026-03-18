public class DroneInteligente {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public DroneInteligente() {
    }

    public DroneInteligente(String codigo, float altura, int bateria, boolean emVoo) {
        this.codigo = codigo;
        this.altura = altura;
        this.bateria = bateria;
        this.emVoo = emVoo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(this.bateria > 0) {
            if (altura < 0 || altura > 120) {
                System.out.println("Altura fora do padrão do drone!");
            } else {
                this.altura = altura;
            }
        } else {
            System.out.println("O drone está descarregado.");
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if(bateria < 0 || bateria > 100) {
            System.out.println("bateria inválida. Uma bateria só pode ter carga entre 0 a 100.");
        } else {
            this.bateria = bateria;
            System.out.println("Sua bateria foi definida. bateria = " + this.bateria);
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void subir(float altura) {
        float novaAltura = this.altura + altura;
        setAltura(novaAltura);
        if(novaAltura <= 120) {
            System.out.println("seu drone subiu! altura atual = " + this.altura);
        }
    }
    public void descer(float altura) {
        float novaAltura = this.altura - altura;
        setAltura(novaAltura);
        if(novaAltura >= 0) {
            System.out.println("seu drone desceu! altura atual  = " + this.altura);
        }
    }

    public void decolar() {
        if(this.bateria < 20) {
            System.out.println("bateria insuficiente para decolar!");
        } else {
            if(testarMotores()) {
                this.emVoo = true;
                this.altura = 2;
                System.out.println("seu drone decolou! (altura definida para " + this.altura + " metros)");
            }
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices... ");
        System.out.println("Calibrando GPS... ");

        int num = (int) (Math.random() * 10);

        if(num < 8) {
            System.out.println("motores prontos!");
            return true;
        } else {
            System.out.println("falha nos motores.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Drone Inteligente: " +
                "\ncodigo = " + this.codigo +
                "\naltura = " + this.altura +
                "\nbateria = " + this.bateria +
                "\nstatus = " + (this.emVoo ? "voando" : "parado");
    }
}
