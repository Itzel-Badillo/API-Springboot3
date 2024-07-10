package med.volt.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.volt.api.domain.consulta.AgendaDeConsultaService;
import med.volt.api.domain.consulta.DatosAgendarConsulta;
import med.volt.api.domain.consulta.DatosDetalladoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultaService service;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DatosAgendarConsulta datos){
        service.agendar(datos);
        return ResponseEntity.ok(new DatosDetalladoConsulta(null, null, null, null));
    }
}
