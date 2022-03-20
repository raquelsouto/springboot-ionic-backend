package com.raquelwinkeler.microsservicos;

import com.raquelwinkeler.microsservicos.domain.Categoria;
import com.raquelwinkeler.microsservicos.domain.Cidade;
import com.raquelwinkeler.microsservicos.domain.Estado;
import com.raquelwinkeler.microsservicos.domain.Produto;
import com.raquelwinkeler.microsservicos.repositories.CategoriaRepository;
import com.raquelwinkeler.microsservicos.repositories.CidadeRepository;
import com.raquelwinkeler.microsservicos.repositories.EstadoRepository;
import com.raquelwinkeler.microsservicos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class MicrosservicosApplication implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    CidadeRepository cidadeRepository;

    @Autowired
    EstadoRepository estadoRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicrosservicosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");

        Produto p1 = new Produto(null, "computador", 5000);
        Produto p2 = new Produto(null, "Impressora", 800);
        Produto p3 = new Produto(null, "Mouse", 80);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "São Paulo");

        Cidade cid1 = new Cidade(null, "Pirapora", est1);
        Cidade cid2 = new Cidade(null, "São Paulo", est2);
        Cidade cid3 = new Cidade(null, "Campinas", est2);

        est1.getCidades().addAll(Arrays.asList(cid1));
        est2.getCidades().addAll(Arrays.asList(cid2, cid3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
        
    }
}
