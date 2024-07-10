package med.volt.api.domain.paciente;

import med.volt.api.direccion.Direccion;

public record DatosListadoPaciente(String nombre, String email, String telefono, String documentoIdentidad, Direccion direccion) {
    public DatosListadoPaciente(Paciente paciente) {
        this(paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getDocumentoIdentidad(), paciente.getDireccion());
    }
}