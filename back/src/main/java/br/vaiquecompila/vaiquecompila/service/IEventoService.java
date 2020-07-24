package br.vaiquecompila.vaiquecompila.service;

import java.util.Date;
import java.util.List;

import br.vaiquecompila.vaiquecompila.model.Evento;

public interface IEventoService {
    public List<Evento> filtrarEntraDatas(Date dataInicio, Date dataFim);
    public List<?> alarmesNoPeriodo(String dataInicio, String dataFim);
}