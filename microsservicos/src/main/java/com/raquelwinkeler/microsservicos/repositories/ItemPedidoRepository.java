package com.raquelwinkeler.microsservicos.repositories;

import com.raquelwinkeler.microsservicos.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
