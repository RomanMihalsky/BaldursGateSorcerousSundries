package com.mi4alsky.magicscrollshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "uid", columnDefinition = "serial")
    private String uid;

    @Embedded
    private FullName fullName;
}
