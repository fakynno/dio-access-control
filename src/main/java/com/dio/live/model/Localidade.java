package com.dio.live.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidade {

    private long id;

    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;

}
