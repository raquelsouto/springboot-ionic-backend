package com.raquelwinkeler.microsservicos.repositories;

import com.raquelwinkeler.microsservicos.domain.Cidade;
import com.raquelwinkeler.microsservicos.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
