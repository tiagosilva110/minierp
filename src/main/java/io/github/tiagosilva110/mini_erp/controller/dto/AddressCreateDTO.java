package io.github.tiagosilva110.mini_erp.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record AddressCreateDTO(
        @NotBlank String cep,
        String country,
        String city,
        String district,
        String address,
        String complement
) {
}
