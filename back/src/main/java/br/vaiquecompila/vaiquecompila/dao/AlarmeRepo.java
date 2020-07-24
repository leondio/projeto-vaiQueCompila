package br.vaiquecompila.vaiquecompila.dao;

import org.springframework.data.repository.CrudRepository;

import br.vaiquecompila.vaiquecompila.model.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme,Integer>{
    
}