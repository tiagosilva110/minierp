package io.github.tiagosilva110.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;


@Entity
@Table(name = "adress")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "cep", length = 8)
    private String cep;

    @Column(name = "country", length = 32)
    private String country;

    @Column(name = "district", length = 32)
    private String district;

    @Column(name = "adress", length = 128)
    private String adress;

    @Column(name = "complement", length = 64)
    private String complement;

}
