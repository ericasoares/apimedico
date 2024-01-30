package io.github.ericasoares.api.medico.domain.dto;

import io.github.ericasoares.api.medico.enums.Especialidade;
import io.github.ericasoares.api.medico.domain.Medico;

public record MedicoOutBound(
    Long id,
    String nome,
    String email,
    String crm,
    Especialidade especialidade
) {

    public MedicoOutBound(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
