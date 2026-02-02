package io.github.tiagosilva110.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "cpfcnpj", length = 20)
    private String cpfCnpj;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "fantasy_name", length = 64)
    private String fantasyName;

    @Column(name = "contact")
    private UUID contact;

    @Column(name = "adress")
    private UUID adress;

    @Column(name = "department")
    private UUID department;

    @Column(name = "is_suply")
    private Boolean isSuply;

    @Column(name = "is_client")
    private Boolean isClient;

    @Column(name = "is_employee")
    private Boolean isEmployee;

    @Column(name = "is_person")
    private Boolean isPerson;

    @Column(name = "enterprise")
    private UUID enterprise;

}
