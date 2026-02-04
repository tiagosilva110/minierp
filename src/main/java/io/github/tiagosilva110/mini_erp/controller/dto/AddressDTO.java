package io.github.tiagosilva110.mini_erp.controller.dto;

import java.util.UUID;

public record AddressDTO(
        UUID id,
        String cep,
        String country,
        String city,
        String district,
        String address,
        String complement
) {
}
