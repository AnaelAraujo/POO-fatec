import java.util.Arrays;

public class testaDrone {
    public static void main(String[] args) {
        DroneInteligente d1 = new DroneInteligente("676767", 100, 67, false);
        d1.decolar();

        System.out.println(d1.toString());

        d1.subir(20);

        d1.subir(67);
        d1.descer(30);

        d1.descer(68);
    }
}
