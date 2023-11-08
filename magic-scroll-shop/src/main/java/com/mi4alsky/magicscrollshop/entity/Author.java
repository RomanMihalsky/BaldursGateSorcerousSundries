package com.mi4alsky.magicscrollshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "author")
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    @SequenceGenerator(name = "author_seq", sequenceName = "author_seq", allocationSize = 1)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name="uid")
    private String uid;

    @Column(name = "deleted")
    private LocalDateTime deleted;

    @Embedded
    private FullName fullName;

    @ManyToMany(mappedBy = "authors",fetch = FetchType.LAZY)
    private Set<MagicBook> magicBooks;

    @ManyToMany(mappedBy = "authors",fetch = FetchType.LAZY)
    private Set<MagicScroll> magicScrolls;

}
