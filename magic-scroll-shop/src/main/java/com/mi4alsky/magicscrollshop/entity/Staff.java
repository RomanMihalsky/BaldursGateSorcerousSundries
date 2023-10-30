package com.mi4alsky.magicscrollshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@Table(name = "staff")
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "staff_seq")
    @SequenceGenerator(name = "staff_seq", sequenceName = "staff_seq", allocationSize = 1)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @UuidGenerator(style = UuidGenerator.Style.TIME)
    @GeneratedValue
    @Column(name = "uid")
    private String uid;

    @Embedded
    private FullName fullName;
}
