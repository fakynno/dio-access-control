package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;
    @ManyToOne
    private LocalDateTime dataTrabalhada;
    private BigDecimal qtdHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;
}
