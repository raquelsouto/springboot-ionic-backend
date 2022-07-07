package com.raquelwinkeler.microsservicos.domain;

import com.raquelwinkeler.microsservicos.domain.enums.EstadoPagamento;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode
@Data
@NoArgsConstructor
public class PagamentoComBoleto extends Pagamento {

    private static final long serialVersionUID = 1L;
    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataPagamento, Date dataVencimento) {
        super(id, estado, pedido);
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

}
