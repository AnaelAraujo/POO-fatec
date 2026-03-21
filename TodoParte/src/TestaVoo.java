import Classeassossiacao.Passageiro;
import Classeassossiacao.Reserva;
import Classeassossiacao.Voo;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestaVoo {
  public static void main(String[] args) {
    Passageiro p1 = new Passageiro("67676769667", "Kleiton");
    LocalDateTime data1 = LocalDateTime.of(2026, 7, 15, 13, 10);
    Voo v1 = new Voo(67, "Bahia", "Conchinchina", data1);
    Reserva re1 = new Reserva(67, 67, data1, p1, v1);

    System.out.println(re1.toString());
  }
}