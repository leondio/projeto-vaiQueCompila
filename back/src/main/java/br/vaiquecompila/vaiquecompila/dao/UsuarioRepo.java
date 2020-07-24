package br.vaiquecompila.vaiquecompila.dao;

import org.springframework.data.repository.CrudRepository;

import br.vaiquecompila.vaiquecompila.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfAndSenha(String racf, String senha);
	public Usuario findByEmailOrRacf(String email, String racf);
	
}
