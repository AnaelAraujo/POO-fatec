public class Pleno extends Desenvolvedor {
    private int projEntr;

    public Pleno() {
        super();
    }

    public Pleno(int projEntr, String nome, String linguagem, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }
    @Override
    public void codar(){
        System.out.println("Pleno está criando código e fazendo code Review...");
    }
    @Override
    public float calcularBonus() {
        return this.salarioBase * 0.15f;
    }


    @Override
    public String toString() {
        return "Pleno:\n" +
                super.toString() +
                "\nprojEntr = " + projEntr;
    }
}
