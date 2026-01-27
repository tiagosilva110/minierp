package io.github.tiagosilva110.mini_erp.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", length = 60, nullable = false)
    private UUID name;

    @Column(name = "fantasy_name", length = 60)
    private UUID fantasyName;

    @Column(name = "cost_value_ref", precision = 18, scale = 5)
    private BigDecimal costValueRef;

    @Column(name = "sell_value", precision = 18, scale = 5)
    private BigDecimal sellValue;

    @Column(name = "tax", precision = 18, scale = 5)
    private BigDecimal tax;

    @Column(name = "profit", precision = 18, scale = 5)
    private BigDecimal profit;

    @Column(name = "weight", precision = 18, scale = 5)
    private BigDecimal weight;

    @Column(name = "rating", length = 20)
    private String rating;

    @Column(name = "widht", precision = 18, scale = 5)
    private BigDecimal widht;

    @Column(name = "thickness", precision = 18, scale = 5)
    private BigDecimal thickness;

    @Column(name = "diameter", precision = 18, scale = 5)
    private BigDecimal diameter;

    @Column(name = "isprimaryresource")
    private boolean isPrimaryResource;

    @Column(name = "ispacking")
    private boolean isPacking;

    @Column(name = "issellproduct")
    private boolean isSellProduct;

    @CreatedDate
    @Column(name = "timestamp_reg")
    private LocalDateTime timestampReg;

    @Column(name = "enterprise", nullable = false)
    private UUID enterprise;

}
