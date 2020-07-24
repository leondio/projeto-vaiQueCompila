package br.vaiquecompila.vaiquecompila.service;

import java.util.List;

import br.vaiquecompila.vaiquecompila.model.Usuario;

public interface IUsuarioService {
    public Usuario loginPorEmailOuRacf(Usuario usuario);
    public List<Usuario> listarTodos();
}