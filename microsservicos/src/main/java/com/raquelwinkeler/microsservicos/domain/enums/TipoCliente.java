package com.raquelwinkeler.microsservicos.domain.enums;

import lombok.Getter;

@Getter
public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int codigo;
    private String descricao;

    private TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoCliente toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }

        for (TipoCliente x : TipoCliente.values()) {
            if(cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido!");
    }
}


