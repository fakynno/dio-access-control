package com.dio.live.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calendario {

    private long id;
    private String descricao;
    @ManyToOne
    private TipoData tipoData;
    private LocalDateTime dataEspecial;
}
