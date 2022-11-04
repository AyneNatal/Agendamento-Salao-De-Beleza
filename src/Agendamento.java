import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    public static String realizarAgendamento (Servico servico, Profissional profissional, Cliente cliente, LocalDate data, LocalTime hora) {
        return String.format("<< Serviço *%s* marcado >>%nDia: %s | Hora: %s%nCliente: %s%nProfissional: %s", servico.getTipo(), data, hora, cliente.getNome(), profissional.getNome());
    }

}
