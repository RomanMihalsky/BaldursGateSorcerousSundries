package com.mi4alsky.magicscrollshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class FullName {

    @NotBlank
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Size(min = 1)
    @Column(name = "middle_name")
    private String middleName;

    @NotBlank
    @Column(name = "last_name", nullable = false)
    private String lastName;
}
