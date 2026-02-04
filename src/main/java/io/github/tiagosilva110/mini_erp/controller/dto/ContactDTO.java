package io.github.tiagosilva110.mini_erp.controller.dto;

import java.util.UUID;

public record ContactDTO(
        UUID id,
        String phone,
        String email
) {
}
