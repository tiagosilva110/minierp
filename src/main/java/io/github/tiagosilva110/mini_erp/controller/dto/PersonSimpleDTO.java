package io.github.tiagosilva110.mini_erp.controller.dto;

import java.util.UUID;

public record PersonSimpleDTO(
        UUID id,
        String name,
        String cpfCnpj,
        Boolean isClient,
        Boolean isSuply,
        Boolean isEmployee
) {
}
