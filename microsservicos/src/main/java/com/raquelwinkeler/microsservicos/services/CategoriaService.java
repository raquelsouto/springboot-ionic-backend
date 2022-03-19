package com.raquelwinkeler.microsservicos.services;

import com.raquelwinkeler.microsservicos.domain.Categoria;
import com.raquelwinkeler.microsservicos.repositories.CategoriaRepository;
import com.raquelwinkeler.microsservicos.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria find(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() ->
                new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()));
    }
}

