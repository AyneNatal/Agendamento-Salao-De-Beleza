import java.time.LocalDate;
import java.time.LocalTime;

public class SalaoDeBeleza {
    public static void main(String[] args) {
        System.out.println(Agendamento.realizarAgendamento(new Servico("Luzes"), new Profissional("Elisangela Duarte"), new Cliente("Márcia Siqueira"), LocalDate.of(2022,11,10), LocalTime.of(13,0)));
    }
}
