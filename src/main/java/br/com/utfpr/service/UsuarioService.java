package br.com.utfpr.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



import br.com.utfpr.model.Usuario;
import br.com.utfpr.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private Usuario usuario;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	 private MultipartFile multipartFile;
	 
	private Part multipartFile1;
	
	public void salvar(Usuario usuario) {
		try {
			
			usuarioRepository.save(usuario);
		} catch (DataIntegrityViolationException  e) {
			throw new IllegalArgumentException("Formato de data inválido");
		}
	}

	public void excluir(Long codigo) {
		usuarioRepository.deleteById(codigo);
	}

	
	
	
	
	public List<Usuario> listar() {
		List<Usuario> listar = (List<Usuario>) usuarioRepository.findAll();
		return listar;
	}
	
	
	
    
    
   
	
	
}
