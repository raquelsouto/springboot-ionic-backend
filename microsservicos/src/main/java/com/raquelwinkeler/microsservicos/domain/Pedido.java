package com.raquelwinkeler.microsservicos.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date instante;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pedido")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="endereco_de_entrega_id")
    private Endereco enderecoDeEntrega;

    @OneToMany(mappedBy="id.pedido")
    private Set<ItemPedido> itens = new HashSet<>();

    public Pedido(Integer id, Date instante, Cliente cliente, Endereco enderecoDeEntrega) {
        this.id = id;
        this.instante = instante;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

}
