package com.raquelwinkeler.microsservicos.controllers;

import com.raquelwinkeler.microsservicos.domain.Categoria;
import com.raquelwinkeler.microsservicos.domain.Cliente;
import com.raquelwinkeler.microsservicos.services.CategoriaService;
import com.raquelwinkeler.microsservicos.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value="/{id}")
    public ResponseEntity<Cliente> find(@PathVariable  Integer id) {
        Cliente objetoCliente = clienteService.find(id);
        return ResponseEntity.ok().body(objetoCliente);
    }

}
