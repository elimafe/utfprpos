package br.com.utfrp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.utfpr.model.Usuario;
import br.com.utfpr.repository.UsuarioRepository;

@RestController("/login")
public class UsuarioController {
	


	
	@PostMapping
	public void cadastrar(@RequestBody Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	
	@PutMapping
    public void atualizar(@RequestBody Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	
	
	@PutMapping
    public void buscar(@PathVariable Long id) {
		
		usuarioRepository.findById(id);
	}
	
	@DeleteMapping
    public void remover(@PathVariable Long id) {
		
		usuarioRepository.deleteById(id);
	}
	
	
}
