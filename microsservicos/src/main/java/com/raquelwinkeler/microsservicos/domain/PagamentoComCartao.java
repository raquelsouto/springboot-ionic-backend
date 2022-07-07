package com.raquelwinkeler.microsservicos.domain;

import com.raquelwinkeler.microsservicos.domain.enums.EstadoPagamento;
import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@Data
@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;
    private int numeroDeParcelas;

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, int numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
