package com.raquelwinkeler.microsservicos;

import com.raquelwinkeler.microsservicos.domain.Categoria;
import com.raquelwinkeler.microsservicos.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class MicrosservicosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MicrosservicosApplication.class, args);
    }

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
    }
}
