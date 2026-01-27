package io.github.tiagosilva110.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
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

    @Column(name = "isperson", nullable = false)
    private boolean isPerson;

    @Column(name = "cpfcnpj", length = 14)
    private String cpfCnpj;

    @Column(name = "name", length = 60, nullable = false)
    private String name;

    @Column(name = "fantasy_name", length = 60)
    private String fantasyName;

    @Column(name = "department")
    private int department;

    @Column(name = "phone", length = 11)
    private String phone;

    @Column(name = "email", length = 60)
    private String email;

    @Column(name = "district", length = 30)
    private String district;

    @Column(name = "city", length = 30)
    private String city;

    @Column(name = "country", length = 30)
    private String country;

    @Column(name = "cep", length = 8)
    private String cep;

    @Column(name = "adress", length = 60)
    private String adress;

    @Column(name = "complement", length = 30)
    private String complement;

    @Column(name = "state_reg", length = 20)
    private String stateReg;

    @Column(name = "issuply")
    private boolean isSuply;

    @Column(name = "isclient")
    private boolean isClient;

    @Column(name = "isemployee")
    private boolean isEmployee;

    @CreatedDate
    @Column(name = "timestamp_reg")
    private LocalDateTime timestampReg;

    @Column(name = "enterprise", nullable = false)
    private UUID enterprise;

}
