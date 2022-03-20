package com.raquelwinkeler.microsservicos.repositories;

import com.raquelwinkeler.microsservicos.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
