package com.raquelwinkeler.microsservicos.controllers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msgError;
    private Long timeStamp;

}
