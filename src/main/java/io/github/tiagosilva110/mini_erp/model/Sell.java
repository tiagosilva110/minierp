package io.github.tiagosilva110.mini_erp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "sell")
@Getter
@Setter
public class Sell {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "person")
    private UUID person;

    @Column(name = "person")
    private Integer amount;

    @Column(name = "sell_date")
    @CreatedDate
    private LocalDateTime sellDate;

}
