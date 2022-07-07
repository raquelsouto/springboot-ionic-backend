package com.raquelwinkeler.microsservicos.domain.enums;

import lombok.Getter;

@Getter
public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    APROVADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private int codigo;
    private String descricao;

    private EstadoPagamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static EstadoPagamento toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if(cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido!");
    }

}
