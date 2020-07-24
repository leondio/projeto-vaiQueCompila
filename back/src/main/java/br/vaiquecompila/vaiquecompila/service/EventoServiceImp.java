package br.vaiquecompila.vaiquecompila.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vaiquecompila.vaiquecompila.dao.EventoRepo;
import br.vaiquecompila.vaiquecompila.model.Evento;

@Component
public class EventoServiceImp implements IEventoService {

    @Autowired
    EventoRepo repo;

    @Override
    public List<Evento> filtrarEntraDatas(Date dataInicio, Date dataFim) {
        return (List<Evento>) repo.findByDataevtBetween(dataInicio, dataFim);
    }

    @Override
    public List<?> alarmesNoPeriodo(String dataInicio, String dataFim) {
        return (List<?>) repo.buscarQtdAlarmesPeriodo(dataInicio, dataFim);
    }
    
}