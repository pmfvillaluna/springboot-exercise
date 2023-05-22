package com.exist.ecc.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "names")
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String title;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")

    private String middleName;
    @Column(name = "last_name")

    private String lastName;
    @Column(name = "suffix")

    private String suffix;

}

