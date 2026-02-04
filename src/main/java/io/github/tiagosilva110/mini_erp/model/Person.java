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



    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contact")
    private Contact contact;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "adress")
    private Address address;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "department")
    private Department department;

    @Column(name = "is_supply")
    private Boolean isSupply;



    @Column(name = "is_client")
    private Boolean isClient;

    @Column(name = "is_employee")
    private Boolean isEmployee;

    @Column(name = "is_person")
    private Boolean isPerson;



    @Column(name = "enterprise")
    private UUID enterprise;

}
