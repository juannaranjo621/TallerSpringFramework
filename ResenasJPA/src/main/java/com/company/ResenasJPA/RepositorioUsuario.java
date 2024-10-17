package com.company.ResenasJPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
    List<Usuario> findByApellido(String apellido);
    Usuario findById(long id);
}