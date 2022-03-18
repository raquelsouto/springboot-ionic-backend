package com.raquelwinkeler.microsservicos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raquelwinkeler.microsservicos.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {

    @GetMapping
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1, "informática");
        Categoria cat2 = new Categoria(2, "escritório");

        List<Categoria> listCategorias = new ArrayList<Categoria>();
        listCategorias.add(cat1);
        listCategorias.add(cat2);

        return listCategorias;
    }

}
