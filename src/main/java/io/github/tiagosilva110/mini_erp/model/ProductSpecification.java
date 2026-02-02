package io.github.tiagosilva110.mini_erp.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "product_specification")
@Getter
@Setter
public class ProductSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "specification", length = 64)
    private String specification;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "length")
    private Integer length;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "thickness")
    private Integer thickness;

    @Column(name = "diameter")
    private Integer diameter;

}
