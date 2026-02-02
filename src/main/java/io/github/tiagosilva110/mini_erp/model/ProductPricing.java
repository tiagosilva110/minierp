package io.github.tiagosilva110.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "product_pricing")
@Getter
@Setter
public class ProductPricing {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "sell")
    private Integer sell;

}
