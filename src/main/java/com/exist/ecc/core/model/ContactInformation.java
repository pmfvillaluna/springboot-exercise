package com.exist.ecc.core.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "contact_info")
public class ContactInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long Id;
    @Column()
    private String landline;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column
    private String email;
}
