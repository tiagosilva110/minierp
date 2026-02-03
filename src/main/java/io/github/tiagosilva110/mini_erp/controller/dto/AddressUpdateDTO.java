package io.github.tiagosilva110.mini_erp.controller.dto;

public record AddressUpdateDTO(
        String cep,
        String country,
        String city,
        String district,
        String address,
        String complement
) {
}
