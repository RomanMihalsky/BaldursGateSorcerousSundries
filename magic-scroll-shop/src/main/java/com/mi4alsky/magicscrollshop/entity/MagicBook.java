package com.mi4alsky.magicscrollshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "magic_book")
@NoArgsConstructor
@AllArgsConstructor
public class MagicBook {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "magic_book_seq")
    @SequenceGenerator(name = "magic_book_seq", sequenceName = "magic_book_seq", allocationSize = 1)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "spell_name")
    private String spellName;

    @Column(name = "type_spell")
    private String typeSpell;

    @Column(name = "description")
    private String description;

    @Column(name = "number_of_pages")
    private Integer numberOfPages;

    @Column(name = "price")
    private Integer price;

    @Column(name = "deleted")
    private LocalDateTime deleted;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable( name = "magic_book_author",
            joinColumns = {@JoinColumn(name = "magic_book_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id",referencedColumnName = "id")})
    private Set<Author> authors;

}
