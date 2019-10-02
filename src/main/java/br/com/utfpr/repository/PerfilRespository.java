package br.com.utfpr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.utfpr.model.Perfil;

@Repository
@Transactional
public interface PerfilRespository extends CrudRepository<Perfil, Long> {

}
