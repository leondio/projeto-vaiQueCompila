package br.vaiquecompila.vaiquecompila.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.vaiquecompila.vaiquecompila.model.Evento;

public interface EventoRepo extends CrudRepository<Evento,Integer>{
    List<Evento> findByDataevtBetween(Date dataInicio, Date dataFim);

    @Query(value = "select itmn_alarme.descricao, COUNT(itmn_alarme.id_alarme) as total from itmn_evento inner join itmn_alarme on itmn_evento.id_alarme = itmn_alarme.id_alarme where itmn_evento.data_evt between STR_TO_DATE(?1, '%Y-%m-%d') AND STR_TO_DATE(?2, '%Y-%m-%d') group by itmn_alarme.id_alarme;", nativeQuery = true)
    public List<?> buscarQtdAlarmesPeriodo(String dataInicio, String dataFim);

}