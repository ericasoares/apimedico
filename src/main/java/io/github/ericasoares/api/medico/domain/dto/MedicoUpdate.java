package io.github.ericasoares.api.medico.domain.dto;

import jakarta.validation.constraints.NotNull;

public record MedicoUpdate(
    @NotNull
    Long id,
    String nome,
    String telefone,
    EnderecoDto enderecoDto
) {
}
