package io.github.tiagosilva110.mini_erp.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "contact")
@Getter
@Setter
public class Contact {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "phone", length = 16)
    private String phone;

    @Column(name = "email", length = 64)
    private String email;

}
