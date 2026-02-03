package io.github.tiagosilva110.mini_erp.controller.dto;

public record AddressDTO(
        String cep,
        String country,
        String city,
        String district,
        String address,
        String complement
) {
}
