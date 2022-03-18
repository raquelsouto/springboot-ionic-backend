package com.raquelwinkeler.microsservicos.controllers;

import com.raquelwinkeler.microsservicos.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raquelwinkeler.microsservicos.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value="/{id}")
    public ResponseEntity<Categoria> find(@PathVariable  Integer id) {
        Categoria obj = categoriaService.find(id);
        return ResponseEntity.ok().body(obj);
    }

}
