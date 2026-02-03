package io.github.tiagosilva110.mini_erp.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ContactCreateDTO(
        @NotBlank String phone,
        @Email String email
) {
}
