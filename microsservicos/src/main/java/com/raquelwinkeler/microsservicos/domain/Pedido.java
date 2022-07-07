package com.raquelwinkeler.microsservicos.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Date instante;
    private Pagamento pagamento;
    private Cliente cliente;
    private Endereco enderecoDeEntrega;

}
