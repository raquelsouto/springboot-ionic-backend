package com.raquelwinkeler.microsservicos.domain;

import com.raquelwinkeler.microsservicos.domain.enums.EstadoPagamento;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private EstadoPagamento estado;
    private Pedido pedido;

}
