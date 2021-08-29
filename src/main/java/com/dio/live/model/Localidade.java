package com.dio.live.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidade {

    private long id;
    private String descricao;

    @ManyToOne
    private NivelAcesso nivelAcesso;

}
