package com.exist.ecc.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(name="street_number")
    private String streetNumber;
    @Column
    private String barangay;
    @Column
    private String municipality;
    @Column(name = "zip_code")
    private String zipCode;

}
