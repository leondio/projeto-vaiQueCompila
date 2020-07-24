package br.vaiquecompila.vaiquecompila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.vaiquecompila.vaiquecompila.model.Usuario;
import br.vaiquecompila.vaiquecompila.service.IUsuarioService;

@CrossOrigin(origins = "*")
@RestController
public class UsuarioController {

	@Autowired
	private IUsuarioService service;

	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario userIncomplete) {
		Usuario userFinded = service.loginPorEmailOuRacf(userIncomplete);
		if (userFinded != null) {
			return ResponseEntity.ok(userFinded);
		}
		return ResponseEntity.status(404).build(); // usuário não existe
	}

	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> listarTodos(){
		return ResponseEntity.ok(service.listarTodos());
	}
}
