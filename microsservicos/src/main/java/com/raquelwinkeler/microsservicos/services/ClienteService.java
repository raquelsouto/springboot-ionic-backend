package com.raquelwinkeler.microsservicos.services;

import com.raquelwinkeler.microsservicos.domain.Categoria;
import com.raquelwinkeler.microsservicos.domain.Cliente;
import com.raquelwinkeler.microsservicos.repositories.CategoriaRepository;
import com.raquelwinkeler.microsservicos.repositories.ClienteRepository;
import com.raquelwinkeler.microsservicos.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente find(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() ->
                new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo: " + Cliente.class.getName()));
    }
}

