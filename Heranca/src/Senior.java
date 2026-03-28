public class Senior extends Desenvolvedor {
    private float verbaLider;

    public Senior() {
        super();
    }

    public Senior(float vervaLider, String nome, String linguagem, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = vervaLider;
    }

    public float getVervaLider() {
        return verbaLider;
    }

    public void setVervaLider(float vervaLider) {
        this.verbaLider = vervaLider;
    }

    @Override
    public void codar(){
        System.out.println("Sênior está definindo arquitetura e liderando pessoas...");
    }
    @Override
    public float calcularBonus() {
        return this.salarioBase * 0.30f;
    }


    @Override
    public String toString() {
        return "Senior:\n" +
                super.toString() +
                "\nverbaLider = " + verbaLider;
    }
}
