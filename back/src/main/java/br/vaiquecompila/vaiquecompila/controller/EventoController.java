package br.vaiquecompila.vaiquecompila.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.vaiquecompila.vaiquecompila.model.Evento;
import br.vaiquecompila.vaiquecompila.service.IEventoService;

@CrossOrigin(origins = "*")
@RestController
public class EventoController {

    @Autowired
    private IEventoService service;

    @PostMapping("/relEventos")
    public ResponseEntity<List<Evento>> entreDatas(@RequestBody ObjectNode json) throws ParseException {
        Date dataInicio = new SimpleDateFormat("yyyy-mm-dd").parse(json.get("dataInicio").asText());
        Date dataFim = new SimpleDateFormat("yyyy-mm-dd").parse(json.get("dataFim").asText());
        return ResponseEntity.ok(service.filtrarEntraDatas(dataInicio, dataFim));
    } 

    @PostMapping("/relAlarmes")
    public ResponseEntity<List<?>> entreDatasQtdAlarmes(@RequestBody ObjectNode json) throws ParseException {
        String dataInicio = json.get("dataInicio").asText();
        String dataFim = json.get("dataFim").asText();
        return ResponseEntity.ok(service.alarmesNoPeriodo(dataInicio, dataFim));
    }
}