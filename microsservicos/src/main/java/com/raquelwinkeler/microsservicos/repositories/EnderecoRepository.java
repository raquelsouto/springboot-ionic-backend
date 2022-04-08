package com.raquelwinkeler.microsservicos.repositories;

import com.raquelwinkeler.microsservicos.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
