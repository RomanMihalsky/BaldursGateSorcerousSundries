package com.mi4alsky.magicscrollshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Table(name = "magic_book")
@NoArgsConstructor
@AllArgsConstructor
public class MagicBook {

    @Id
    private Long id;

    private String serialNumber;

    private String spellName;

    private String typeSpell;

    private String description;

    private Integer numberOfPages;

    private Integer price;

    private Set<Author> authors;

}
