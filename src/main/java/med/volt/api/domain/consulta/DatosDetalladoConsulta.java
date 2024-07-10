package med.volt.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosDetalladoConsulta(Long id, Long idPaciente, Long idMedico, LocalDateTime fecha) {
}
